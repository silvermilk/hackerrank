package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        List<Boolean> balancedList = new ArrayList<>();
        Map<String, String> relations = new HashMap<>();
        relations.put(")", "(");
        relations.put("}", "{");
        relations.put("]", "[");

        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String input = sc.next();
            //Complete the code
            boolean isBalanced = true;
            for (String str : input.split("")) {
                stack.push(str);
            }

            while (!stack.empty()) {
                String startStr = relations.get(stack.pop());
                if (stack.remove(startStr)) {
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
