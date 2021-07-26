import java.util.*;
public class armstrongnumber {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number to check if it's an armstrong number: ");
        int num= sc.nextInt();
        int temp=num;
        int temp2=num;
        int count=0;
        while(temp!=0){
            temp=temp/10;
            count++;
        }
        int sum=0;
        while(num!=0){
            int rem=num%10;
            sum=sum+(int) Math.pow(rem,count);
            num=num/10;
        }
        if(temp2==sum){
            System.out.println("Armstrong number");
        } else {
            System.out.println("Not an armstrong number");
        }
    }
}
