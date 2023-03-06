package en.codegym.task.pro.task18.task1823;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toSet;

/* 
From a data stream to a set
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("Developer", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getFilteredStrings(stringStream).forEach(System.out::println);
    }

    public static Set<String> getFilteredStrings(Stream<String> stringStream) {
        //write your code here
        return stringStream.filter(x-> x.length()>6).collect(toSet());
    }
}
