import java.util.*;
public class prime
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        int num, numFactors=0;

        System.out.println("Enter a number");
        num = et.nextInt();
        
        // Loop over integers between [1, num] 
        // Increment `numFactors` for each factor 
        for(int i=1;i<=num;i++)
            if(num%i == 0)
                numFactors+=1;


        if(numFactors==2)
            System.out.println("Prime number");
        else
            System.out.println("Not a prime number");
            
        et.close();

    }
}