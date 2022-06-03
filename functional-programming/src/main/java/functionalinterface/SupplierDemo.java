package functionalinterface;

import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args) {

        System.out.println(getUrls());
        System.out.println(getUrlSupplier.get());
        System.out.println(getUrlsSupplier.get());
    }



    static String getUrls(){
        return "https://www.youtube.com/watch?v=VRpHdSFWGPs&t=765s";
    }

    static Supplier<String> getUrlSupplier = () ->
            "https://www.youtube.com/watch?v=VRpHdSFWGPs&t=765s";

    static Supplier<List<String>> getUrlsSupplier = () ->
           List.of(
                   "https://www.youtube.com/watch?v=VRpHdSFWGPs&t=765s",
                   "https://github.com/tuhinsheikh/core-java"
                   );
}
