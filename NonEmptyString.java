// program to change empty strings to nonempty strings
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyString {
    public static void main(String[] args) {
        // Given list of strings
      List<String> strings = Arrays.asList("abc","", "bc","egf", "abcd","","jkl");

        // Filter the non-empty strings using filter() and collect them into a list
      List<String> nonEmptyString = strings.stream()
              .filter(s -> !s.isEmpty())
              .toList();
        // Print the list of non-empty strings
        System.out.println("NonEmptyStrings:" + nonEmptyString);
    }
}