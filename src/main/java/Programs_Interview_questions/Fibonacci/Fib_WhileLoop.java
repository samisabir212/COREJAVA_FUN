package Programs_Interview_questions.Fibonacci;

/**
 * Created by sami on 9/22/17.
 */
public class Fib_WhileLoop {


    public static void main(String[] args) {

        int p, a = 1, b = 1;

        p = 0;


        while (p <= 1000000) {

            System.out.println(p);

            p = a + b;

            a = b;
            b = p;




        }


    }
}
