package functionalinterface;

import java.util.function.Predicate;

public class PredicateDemo {


    public static void main(String[] args) {

        //Imperative
        System.out.println("Imperative way");
        System.out.println(isPhoneNoValid("+19174327074"));
        System.out.println(isPhoneNoValid("+88714404558"));

        //Functional
        System.out.println("Functional way");
        System.out.println(isPhoneNumberValidFun.test("+19174327074"));
        System.out.println(isPhoneNumberValidFun.test("+88714404558"));

        System.out.println("Functional way chaining methods");
        System.out.println(isPhoneNumberValidFun.and(contains5).test("+88714404558"));
        System.out.println(isPhoneNumberValidFun.or(contains5).test("+88714404558"));
    }


     static boolean isPhoneNoValid(String phoneNumber){
        return phoneNumber.startsWith("+1") && phoneNumber.length() ==12;
    }

    static Predicate<String> isPhoneNumberValidFun =
            phoneNumber -> phoneNumber.startsWith("+1") && phoneNumber.length() ==12;

    static Predicate<String> contains5 = phoneNumber -> phoneNumber.contains("5");
}
