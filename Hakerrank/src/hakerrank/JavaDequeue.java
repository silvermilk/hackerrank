package hakerrank;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class JavaDequeue {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int maxUnique = 0;

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();

            if (i >= m && deque.size() == m) {
                deque.removeFirst();
            }
            if (!deque.contains(num)) {
                deque.addLast(num);
            }

            if (maxUnique < deque.size()) {
                maxUnique = deque.size();
            }
        }

        System.out.println(maxUnique);

    }
}
