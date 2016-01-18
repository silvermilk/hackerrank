package hakerrank;

import java.io.IOException;
import java.util.Scanner;

public class Java1DArray {
    public static void main(String[] args) throws IOException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0 ; i < array.length; i++ ) {
           array[i] = scanner.nextInt();
        }
        
        
        int count = 0;
        int sum =0;
        int startIndex = 0;
        while (startIndex <= array.length) {
            for(int i = startIndex ; i < array.length; i++) {
                sum += array[i];
                if(sum < 0 ) {
                    count++;
                }
            }
            sum = 0;
            startIndex++;
        }
        
        //Solution
        System.out.println(count);
       
    }
}
