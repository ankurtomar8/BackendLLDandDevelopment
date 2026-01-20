package LambdaAndStreamAPI;

import org.w3c.dom.ls.LSOutput;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamClient {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(
                2,3,4,8,6,9,72,36,7,44,6,3,4,7,2,3,67,34,03,49,40
        );

        List<Integer> evenList = list.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toUnmodifiableList());
        System.out.println(evenList);


        //
        List<Integer> squareList = list.stream()
                .map(n -> n * n )
                .sorted()
                .distinct()
                .collect(Collectors.toUnmodifiableList());

        System.out.println(squareList);


        Optional<Integer> nullList = list.stream()
                .map(n -> n * n )
                .sorted()
                .distinct()
                        .findFirst();

        System.out.println(nullList);
    }
}
