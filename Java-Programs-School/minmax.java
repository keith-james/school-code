import java.util.*;
public class minmax {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numbers[] = new int[5];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = sc.nextInt();
        }
        int max = numbers[0];
        int min = numbers[0];
        for(int i = 1; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
            if(min > numbers[i]){
                min = numbers[i];
            }
        }
        System.out.println("Max num = " + max +"\nMin num = " + min);

    }
}
