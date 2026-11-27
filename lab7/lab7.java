package lab7;
import java.util.Scanner;

public class lab7 {

    static String VALID_DOMAIN = "bmsce.ac.in";
    static String NEW_DOMAIN = "cse.bmsce.ac.in";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student email address: ");
        String rawEmail = sc.nextLine();

        String email = rawEmail.trim();
        System.out.println("\n[Trim] Trimmed email: \"" + email + "\"");

        System.out.println("[Length] Entered (untrimmed): " + rawEmail.length()
                + ", after trimming: " + email.length());

        int atIndex = email.indexOf('@');
        
        String username = email.substring(0, atIndex);
        String domain = email.substring(atIndex + 1);
        System.out.println("[Username] " + username);
        System.out.println("[Domain] " + domain);

        if (domain.equalsIgnoreCase(VALID_DOMAIN)) {
            System.out.println("[Domain check] Domain matches \"" + VALID_DOMAIN
                    + "\". Email belongs to the institution.");
        } else {
            System.out.println("[Domain check] Domain does NOT match \"" + VALID_DOMAIN
                    + "\". Email does not belong to the institution.");
        }

        String lower = email.toLowerCase();
        System.out.println("[Lowercase] " + lower);

        System.out.print("\nEnter prefix to check (e.g., registration number): ");
        String prefix = sc.nextLine().trim();
        if (lower.startsWith(prefix.toLowerCase())) {
            System.out.println("[Prefix] Email starts with \"" + prefix + "\".");
        } else {
            System.out.println("[Prefix] Email does NOT start with \"" + prefix + "\".");
        }

        if (lower.endsWith(VALID_DOMAIN)) {
            System.out.println("[EndsWith] Email ends with \"" + VALID_DOMAIN + "\".");
        } else {
            System.out.println("[EndsWith] Email does NOT end with \"" + VALID_DOMAIN + "\".");
        }

        if (lower.endsWith("@" + VALID_DOMAIN)) {
            String updated = lower.substring(0, lower.length() - VALID_DOMAIN.length()) + NEW_DOMAIN;
            System.out.println("[Replace] Updated email: " + updated);
        } else {
            System.out.println("[Replace] Domain \"" + VALID_DOMAIN
                    + "\" not found at the end; no replacement done.");
        }

        System.out.print("\nEnter a character or sequence to search for (e.g., cse, 2025): ");
        String seq = sc.nextLine().trim();
        if (lower.contains(seq.toLowerCase())) {
            System.out.println("[Contains] Email contains \"" + seq + "\".");
        } else {
            System.out.println("[Contains] Email does NOT contain \"" + seq + "\".");
        }

        System.out.print("\nEnter first email to compare: ");
        String e1 = sc.nextLine().trim();
        System.out.print("Enter second email to compare: ");
        String e2 = sc.nextLine().trim();
        if (e1.equalsIgnoreCase(e2)) {
            System.out.println("[Compare] The two email addresses are identical (ignoring case).");
        } else {
            System.out.println("[Compare] The two email addresses are different.");
        }

        sc.close();
        System.out.println("\nKN Sarvesh Kumar\n1WN25CS104");
    }
}
