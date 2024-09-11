// program to change the lowercase to uppercase
import java.util.stream.Stream;

public class UpperCaseConverter {
    public static void main(String[] args) {
        // Given list of strings
        Stream<String> names = Stream.of("aBc","d","ef");
// Convert each string to uppercase using map() and print the result
        names.map(String::toUpperCase)
                .forEach(System.out::println);
    }
    }

