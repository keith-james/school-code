import java.util.*;
public class reverse
{
    public static void main(String args[])

    {
        Scanner et=new Scanner(System.in);
        int reverse=0;

        System.out.println("Enter a number to be reversed.");
        int num=et.nextInt();
        

        while(num!=0){
            reverse*=10;
            reverse+=num%10;
            num/=10;
        }

        System.out.println(reverse);
        et.close();
    }
}