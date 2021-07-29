/*
A
A B
A B C
A B C D
A B C D E
*/
import java.util.*;
public class charPatterns {
    public static void main (String args[]){
        Scanner jt=new Scanner(System.in);
        
        System.out.println("Enter the limit! :)");
        int limit = jt.nextInt();
        limit+=64;

        for(int i=65;i<=limit;i++){
            for(int j=65;j<=i;j++){
                System.out.print((char)j+" ");
            }
            System.out.println();
        }
    }
}