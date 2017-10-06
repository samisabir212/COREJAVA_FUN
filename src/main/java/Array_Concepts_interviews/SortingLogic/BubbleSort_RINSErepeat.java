package Array_Concepts_interviews.SortingLogic;

/**
 * Created by sami on 10/4/17.
 */
public class BubbleSort_RINSErepeat {


    public static void dobubblesort(int array[]) {

        int temp;

        for(int i = 0; i< array.length;i++) {
            for (int j = i+1; j<array.length; i++) {
                if (array[i] > array[j]) {
                    temp = array[i];
                    array[j] = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }

            printSortedarray(array);

        }
    }


    public static void printSortedarray(int[] input) {

        for (int i = 0; i < input.length; i++) {

            System.out.println(input[i]);

        }

    }


    public static void main(String[] args) {

        int arrayList[] = {10, 2, 1, 6, 5};

        dobubblesort(arrayList);



    }
}
