import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[] = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if(nums[j] < nums[i]){
                    int temp = nums[j];
                    nums[j] = nums[i];
                    nums[i] = temp;

                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);

        }
        reverse(nums);
    }
    private static void reverse(int array[]){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j] > array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }

            }

        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
    }
}
