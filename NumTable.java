import java.util.Scanner;
class NumTable {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a;
		System.out.println("Enter a Number that you want the Table");
		a = scanner.nextInt();
		for(int i = 1;i < 11; i++) {
			System.out.println(a+ " x " + i + " = " + (a*i));
			}
		scanner.close();
 
	}
}