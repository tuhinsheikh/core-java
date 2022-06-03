package functionalinterface;

import java.util.function.BiFunction;

public class BiFunctionDemo {
    public static void main(String[] args) {

        System.out.println("Declarative: "+addNMultiBy(2, 8));
        System.out.println("Imperative: "+ incrementNMultiFunc.apply(2, 8));

    }



    //Declarative
    static int addNMultiBy(int num1, int num2) {
        return (num1+1) * num2;
    }

    //Imperative
    //Takes two argument and produces result
    static BiFunction<Integer, Integer, Integer> incrementNMultiFunc = (numToIncrement, numToMultiBy) -> (numToIncrement+1) *numToMultiBy ;
}



