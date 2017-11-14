package Array_Concepts_interviews.Print_Smallest_Num_InterviewQ;

/**
 * Created by sami on 9/28/17.
 */
public class Print_Min_number {

    /*

    get the minumum number of matrix

    2 4 5
    3 4 7
    1 2 9

    print min # from above matrix

    * */


    public static void main(String[] args) {

        /*
        * abc[row][column]
        *
        * matrix array of
        *
        * 2 4 5
        * 3 4 7
        * 1 2 9
        *
        * you want to traverse through the columns and rows
        *
        * outer loop for the row|inner loop for the column
        *
        *                   1           2           3           */
        int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};

        /*
        * the loop will run through the second for loop until j is greater than 3
        * it will then go back to the first loop and go to the next iteration
        * the cycle continues until i is greater than 3
        *           because we only have 3 integers in each array set
        * */

        for (int i = 0; i < 3; i++) {

            for (int j=0; j< 3;j++) {

                System.out.print(abc[i][j]);


            }
        }

    }



}
