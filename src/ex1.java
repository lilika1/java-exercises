
import java.util.Scanner;
public class ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num1;
        int num2;
        int num3;
        double avg;

        System.out.print("enter 1st num: ");
        num1 = input.nextInt();

        System.out.print("enter 2nd num: ");
        num2 = input.nextInt();

        System.out.print("enter 3rd num: ");
        num3 = input.nextInt();

        avg = (num1+num2+num3)/3;

        System.out.printf("average is %f%", avg);


    }
}
