import java.util.*;

public class linearsearch {

    public static void main(String[] args) {

        /*
         Linear search is basically just going through each index in the array and searching for a matching value
         For example if you had a number - 6 and an array - 8 9 2 1 6
         The loop would go through each number in the array, checking if it is equal to 6, till it finally gets it
        */
        Scanner sc=new Scanner(System.in);
        int nums[] = new int[5];

        for(int i = 0; i < nums.length; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter a number to search: ");
        int num = sc.nextInt();

        for(int i = 0; i < nums.length; i++) {
            if(num == nums[i]) {
                System.out.println("FOUND IT!" + nums[i]);
            }
        }
    }
}
