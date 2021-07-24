import java.util.*;
public class StringFunctions {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String string = sc.next();

        int length = string.length();
        System.out.println("The length of the string is: " +length);
        // The .length() function is used to get the length of a string. It returns the length as an integer.

        int firstChar = string.charAt(0);
        System.out.println("The first character is: " +firstChar);
        /*
         A string can be thought of as an array of characters. In fact that's exactly what a string is.
         Each string is composed of many characters. For example a string called "Keith" would have 5 characters: 'K', 'e', 'i', 't', 'h'
         It's exactly like an array, the first character is the 0th element so if you want the first character use stringName.charAt(0),
         the second character with stringName.charAt(1) and so on
        */

        System.out.println("Enter the name of a character you want to search for in the string: ");
        char searchChar = sc.next().charAt(0); // Using the .charAt() function here because the Scanner class doesn't have a function to read characters.
        int index = string.indexOf(searchChar);
        System.out.println("The Index of the character you entered is: " +indexOf);
        /*
         The .indexOf() function looks for a character inside the string and returns the index of it. If there are multiple instances of the same character it always
         returns the first occurence.
         For example in the string "Yohan", the index of 'Y' is 0 (remember array elements start from 0 not 1)

         Instead of searching through the whole string you can start searching from a specific index too.
         For example, using "Yohan" again, you can use string.indexOf(2, 'a'); to start reading the string from the 3rd index (third index cos array elements start from 0)
        */

        String subString = string.substring(3, 5);
        /*
         The stringName.substring() function is used to split a string
         You can give it either one or two values.
         If you give it one value it'll return a string from that point till the end of the string
         If you give it two values it'll cut the string from the first value till the second value
         For example:
         String name = "Kevin"
         System.out.println(name.substring(1, 3)
         The code above will print "evi"
        */

        String upperCase = string.toUpperCase();
        //converts the string to upper case

        String lowerCase = string.toLowerCase();
        //same thing as above but lower case
    }
}
