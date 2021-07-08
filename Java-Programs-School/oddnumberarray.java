import java.util.*;
public class oddnumberarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int numbers[] = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i=1; i<numbers.length;i+=2){
            if(i%2 != 0){
                sum = sum + numbers[i];
            }
        }
        System.out.println(sum);
        oddnumber(numbers);
    }
    private static void oddnumber(int array[]){
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            if(array[i]%2 != 0){
                sum = sum + array[i];
            }
        }
        System.out.println("sum = " + sum);
    }

}
