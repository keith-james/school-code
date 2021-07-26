// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5

import java.util.*;
<<<<<<< HEAD
public class floyds
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        System.out.println("Enter a limit");
        int n=et.nextInt();

        for (int i=1; i <= n; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(j + " "); // 1 2 3
                System.out.println();
=======
public class flodsTriangle {
    public static void main (String args[]){
        Scanner jt = new Scanner (System.in);

        System.out.println("Enter a limit:");
        int limit=jt.nextInt();

        for(int i=1;i<=limit;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
>>>>>>> a9e9f9861da9d193a4e43bea98d2ce3ab7f08920
            }
            System.out.print("\n");
        }
    }
}
