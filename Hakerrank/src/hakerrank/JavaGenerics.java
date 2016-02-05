package hakerrank;

import java.lang.reflect.Array;
import java.lang.reflect.Method;
import java.util.List;

public class JavaGenerics {

    public static void main(String args[]) {
        Printer myPrinter = new Printer();

        Integer [] intArray = {1, 2, 3};
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;
        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();
            if(name.equals("printArray")) {
                count ++;
            }
        }
        
        if(count>1) System.out.println("Method overloading is not allowed");
        assert count==1;
    }

}

class Printer {

    protected  <T> void  printArray(T[] anArray){
        for (T element : anArray) {
            System.out.println(element);
        }
    }
}
