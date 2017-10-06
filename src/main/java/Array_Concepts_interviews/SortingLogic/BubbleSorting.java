package Array_Concepts_interviews.SortingLogic;

/**
 * Created by sami on 10/2/17.
 */
public class BubbleSorting {


    public static void doBubbleSort(int array[]) {
        int temp;

        for (int i = 0; i< array.length;i++) {

            for (int j = i+1; j< array.length; j++) { //j has to be one step above i at all times....  i + 1

                if (array[i] > array[j]) {
                    temp = array[i]; //setting i to temp
                    array[i] = array[j]; //this is a swap
                    array[j] = array[i]; //this is a swap again
                    array[j] = temp;




                }
            }
            System.out.println("after: --- " + i + "---iteration");
            printArray(array);
        }

    }


    public static void printArray(int[] input) {

        for (int i = 0; i<input.length;i++) {
            System.out.println(input[i] + ",");

        }

        System.out.println("\n");

    }


    public static void main(String[] args) {

        int array[] = {5, 6, 9, 11, 3, 2};
        System.out.println("original array---{5,6,9,11,3,2} ");

        doBubbleSort(array);


    }
}
