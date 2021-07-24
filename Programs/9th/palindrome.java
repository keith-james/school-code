import java.util.*;
public class palindrome
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        int num, temp=0, rev=0;
        System.out.println("Enter a number");
        num=et.nextInt();
        temp=num;
        while(num!=0)
        {
            // rev=rev*10;
            rev=rev+num%10;
            num=num/10;
        }
        if(rev==temp)
        {
            System.out.println("Palindrome number");
        }
        else
        {
            System.out.println("Not a palindrome number");
        }
        et.close();
    }
    

}