import java.util.Scanner;
class student
{
    int usn;
    String name;
    student(){}
    student(int u,String n)
    {
        usn=u;
        name=n;
    }
    void accept_details()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter usn : ");
        usn=sc.nextInt();
        sc.nextLine();
        System.out.println("enter name : ");
        name=sc.nextLine();
        
    }
    void display_details(){
        System.out.println("the name of the student is "+name+"\nthe usn of the student is "+usn);
    }
}
public class lab1{
    public static void main( String args [])
    {
        System.out.println("enter the number of students: ");
        Scanner s=new Scanner(System.in);
        int x= s.nextInt();
        student[] students=new student[x];
        for (int i = 0; i < x; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            students[i] = new student(); // Instantiate each object
            students[i].accept_details();
         }
          System.out.println("\n--- Student Information ---");
        s.close();
        
        System.out.println("----------------------------------------");
        for (int i = 0; i < x; i++) {
            System.out.println("student "+(i+1));
            students[i].display_details();
        }
        System.out.println("\nKN Sarvesh Kumar\n1WN25CS104");

}
 
 
}