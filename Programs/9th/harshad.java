import java.util.*;
public class harshad
{
    public static void main (String args[])
    {
        Scanner et=new Scanner(System.in);
        int num, sumofdigits=0, temp=0;

        System.out.println("Enter a number");
        num=et.nextInt();
        temp=num;

        while (num!=0){
            sumofdigits=sumofdigits+num%10;
            num/=10;
        }
        System.out.println(sumofdigits);

        if (temp%sumofdigits==0){
            System.out.println("Harshad number");

        }
        else {
            System.out.println("Not a Harshad number");
        }
        et.close();
    }
}