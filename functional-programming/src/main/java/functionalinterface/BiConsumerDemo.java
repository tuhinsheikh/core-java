package functionalinterface;

import lombok.Data;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerDemo {
    public static void main(String[] args) {

        //Imperative way
        greetingImperative(new Customer("Tuhin", "9174327074"), false);

        //Functional way
        greetingFunctional.accept(new Customer("Tuhin", "9174327074"), false);

    }


    public static void greetingImperative(Customer customer, Boolean bool) {
        System.out.println("Thank you " + customer.getName() +
                " for registering with following cell no: " + (bool ? customer.getPhoneNo() : "******************"));
    }


    static BiConsumer<Customer, Boolean> greetingFunctional = (customer, bool )-> {
        System.out.println("Thank you " + customer.getName() +
                " for registering with following cell no: " + (bool ? customer.getPhoneNo() : "******************"));
    };

    @Data
    static class Customer {
        private String name;
        private String phoneNo;

        public Customer(String name, String phoneNo) {
            this.name = name;
            this.phoneNo = phoneNo;
        }
    }


}
