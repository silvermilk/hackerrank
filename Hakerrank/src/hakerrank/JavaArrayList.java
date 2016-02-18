package hakerrank;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author anchu
 */
public class JavaArrayList {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List <List> global = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int d = sc.nextInt();
            List<Integer> sublist = new ArrayList<>();
            for (int j=0; j<d; j++) {
                sublist.add(sc.nextInt());
            }
            global.add(sublist);
        }
        
        int q = sc.nextInt();
        for (int i = 1; i < q+1; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            try {
                System.out.println(global.get(x-1).get(y-1));
            } catch(IndexOutOfBoundsException e) {
                System.out.println("ERROR!");
            }
        }
    }
}
