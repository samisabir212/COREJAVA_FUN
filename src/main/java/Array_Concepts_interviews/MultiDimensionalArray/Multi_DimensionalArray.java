package Array_Concepts_interviews.MultiDimensionalArray;

/**
 * Created by sami on 9/28/17.
 */
public class Multi_DimensionalArray {


    public static void main(String[] args) {

        /*

        MATRIX IMAGINE EXCEL DATA SHEET

        * 2 4 5
        * 3 4 7
        * 5 2 1

        iterate through the list of columns and rows
        you want to travers all three columns to read the data in each row of the column

        how do you loop through the columns and rows?

        use loop within loop nested loop

        use i and j

        * */


        int a[][] = new int[2][3];


        a[0][0] = 2;
        a[0][1] = 4;
        a[0][2] = 5;
        a[1][0] = 3;
        a[1][1] = 4;
        a[1][2] = 7;


        for (int i = 0; i <= 2; i++) {//row


            for (int j = 0; j<=3; j++) {//column

                System.out.println(a[i][j]);


            }


        }


        System.out.println(a[2][3]);





    }


}
