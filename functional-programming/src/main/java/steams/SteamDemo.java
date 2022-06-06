package steams;

import java.util.List;
import java.util.stream.Collectors;

public class SteamDemo {

    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Tuhin", Gender.MALE),
                new Person("Habiba", Gender.FEMALE),
                new Person("Rayan", Gender.MALE),
                new Person("Farhana", Gender.FEMALE),
                new Person("Ariz", Gender.MALE),
                new Person("Zayeda", Gender.FEMALE)
        );

        people.stream()
                .map(person -> person.name())
                .mapToInt(name -> name.length())
                .forEach(nameLength -> System.out.println(nameLength));

        people.stream()
                .map(person -> person.name())
                .distinct()
                .forEach(name -> System.out.println(name));

        System.out.println("Checking length of name more than 3 ");
        people.stream()
                .filter(person -> person.name().length()>3)
                .map(person -> person.name())
                .forEach(name -> System.out.println(name));
    }




    record Person(String name, Gender gender) {
        }

    enum Gender {
        MALE, FEMALE
    }
}
