package Programs_Interview_questions.Fibonacci;

import java.util.Scanner;

/**
 * Created by sami on 9/22/17.
 */
public class Fibonacci_scanner {

    public static void main(String[] args) {

        int p, a = 1, b = 1;

        Scanner sc = new Scanner(System.in);


        p = 0;

        System.out.println("enter number");

        int n = sc.nextInt();



        while (p <= 1000000) {

            System.out.println(p);

            p = a + b;

            if (p >= n) {
                break;

            }

            a = b;
            b = p;




        }


    }

}
