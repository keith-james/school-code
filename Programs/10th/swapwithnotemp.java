import java.util.*;
public class swapwithnotemp{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a > b) {
			a = a - b;
			b = a + b;
			a = b - a;
		} else if (b > a) {
			b = b - a;
			a = a + b;
			b = a - b;
		}
		System.out.println(a + " " + b);
	}

}