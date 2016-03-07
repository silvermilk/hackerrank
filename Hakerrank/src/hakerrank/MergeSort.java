package hakerrank;

import java.util.Arrays;

/**
 *
 * @author Nastya
 */
public class MergeSort {
    
    public static void main(String args[]) {
        int [] hello = {15,6,434,23,8,45,688,34,7};
        System.out.println(Arrays.toString(sort(hello)));
    }
    
    private static int[] merge (int[] array1, int[] array2) {
        int [] result = new int[array1.length + array2.length];
        int a = 0, b = 0;
        for (int i = 0; i < result.length; i++) {
            if (a < array1.length && b < array2.length) {
                if (array1[a] < array2 [b]) {
                    result[i] = array1[a++];
                } else {
                    result[i] = array2 [b++];
                }
            } else if (a < array1.length) {
                result[i] = array1[a++];
            } else {
                result[i] = array2 [b++];
            }
        }
        return result;
    }
    
    private static int[] sort (int[] array) {
        int [] result;
        if(array.length < 2) {
            result = array;
        } else {
            int middle = array.length / 2;
            int [] left = sort(Arrays.copyOfRange(array, 0, middle));
            int [] right = sort(Arrays.copyOfRange(array, middle, array.length));
            result = merge (left,right);
        }
        return result;
    }
    
}
