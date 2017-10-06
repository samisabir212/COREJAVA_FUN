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
        * matrix array
        *
        * you want to traverse throught the columns and rows
        *
        * outer loop for the row|inner loop for the column
        *
        *                   1           2           3           */
        int abc[][] = {{2, 4, 5}, {3, 4, 7}, {1, 2, 9}};


        for (int i = 0; i < 3; i++) {

            for (int j=0; j< 3;j++) {

                System.out.print(abc[i][j]);


            }
        }

    }



}
