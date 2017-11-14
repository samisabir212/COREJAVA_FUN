package Array_Concepts_interviews.CommonElement_InArray;

/**
 * Created by sami on 10/3/17.
 */
public class CommonElementInArray {

    public int[] array1;
    private int[] array2;


    public static void main(String[] args) {

        //this array creations takes way too long...
        CommonElementInArray commonElementTest = new CommonElementInArray();
        commonElementTest.array1 = new int[]{2,3,20,55,10};
        commonElementTest.array2 = new int[]{21,22,2,3,10,32};

        System.out.println(commonElementTest.array1[0]);



        int[] arr1 = {2, 3, 20, 55, 10};
        int[] arr2 = {21, 22, 2, 3, 10, 32};


        //i will check then j will run through the whole array2 from 0 to the end of the array
        //to check if 0 element of array 1 is common to one of the elements in array 2
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println("arr1 : " + arr1[i] + " is common to " + " arr2 : " + arr2[j]);
                }
            }
            System.out.println(" this is iteration : " + i);

        }




    }



    //this is an insufficent way of doing things when comparing array elements.
    public void compareElements() {

        CommonElementInArray commonElementTest = new CommonElementInArray();
        if (commonElementTest.array1[0] == commonElementTest.array2[2] && commonElementTest.array1[1] ==
                commonElementTest.array2[3] && commonElementTest.array1[4] == commonElementTest.array2[4]) {

            System.out.println("common elements found... this is the extremely long way of doing it.");
        }else{
            System.out.println("common elements not found");

        }
    }



    /*
    * create the arrays
    * create a for loop to check if array 1 has common elements with array 2
    * write a if else statement to check commonality
    * print out which elements are common in the arrays
    *
    * */
}
