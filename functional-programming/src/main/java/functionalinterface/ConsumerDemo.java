package functionalinterface;

import lombok.Data;
import java.util.function.Consumer;

public class ConsumerDemo {
    public static void main(String[] args) {

        //Imperative way
        greetingImperative(new Customer("Tuhin", "9174327074"));

        //Functional way
        greetingFunctional.accept(new Customer("Tuhin", "9174327074"));

    }


    public static void greetingImperative(Customer customer) {
        System.out.println("Thank you " + customer.getName() +
                " for registering with following cell no: " + customer.getPhoneNo());
    }


    static Consumer<Customer> greetingFunctional = customer -> {
        System.out.println("Thank you " + customer.getName() +
                " for registering with following cell no: " + customer.getPhoneNo());
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
