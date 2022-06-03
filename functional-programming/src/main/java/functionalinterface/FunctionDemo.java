package functionalinterface;

import java.util.function.Function;

public class FunctionDemo {


    public static void main(String[] args) {

        System.out.println("Declarative way: "+ addOneTraditional(5));
        System.out.println("Functional way: "+ addOneFunctional.apply(9));

        var incrementAndMulti = addOneFunctional.andThen(multiplyBy10);
        System.out.println("Functional method chaining: " + incrementAndMulti.apply(5) );

    }




    //Declarative approach
    static int addOneTraditional(int number){
        return number+1;
    }

    //Functional Approach
    //Takes one argument and produces result
    static Function<Integer, Integer> addOneFunctional = number -> number + 1;
    static Function<Integer, Integer> multiplyBy10 = number -> number * 10;

}
