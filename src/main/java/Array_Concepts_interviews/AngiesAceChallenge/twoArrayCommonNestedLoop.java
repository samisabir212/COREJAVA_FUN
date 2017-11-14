package Array_Concepts_interviews.AngiesAceChallenge;

/**
 * Created by sami on 10/12/17.
 */
public class twoArrayCommonNestedLoop {


/* avoid doing nested loops because it is O(N^2)-
*
*
performance will deteriorate in direct proportion of 2 times the data set

nested loops.
N^2  is for 2 nested loops
N^3  is for 3 nested loops

how can you improve from this loop?
this takes o of n squered work and it wont work in the case i have duplicates and one array that doesnt
appear in the other

* */


    public static void main(String[] args) {

        // which given string objects are common in arrays a1 and a2

        /*
        * when comparing two arrays the first array is i the outer loop
        * the second array is the inner loop j
        * */
        String a1[] = {"a", "b", "c", "e"};
        String a2[] = {"b", "c", "d", "f"};

        //expected result {b and c}

        for (int i = 0; i < a1.length; i++) {

            for(int j = 0; j < a2.length; j++) {
                if (a1[i] == a2[j]) {
                    System.out.println("found a match :: " + a1[i]);
                }
            }
        }


    }




}
