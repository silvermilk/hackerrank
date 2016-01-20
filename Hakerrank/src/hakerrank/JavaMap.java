package hakerrank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class JavaMap {

    public static void main(String[] argh) {
        Map <String, Integer> phoneBook = new HashMap<>();
        List <String> queries = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String name = in.nextLine();
            int phone = in.nextInt();
            phoneBook.put(name, phone);
            in.nextLine();
        }

        while (in.hasNext()) {
            String s = in.nextLine();
            queries.add(s);
        }
        
        //Solution
        
        for(String query:queries) {
            if(phoneBook.containsKey(query)) {
                System.out.println(query +"="+ phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }
    }
}
