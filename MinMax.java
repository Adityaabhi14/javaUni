import java.util.Scanner;
class MinMax {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		int b;
		int c;
		System.out.println("Enter first Number:");
		a = scanner.nextInt();
		System.out.println("Enter second Number:");
		b = scanner.nextInt();
		System.out.println("Enter Third Number:");
		c = scanner.nextInt();
		if ( a > b && a > c) {
			System.out.println("A is MaxNumber" +a);
			}
		else if (b > a && b > c) {
			System.out.println("B is the MaxNumber:"+b);
			}
		else {
			System.out.printf("C is the MaxNumber:"+c);  
			}
		if ( a < b && a < c) {
			System.out.println("A is MinNumber" +a);
			}
		else if (b < a && b < c) {
			System.out.println("B is the MinNumber:"+b);
			}
		else {
			System.out.println("C is the MinNumber:"+c);  
			}
		
		
 
	}
}