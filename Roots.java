import java.util.*;
class Roots
{
public static void main(String args[])
{
Scanner scanner = new Scanner(System.in);
double root1,root2,a,b,c,dis;
System.out.println("Enter the value of a from the equation");
a = scanner.nextDouble();
System.out.println("Enter the value of b from the equation");
b = scanner.nextDouble();
System.out.println("Enter the value of c from the equation");
c = scanner.nextDouble();
dis = (b*b) - (4 * a * c);
if(dis < 0) {
	System.out.println("No real roots exist");
	}
else {
	doubl s = Math.sqrt(dis);
	root1 = -b+s/ (2 *a);
	root2 = -b-s/ (2*a);
}
System.out.println("First root"+root1);
System.out.println("Second root"+root2);
scanner.close();
}
}