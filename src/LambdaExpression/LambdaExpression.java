package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

interface StringFunction {
    String run(String str);
}

public class LambdaExpression {
    public static void main(String[] args) {
//        Hello s = name -> "Hello, " + name;
//        System.out.println(s.sayHello("Lambda"));
//        List<String> list= new ArrayList<String>();
//        list.add("String 1");
//        list.add("String 2");
//        list.add("String 3");
//        list.add("String 4");
//        list.forEach(s -> System.out.println(s));
//        Consumer<String> method =
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";
        printFormatted("Hello", exclaim);
        printFormatted("Hello", ask);
    }
    public static void printFormatted(String str, StringFunction format) {
        String result = format.run(str);
        System.out.println(result);
    }
}
