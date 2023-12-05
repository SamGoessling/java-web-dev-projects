import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterCounter {

    public static void main(String[] args) {
        //--creates scanner object to read user input--//
        Scanner scanner = new Scanner(System.in);
        //--prompts user to enter a string--//
        System.out.println("Enter a string: ");
        //--reads user input & stores it in the "inputString" variable--//
        String inputString = scanner.nextLine();
        //--converts stored string input to lowercase--//
        inputString = inputString.toLowerCase();
        //--creates HashMap that stores character counts--//
        HashMap<Character, Integer> characterCounts = new HashMap<>();

        //--iterates over all Characters in string--//
        for (char character : inputString.toCharArray()) {
            //--checks if Character is alphabetic (ignores non-alphabetic)--//
            if (Character.isAlphabetic(character)) {
                /*--if counted once already: increment count by 1,
                if not yet counted: add Character w/ count of 1--*/
                characterCounts.put(character, characterCounts.getOrDefault(character, 0) + 1);
            }
        }

        System.out.println("Character Counts:");
        for (Map.Entry<Character, Integer> entry : characterCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
