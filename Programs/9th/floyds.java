// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5

import java.util.*;
public class floyds
{
import java.util.*;
public class flodsTriangle {
    public static void main (String args[]){
        Scanner jt = new Scanner (System.in);

        System.out.println("Enter a limit:");
        int limit=jt.nextInt();

        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.print("\n");
        }
    }
}
