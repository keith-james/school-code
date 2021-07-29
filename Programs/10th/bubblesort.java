import java.util.*;
public class bubblesort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Fill your array with 5 elements.");
        int nums[] = new int[5];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        asc_rev(nums);  //Just putting the sorting algorithm in two different functions, you can ignore this
        System.out.println();
        dec_rev(nums);

        sc.close();
    }

    /*
     * Bubble sort works by taking each number in an array and comparing it with the numbers that come before it.
     * You do this with a nested loop -
     * Each index in the outer loop has to be compared with the indices that come before it, this comparison is done in the inner loop
     * Swap the numbers if the number in the outer loop is lesser than the number in the inner loop for ascending order.
     * Swap the numbers if the number in the outer loop is greater than the number in the inner loop for descending order.
     */

    private static void asc_rev(int array[]){

        System.out.print("Sorting in ascending: ");

        for (int i = 0; i < array.length; i++) { //Outer loop to choose each index, the index variable here is i
            for (int j = 0; j < i; j++) { //Inner loop to choose each index that comes before the outer loop's index, that's why we're using i < j as the control statement
                if(array[j] > array[i]) { //Checking if the number in the inner loop is greater than the number in the outer loop
                    int temp = array[j]; //Storing one of the values in a temporary variable to swap
                    array[j] = array[i]; //Swapping
                    array[i] = temp;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void dec_rev(int array[]){

        System.out.print("Sorting in descending: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if(array[j] < array[i]) { //Checking if the number in the outer loop is greater than the number in the inner loop (descending order), everything else is the same
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
