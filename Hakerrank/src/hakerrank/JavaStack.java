package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

public class JavaStack {

    private static Map<Character, Character> relations = new HashMap<>();

    public static void main(String[] argh) {
        Scanner sc = new Scanner(System.in);

        relations.put('(', ')');
        relations.put('{', '}');
        relations.put('[', ']');

        Stack<Character> stack = new Stack<>();
        List<Boolean> balancedList = new ArrayList<>();
        int n = sc.nextInt();
        sc.nextLine();
        Boolean isBalanced;
        for (int i = 0; i < n; i++) {

            String input = sc.next();
            //Complete the code

            stack.clear();
            for (Character chr : input.toCharArray()) {
                if(relations.containsKey(chr)) {
                    stack.push(chr);
                } else if(!stack.isEmpty()){
                    Character startChr = stack.peek();
                    if(relations.get(startChr).equals(chr)) {
                        stack.pop();
                    }
                } else {
                    stack.push(chr);
                    break;
                }
            }

            isBalanced = stack.isEmpty();
            balancedList.add(isBalanced);
        }
        for (boolean balanced : balancedList) {
            System.out.println(balanced);
        }

    }
}
