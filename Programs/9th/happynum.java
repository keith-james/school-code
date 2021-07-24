import java.util.*;
public class happynum {
    public static void main(String args[]){
        Scanner et=new Scanner(System.in);

        System.out.println("Enter a number");
        int num=et.nextInt();
        int sumofdig=num,dig=0, squaresum=0;
        
        while (sumofdig>9){
            while (sumofdig!=0){
                dig=sumofdig%10;
                squaresum+=Math.pow(dig,2);
                sumofdig/=10;
            }
            sumofdig=squaresum;
            squaresum=0;
        }

        if(sumofdig==1)
            System.out.println("Happy number");
        else
            System.out.println("Unhappy number");

        et.close();
    }
}
