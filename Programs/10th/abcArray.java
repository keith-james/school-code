import java.util.*;
public class abcArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] = new int[2];
        int b[] = new int[2];
        int c[] = new int[4];

        for(int i = 0; i < a.length; i++){
            System.out.print("Enter a =");
            a[i] = sc.nextInt();
            System.out.print("Enter b = ");
            b[i] = sc.nextInt();
        }

        sc.close();
        int j = 0;

        for(int i = 0; i < c.length; i++){
            if(i < a.length){
                c[i] = a[i];
            }
            if(i >= b.length){
                c[i] = b[j];
                j++;
            }
        }
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
    }
}
