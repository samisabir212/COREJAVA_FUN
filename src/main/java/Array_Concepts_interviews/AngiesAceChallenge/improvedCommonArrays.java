package Array_Concepts_interviews.AngiesAceChallenge;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by sami on 10/12/17.
 */
public class improvedCommonArrays {


    /*
    * hash table stores unique keys
    * we can transfer everything from a1 to a2
    * this is O of 1 work
    * then we can loop through a2
    * the loops are o of n work
    * this is faster
    * foing from O of n Squared to O of n which is fair time
    * */


    /*
    THE FIRST LOOP
    * inserted all of array a content into the map (using put a[i])
    * used value field to store how many times that character appears in array a
    *
    *
    *
    THE SECOND LOOP
    iterating through array b to determine what is common ... (pay attention to the counts)
    if we find a character from array b inside of array a then print it and decrement the occurences
    if its the last occurence in the map then we remove it from the map
    * */


    public static void main(String[] args) {

        String array1[] = {"a","b"};
        String array2[] = {"a", "b", "c"};

        printDups(array1, array2);

    }


    public static void printDups(String a[], String b[]) {

        //create a hash map call it aMap it holds character as key and integer as value
        Map aMap = new HashMap<Character, Integer>();

        for (int i = 0; i < a.length; i++) {
            if (!aMap.containsKey(a[i])) {
                aMap.put(a[i], 1);

            } else {

                aMap.put(a[i], (Integer) aMap.get(a[i]) + 1);

            }
        }


        for (int i = 0; i < b.length; i++) {
            if (aMap.containsKey(b[i])) {
                System.out.println(b[i]);
                if ((Integer) aMap.get(b[i]) == 1) {
                    aMap.remove(b[i]);
                }
                else{
                    aMap.put(b[i], (Integer) aMap.get(b[i]) - 1);

                }
            }
        }

    }
}
