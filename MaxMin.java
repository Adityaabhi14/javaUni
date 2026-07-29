import java.util.Scanner;
class MaxMin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a,b,c;
		int min,max;
		System.out.println("Enter first Number:");
		a = scanner.nextInt();
		System.out.println("Enter second Number:");
		b = scanner.nextInt();
		System.out.println("Enter Third Number:");
		c = scanner.nextInt();
		min = Math.max(a,Math.max(b,c));
		max = Math.min(a,Math.min(b,c));
		System.out.println("Max Number:" +max);
		System.out.println("Min Number:" +min);
		scanner.close();
 
	}
}