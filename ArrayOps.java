public class ArrayOps {
    public static void main(String[] args) {
        
    }
    
    public static int findMissingInt (int [] array) {

        // Declare variables
        int actual_sum = 0;
        int sum_expected = 0;
        int diff = 0;

        // Calculate the expected sum
        for (int j = 0; j < array.length + 1; j++) {
            sum_expected += j;
        }
        
        // Calculate the actual sum
        for (int i = 0; i < array.length; i++) {
            actual_sum += array[i];
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
        }

        else {
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
        boolean check = false;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    check = true;
                }
            }
            if (!check) {
                return false;
            }
            check = false;
        }

        for (int j = 0; j < array2.length; j++) {
            for (int i = 0; i < array2.length; i++) {
                if (array1[i] == array2[j]) {
                    check = true;
                }
            }
            if (!check) {
                return false;
            }
            check = false;
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

        if (increasing) {
            return true;
        }

        if (decreasing) {
            return true;
        }
        return false;
    }

}
