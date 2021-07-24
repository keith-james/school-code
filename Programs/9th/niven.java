import java.util.*;
public class niven
{
    public static void main (String args[]){
        Scanner et=new Scanner(System.in);

        System.out.println("Enter a number");
        int limit=et.nextInt();
        int sumofdig=0, temp=limit;

        while (limit!=0){
            sumofdig+=limit%10;
            limit/=10;
        }

        if (temp%sumofdig==0){
            System.out.println("It is a niven number");
        }
        else{
            System.out.println("Not a niven number");
        }

        et.close();
    }
}