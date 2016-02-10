package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<Character> stack = new Stack<>();
        List<Boolean> balancedList = new ArrayList<>();
        Map<Character, Character> relations = new HashMap<>();
        relations.put(')', '(');
        relations.put('}', '{');
        relations.put(']', '[');

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String input = sc.next();
            //Complete the code
            boolean isBalanced = true;
            for (Character chr : input.toCharArray()) {
                stack.push(chr);
            }

            while (!stack.empty()) {
                Character startChar = relations.get(stack.pop());
                if (stack.remove(startChar)) {
                    isBalanced = true;
                } else {
                    isBalanced = false;
                    break;
                }
            }
            balancedList.add(isBalanced);
        }
        for (boolean balanced : balancedList) {
            System.out.println(balanced);
        }

    }
}
