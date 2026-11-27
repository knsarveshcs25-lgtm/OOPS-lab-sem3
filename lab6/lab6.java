package lab6;
import java.util.InputMismatchException;
import java.util.Scanner;

class SeatAlreadyBookedException extends Exception {
    public SeatAlreadyBookedException(String message) {
        super(message);
    }
}

class Reservation {
    private String trainName;
    private boolean[] seats=new boolean[10];

    public Reservation(String trainName) {
        this.trainName = trainName;
    }

    public void reserveSeat(int seatNumber) throws SeatAlreadyBookedException {
        if (seatNumber < 1 || seatNumber > 10) {
            throw new IllegalArgumentException(
                "Invalid seat number! Please enter a seat between 1 and " + 10 + "."
            );
        }

        if (seats[seatNumber - 1]) {
            throw new SeatAlreadyBookedException(
                "Seat No. " + seatNumber + " on " + trainName + " is already booked!"
            );
        }

        seats[seatNumber - 1] = true;
        System.out.println("Success! Seat No. " + seatNumber + " has been reserved on " + trainName + ".");
    }

    
}

public class lab6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reservation train = new Reservation("Mysuru Express");
        String choice;

        do {
            
            boolean isSuccess = false;

            try {
                System.out.print("Enter seat number to reserve (1-10): ");
                int seatNo = scanner.nextInt();
                train.reserveSeat(seatNo);
                isSuccess = true;
            } catch (InputMismatchException e) {
                System.out.println("Input Error: Invalid user input! Please enter a valid integer.");
                scanner.nextLine();
            } catch (IllegalArgumentException e) {
                System.out.println("Range Error: " + e.getMessage());
            } catch (SeatAlreadyBookedException e) {
                System.out.println("Booking Error: " + e.getMessage());
            } finally {
                if (isSuccess) {
                    System.out.println("Transaction Status: Completed successfully.");
                } else {
                    System.out.println("Transaction Status: Terminated without reservation.");
                }
            }

            System.out.print("\nDo you want to make another booking? (y/n): ");
            choice = scanner.next();
        } while (choice.equalsIgnoreCase("y"));

        System.out.println("thank you for using the railway reservation management system.");
        scanner.close();
        System.out.println("\nKN Sarvesh Kumar\n1WN25CS104");
    }
}


