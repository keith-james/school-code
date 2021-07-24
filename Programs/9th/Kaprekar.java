import java.util.*;
public class Kaprekar {
    static Scanner et=new Scanner(System.in);

    public static void main(String args[]) {
        System.out.println("Enter a number");
            int num = et.nextInt();
        
        int square = num*num;
        int count=0;
        int temp = square;

        while(temp!=0) {
            count ++;
            temp /= 10;
        }
        
        int part1 = 0;

        if(count%2==0) {
            // 2025 
            System.out.println("Yaay! Works");
            part1 = (int)(square / Math.pow(10, count/2));
            // part2 = 234;
        }

        System.out.println("part1     = " + part1);
        System.out.println("Square     = " + square);
        System.out.println("Dig of square = " + count);

        et.close();
    }


}
