package exercises.functionalinterface;

import java.util.function.BiFunction;

public class Function {
    public static void main(String[] args) {
        //System.out.println(squareDigits(765));
        int increment = increment(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyBy10Function.apply(increment2);
        System.out.println(multiply);
 
        java.util.function.Function<Integer,Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multiplyBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(4));

        //BiFunction
        System.out.println(incrementByOneAndMultiply(4,100));

        System.out.println(incrementByOneAndMultiplyBiFunction.apply(4,100));

    }

    static java.util.function.Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static java.util.function.Function<Integer, Integer> multiplyBy10Function = number -> number * 10;

    static int increment(int number){
        return number + 1;
    }

    static BiFunction<Integer, Integer,Integer> incrementByOneAndMultiplyBiFunction =
            (numberToIncrementByOne, numberToMutliplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMutliplyBy;

    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number + 1) * numToMultiplyBy;
    }
}
