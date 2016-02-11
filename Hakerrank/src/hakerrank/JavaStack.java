package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaStack {

    private static Map<Character, Character> relations = new HashMap<>();

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        relations.put(')', '(');
        relations.put('}', '{');
        relations.put(']', '[');

        LinkedList<Character> stack = new LinkedList<>();
        List<Boolean> balancedList = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {

            String input = sc.next();
            //Complete the code

            stack.clear();
            for (Character chr : input.toCharArray()) {
                stack.addLast(chr);
            }

            balancedList.add(isBalanced(stack));
        }
        for (boolean balanced : balancedList) {
            System.out.println(balanced);
        }

    }

    private static boolean isBalanced(LinkedList<Character> stack) {

        while (!stack.isEmpty()) {
            Character endChar = stack.getLast();
            Character startChar = relations.get(endChar);

            int startIndex = stack.lastIndexOf(startChar);
            if (startIndex == -1) {
                return false;
            } else {

                LinkedList<Character> sublist = new LinkedList(stack.subList(startIndex, stack.size()-1));
                if (sublist.contains(endChar)) {
                    int endIndex = sublist.indexOf(endChar);
                    if (endIndex == 1) {
                        stack.remove(startIndex+1);
                        stack.remove(startIndex);
                    } else {
                        return isBalanced(new LinkedList(stack.subList(startIndex + 1, startIndex + endIndex)));
                    }

                } else {
                    stack.remove(endChar);
                    stack.remove(startChar);
                }

            }
        }
        return true;
    }

}
