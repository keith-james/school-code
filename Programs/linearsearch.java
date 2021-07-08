import java.util.*;
public class linearsearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[] = new int[5];
        for(int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        System.out.println("Enter a number to search: ");
        int num = sc.nextInt();
        for(int i = 0; i < nums.length; i++){
            if(num == nums[i]){
                System.out.println("FOUND IT!" + nums[i]);
            }
        }
    }
}
