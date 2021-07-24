import java.util.*;
public class CharacterFunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a character: ");
        char character = sc.next().charAt(0); 
        /*
         * The scanner class in java doesn't have a function to read character input,
         * therefore I've used the string input function (Scanner.next())here and taken the first character of that string as our input
         *
         * Explanation on the .charAt() function will be there in the StringFunctions.java file
         */
        boolean isLetter = Character.isLetter(character);
        System.out.println("Is the character a letter? " +isLetter);
        /*
         * The Character.isLetter() function tells us if the character is a letter or not. You have to give it a character as a parameter in the brackets.
         * It returns either true or false depending on whether the character is a letter or not. Therefore I've stored what it returns in a boolean here.
         */

        boolean isDigit = Character.isDigit(character); //same as above but for number
        System.out.println("Is the character a digit? " +isDigit);

        boolean isUpperCase = Character.isUpperCase(character);
        System.out.println("Is the character in uppercase? " +isUpperCase);
        /*
         * The Character.isUpperCase checks if the character is uppercase or not. It returns a boolean value just like isLetter() and isDigit()
         */

        boolean isLowerCase = Character.isLowerCase(character);
        System.out.println("Is the character in lowercase? " +isLowerCase);
    }

}
