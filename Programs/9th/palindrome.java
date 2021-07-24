import java.util.*;
public class pal
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        int num, temp, rev=0;
        System.out.println("Enter a number");
        num=et.nextInt();
        temp=num;
        
        while(num!=0)
        {
            rev=rev*10;
            rev=rev+num%10;
            num/=10;
        }

        if(rev==temp)
            System.out.println("palindrome");
        else
            System.out.println("Not a Palindrome Number");
        et.close();

    }
}
