package sample;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MoreLambda {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("run 1");
            }
        };

        Runnable r2 = () -> System.out.println("run 2");

        r1.run();
        r2.run();

        //Using an existing functional interface BiFunction
        BiFunction<String, String, String> concat = (a,b) -> a + b;         //the 1st String indicates the output, the last 2 indicate the input type
        String sentence = concat.apply("Yo mom ", "gay");
        System.out.println(sentence);

        //example of function interface Consumer
        Consumer<String> hello = (name) -> System.out.println("Hello " + name);
        for (String names : Arrays.asList("Duke", "Mickey", "Minnie")) {
            hello.accept(names);
        }

        //applying my own custome functional interface
        simpleAdd adding = (a) -> a + 69;
        System.out.println(adding.inputNumber(420));
    }

    @FunctionalInterface
    interface simpleAdd {
        int inputNumber(int a);
    }
}
