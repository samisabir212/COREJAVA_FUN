package Array_Concepts_interviews.PyramidAlgo;

/**
 * Created by sami on 10/5/17.
 */
public class Pyramid001 {


    /*
    you must analayze how you will reach the destination
    you must speak it out loud
    problem solve by speaking out loud
    * */
    public static void main(String[] args) {


        /*
        * create a counter
        * bringing out a seperate variable and printing it out after each iteration in the inner loop
        * how do pint everything in one line?
        * */

        ///System.out.println(); <--- notice that it says println and not print
        //this means its printing a new line
        //use sout.print not sout.println

        int k = 1; //counter
        for (int i =0; i<10; i++) {


            for (int j = 1; j<10-i;j++) {
                /*
                * notice abovee
                * that to make the iteration create a pyramid from greatest to
                * least you have to subtract i to 10   j<10-i
                * as i increments j decrements the amount of i
                *
                * */

               // System.out.println(j);
                System.out.print("\t");//<--gives space between the end of the line.
             //   System.out.println("\n"); <-- prints a new line after the previous printed line
                System.out.print(k);
                k++;
            }

            //outerloop create a an empty space
            System.out.println( "");



        }
    }
}
