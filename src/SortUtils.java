import java.util.ArrayList;
/** Static methods for aiding in the creation of sorting algorithms */
public class SortUtils {
    private static int memAccess = 0;
    private static int comparisons = 0;


    public static int getMemAccess() {
        return memAccess;
    }
    public static void setMemAccess(int memAccess) {
        SortUtils.memAccess = memAccess;
    }
    public static int getComparisons() {
        return comparisons;
    }
    public static void setComparisons(int comparisons) {
        SortUtils.comparisons = comparisons;
    }
    /**
     * Checks if an array of integers is non-descending order
     */
    public static boolean isSorted(ArrayList<Integer> intArr) {
        for (int i = 0; i < intArr.size() - 1; i++) {
            if (intArr.get(i) > (intArr.get(i + 1))) {
                return false;
            }
        }
        return true;
    }

    /**
     * Write a similar isSorted for ArrayList of String as the parameter
     */
    public static boolean isSortedStr(ArrayList<String> strArr) {
        for (int i = 0; i < strArr.size() - 1; i++) {
            if (strArr.get(i).compareTo(strArr.get(i + 1)) >= 1) {
                return false;
            }
        }
        return true;
    }
/*
Create a random array of Integers of a given length:
Create a random ArrayList of Integers of a given length.
Create a random array of Strings of a given length.
Create a random ArrayList of Strings of a given length.
*/
    public static Integer[] randomIntArr(int length) {
        Integer[] random = new Integer[length];
        for (int i = 0; i < length; i++) {
            random[i] = (int) (Math.random() * 100);
        }
        return random;
    }

    public static String[] randomStrArr(int length) {
        String[] random = new String[length];

        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * 26);
            random[i] = "abcdefghijklmnopqrstuvwxyz".substring(rand, rand + 1);
        }
        return random;
    }

    public static ArrayList<Integer> randomIntAL(int length) {
        ArrayList<Integer> random = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * 100);
            random.add(rand);
        }
        return random;
    }

    public static ArrayList<String> randomStrAL(int length) {
        ArrayList<String> random = new ArrayList<>();
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * 26);
            random.add("abcdefghijklmnopqrstuvwxyz".substring(rand, rand + 1));
        }
        return random;
    }


    public static void selectionSort(int[] element)
    {
        for(int i = 0; i< element.length-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < element.length; j++) {
                if (element[j] < (element[minIndex])) {
                    minIndex = j;
                }
            }
            if (i != minIndex) {
                int temp = element[i];
                element[i] = element[minIndex];
                element[minIndex] = temp;
            }
        }
    }
}