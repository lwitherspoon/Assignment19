import java.util.ArrayList;

/**
 * CSC201 - Assignment 19.3<br />
 * Write the following method that returns a new ArrayList.<br />
 * The new list contains the non-duplicate elements from the original list.<br />
 * public static ArrayList<E> removeDuplicates(ArrayList<E> list)
 *
 * @author Laura Witherspoon
 */

public class Main {

    public static void main(String[] args) {
        // Create a String array list
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("String #1");
        stringList.add("String #2");
        stringList.add("String #2");
        stringList.add("String #3");
        stringList.add("String #1");
        stringList.add("String #4");

        System.out.println(removeDuplicates(stringList));

        // Create an Integer array list
        ArrayList<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(2);
        integerList.add(3);
        integerList.add(1);
        integerList.add(4);

        System.out.println(removeDuplicates(integerList));
    }

    /**
     * Removes duplicates from given array list
     * @param list Array list of generic type E
     * @return A new list containing the non-duplicate elements from the original list
     */
    public static <E> ArrayList removeDuplicates(ArrayList<E> list) {

        ArrayList<E> newList = new ArrayList<>();

        for (E e : list) {
            if (!newList.contains(e)) {
                newList.add(e);
            }
        }

        return newList;
    }
}
