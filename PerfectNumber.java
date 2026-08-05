import java.util.Scanner;
class PerfectNumber
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
int n,rem = 0,sum = 0;
System.out.println("Enter a number:");
n = scanner.nextInt();
for(int i = 1;i<n;i++) {
	rem = n %1;
	if(rem == 0) {
		sum += i;
		}
	}
if(sum == n) {
	System.out.println("it is a perfect number");
	}
else {
	System.out.println("it is not a perfect number:");
	}
scanner.close();
}
}