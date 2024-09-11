// program to find students name with A
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StudentWithA {
    public static void main(String[] args) {
        // List of student names
        List<String> students = Arrays.asList("Alice", "Bob", "Ari", "Ravi", "Hem","Arya");
        // Filter the students whose names start with "A" using Stream API and lambda expression
        List<String> studentsWithA = students.stream()
                .filter(name-> name.startsWith("A"))
                .collect(Collectors.toList());
        // Print the students whose names start with "A"
        System.out.println("Students whose names start with 'A': " + studentsWithA);
    }
}
