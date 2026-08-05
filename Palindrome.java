import java.util.Scanner;
class Palindrome
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int n,temp,sum = 0,rem = 0;
System.out.println("Enter a Number to check");
n = sc.nextInt();
temp = n;
while(n!= 0) {
	rem = n % 10;
	sum = (sum*10)+rem;
	n = n/10;
}
if (sum==temp) {
	System.out.println("it is a palindrome");
	}
else {
	System.out.println("it is not a prime number");
}
sc.close();
}
}