import java.util.Scanner;

public class binarysearch {

    private static void sort(int array[]){
        int size = array.length;
        for(int i = 0; i < size-1; i++){
            int min=i;
            for(int j = i + 1; j<size; j++){
                if(array[j] < array[min]){
                    min = j;
                }
            }
            int temp = array[min];
            array[min] = array[i];
            array[i] = temp;
        }
        for (int i = 0; i<size; i++){
            System.out.println(array[i]);
        }
        binarysearch(array);
    }

    private static void binarysearch(int array[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to search");
        int number = sc.nextInt();
        int size = array.length;
        int r = size -1;
        int l = 0;
        int mid = (l + r)/2;
        boolean active = true;
        while (active){
            if(number == array[mid]){
                System.out.println("Found the number");
                active=false;
            }
            else if(number > array[mid]){
                l = mid + 1;
                mid = (l+r)/2;
            }
            else if (number < array[mid]){
                r = mid - 1;
                mid = (l+r)/2;
            }
        }
    }

    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int array[] = new int[10];
        int size = array.length;
        for (int i = 0; i < size; i++) {
            array[i] = sc.nextInt();
       }
        sort(array);
    }
}
