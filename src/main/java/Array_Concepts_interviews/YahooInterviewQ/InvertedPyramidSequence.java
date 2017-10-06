package Array_Concepts_interviews.YahooInterviewQ;

/**
 * Created by sami on 10/5/17.
 */
public class InvertedPyramidSequence {

/*
* print a pyramid that has a rever sequence like below example

1
2 3
4 5 6
7 8 9 10



* */


    public static void main(String[] args) {

        int counter = 1; //this increments 4 times line 30 increments it
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i;j++) { // is grows as the loop continues until i is not less than or equal to 4

                System.out.print(counter); //notice that we are not using printline
                System.out.print("\t"); //notice that we are not using printline
                counter++;

            }

            System.out.println( "");
        }


        //print in this fashion
        /*
        * 1
        * 12
        * 123
        * 1234
        * 12345
        * */

        System.out.println("\n");


        int k = 1; //this increments 4 times line 30 increments it
        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= i;j++) { // is grows as the loop continues until i is not less than or equal to 4

                System.out.print(j); //notice that we are not using printline
                System.out.print("\t"); //notice that we are not using printline
                //k++;

            }

            System.out.println( "");
        }


    }
}
