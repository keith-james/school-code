import java.util.*;
public class magicnum
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        int num, sum=0, d=0;
        System.out.println("Enter a number");
        num=et.nextInt();
        while(num>9)
        {
            while(num!=0)
            {
                d=num%10;
                sum+=d;
                num/=10; 
            }
            num=sum;
            sum=0;
        }
        if(sum==1)
            System.out.println("Magic number");
        else
            System.out.println("not a magic number");

        et.close();
    }
}