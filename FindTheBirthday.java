import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
public class FindTheBirthday {
    public static void main(String[] args) {
                // Create a Scanner object to take user input
                Scanner obj = new Scanner(System.in);

                // Prompt the user to enter their birthdate in yyyy-mm-dd format
                System.out.print("Enter your birthdate (yyyy-mm-dd): ");
                String birthdateInput = obj.nextLine();

                // Parse the input to a LocalDate object
                LocalDate birthdate = LocalDate.parse(birthdateInput);

                // Get the current date
                LocalDate currentDate = LocalDate.now();

                // Calculate the period between the birthdate and the current date
                Period age = Period.between(birthdate, currentDate);

                // Display the calculated age in years, months, and days
                System.out.println("Your age is: " + age.getYears() + " years, " +
                        age.getMonths() + " months, and " + age.getDays() + " days.");
            }
        }

