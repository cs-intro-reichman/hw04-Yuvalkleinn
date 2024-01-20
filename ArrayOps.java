public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {

        // Declare variables
        int actual_sum = 0;
        int sum_expected = array.length;
        int diff = 0;

        // #feedback: could be calculated within same loop
        for (int i = 0; i < array.length; i++) {
            actual_sum += array[i];
            sum_expected += i;
        }

        diff = sum_expected - actual_sum;

        return diff;
    }

    public static int secondMaxValue(int [] array) {
        int max = 0;
        int second_max = 0;

        if (array[0] >= array[1]) {
            max = array[0];
            second_max = array[1];
        } else {
            max = array[1];
            second_max = array[0];
        }

        for (int i = 2; i<array.length; i++) {
            if (array[i] > second_max && array[i] < max) {
                second_max = array[i];
            }
            
            if (array[i] >= max) {
                second_max = max;
                max = array[i];
            }
        }

        return second_max;
    }

    public static boolean containsTheSameElements(int [] array1,int [] array2) {
        // #feedback: duplication of code is always bad idea - let's take the same logic outo side function
        return isSubset(array1, array2) && isSubset(array2, array1);
    }

    public static boolean isSubset(int[] subset, int[] array) {
        boolean check = false;
        
        for (int i = 0; i < subset.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (subset[i] == array[j]) {
                    check = true;
                }
            }
            if (!check) {
                return false;
            }
        }

        return true;
    }

    public static boolean isSorted(int [] array) {
        boolean increasing = true;
        boolean decreasing = true;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array [i+1]) {
                decreasing = false;
            }

            if (array[i] < array [i+1]) {
                increasing = false;
            }
        }

        // #feedback: could be minimized to this line
        return increasing || decreasing;
    }

}
