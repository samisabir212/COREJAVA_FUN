package Array_Concepts_interviews.PyramidAlgo;

/**
 * Created by sami on 10/5/17.
 */
public class Pyramid_NoAnotations {


    public static void main(String[] args) {


        int counter = 1;

        for (int i = 0; i<10;i++) {

            for (int j = 1; j<10-i; j++) {

                System.out.print(counter);


                counter++;

            }

            System.out.print("\t");
            System.out.println( "");
        }

    }
}
