package General_Programs.Fibonocci_Programs;

import java.util.Arrays;
import java.util.stream.Stream;

public class Fibonocci_Streams {

    public static void main(String[] args) {
        Stream.iterate(new int[]{0, 1}, p -> new int[]{p[1], p[1] + p[0]})
                .limit(10)
                .map(p -> p[0])
                .forEach(System.out::println);
    }
}