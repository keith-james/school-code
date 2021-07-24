import java.util.*;
public class factorial
{
    /*
     * A number's factorial is the product of the number and every number that comes before it
     * 5 factorial = 5 * 4 * 3 * 2 * 1
     */
    public static void main(String args[])
    {
        Scanner et = new Scanner(System.in);
        int n, fact;
        System.out.println("Enter a number");
        n = et.nextInt();
        fact = n;

        for(int i = 1; i < n; i++)
        {
            fact *= i;
        }

        System.out.println("Factorial: "+fact);
        et.close();
    }
}
