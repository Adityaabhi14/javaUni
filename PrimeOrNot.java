import java.util.Scanner;
class PrimeOrNot
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
int num,i;
int count  = 0;
System.out.println("Enter a number to check");
num = scanner.nextInt();
for(i = 1;i <=num;i++) {
	if(num%i == 0)
		count++;
	if(count == 2) {
		System.out.println(num+" it is a prime number");
			}
	else {
		System.out.println(num+"it is not a prime number");
	}
	}
scanner.close();
}
}