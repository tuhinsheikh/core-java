package imparative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Tuhin", Gender.MALE),
                new Person("Habiba", Gender.FEMALE),
                new Person("Rayan", Gender.MALE),
                new Person("Farhana", Gender.FEMALE),
                new Person("Ariz", Gender.MALE),
                new Person("Zayeda", Gender.FEMALE)
        );


        //Imperative approach
        System.out.println("Imperative style");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (person.gender.equals(Gender.FEMALE)) {
                females.add(person);
            }
        }
        for (Person person : females
        ) {
            System.out.println(person);

        }


        // Declarative
        System.out.println("declarative style");
        people.stream()
                .filter(person -> person.gender.equals(Gender.FEMALE))
                .forEach(System.out::println);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
