package Array_Concepts_interviews.SortingLogic;

/**
 * Created by sami on 10/2/17.
 */


public class BubbleSortAlgo2 {




    public static void doBubblesort(int array[]) {

        int temp;

        for (int i = 0; i< array.length; i++) {
            for (int j = 0 + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = array[i];
                    array[j] = temp;

                }
            }

            printArrayBubbleSort(array);

        }

    }

    public static void printArrayBubbleSort(int[] input) { //input which is array

        for (int i = 0; i<input.length;i++) {
            System.out.println(input[i]);
        }


        System.out.println("\n");

    }



    public static void main(String[] args) {

        int arrayBubbleSort[] = {9, 2, 11, 1, 3, 4};


        doBubblesort(arrayBubbleSort);









    }

}
