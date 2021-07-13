import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Fill your array with 5 elements.");
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        asc_rev(nums); 
        System.out.println();
        dec_rev(nums);

        sc.close();
    }

    private static void dec_rev(int array[]){

        System.out.print("Soring in descending: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j] < array[i]){
                    int temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void asc_rev(int array[]){

        System.out.print("Sorting in ascending: ");

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
            System.out.print(array[i]+ " ");

        }
    }
}
