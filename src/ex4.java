import java.util.Scanner;
public class ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("enter any number: ");
        int num = input.nextInt();
        int sum =0;

        for (int j =1 ; j <= num; j++) {
            sum = sum + j;

        }
        System.out.println(sum);


        }
}
