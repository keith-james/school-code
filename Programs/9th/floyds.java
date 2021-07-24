// 1
// 1 2
// 1 2 3 
// 1 2 3 4
// 1 2 3 4 5

import java.util.*;
public class floyds
{
    public static void main(String args[])
    {
        Scanner et=new Scanner(System.in);
        System.out.println("Enter a limit");
        int n=et.nextInt();
        int floyds=1;
        for (int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++){
                System.out.print(floyds + " ");
                floyds++;
            }
            System.out.println();
        }
        et.close();
    }
}