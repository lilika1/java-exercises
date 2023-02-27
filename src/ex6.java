import java.util.Scanner;
public class ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //int pnum = 0;
        int psum = 0;
        int avg = 0;
        int nsum = 0;
        int ncount=0;


        for (int i = 1; i < 10; i++) {
            System.out.print("enter integers:" + i +":");
            int num = input.nextInt();

            if (num > 0) {
                psum += num;
            } else {
                ncount++;
                nsum += num;

                avg = nsum / ncount;

            }


        }
        System.out.print("posit sum is:" + psum +  "\n"+ "negat avg is:"+avg);

    }
}
