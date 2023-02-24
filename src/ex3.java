import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // ssssss
        System.out.print("enter your first name: ");
        String fn = input.nextLine().trim();

        System.out.print("enter your last name: ");
        String ln = input.nextLine().trim();

        char fin= fn.charAt(0);
        char lin= ln.charAt(0);
            // change
        String initials =("" + fin + lin);


        System.out.println(initials);



    }
}
