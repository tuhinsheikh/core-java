package optional;

import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        var names = List.of("Tuhin", "Sheikh");

        Optional.ofNullable(names.get(1) )
                .ifPresentOrElse(name -> System.out.println(name), () -> {
                    System.out.println("Value not present");
                });

    }
}
