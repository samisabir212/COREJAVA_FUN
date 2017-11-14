package Array_Concepts_interviews.SortingLogic;

/**
 * Created by sami on 10/5/17.
 */
public class SortingArray {


    public static void main(String[] args) {


        int arrayNumbers[] = {6, 4, 1, 5, 2, 3};


        sortMyBubblearray(arrayNumbers);

    }




    public static void sortMyBubblearray(int array[]) {

/*      we want to sort the array in order.
        how?
        check the first number and the number next to it on the right.
        if i(first number to left) is greater than j(second number to the right) than swap the numbers and go on to the
        next number and the if i<j than swap until the array numbers are sorted
*/

        /*
        1- intialize temp
        2- create a nested loop i and j to array.length
        3- inner loop j is set to i plus 1 because we are checking the next number after i
        4- check if array of position i is greater than array of position j
        5- store # j of the array to temp
        6- swap a.i = a.j
        7- swap a.j = a.i
        8- give a.j = temp

        9-method for printing the sorted array
        10-

        * */


        int temp;
        for (int i = 0; i < array.length; i++) {

            for(int j = i+1; j < array.length;j++) {

                if (array[i] > array[j]) {


                    //like a sandwish of temp i and j switched
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = array[i];
                    array[j] = temp;


                }


            }

        }
        printSortedArray(array);

    }

    public static void printSortedArray(int input[]) {

        for (int i = 0; i < input.length; i ++) {

            System.out.print(input[i] + ",");

            //System.out.print("\n");

        }
    }










}
