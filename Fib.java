import java.util.Scanner;
class Fib
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
int f1=0,f2=1,f3,n;
n = sc.nextInt();
System.out.println(f1+"\t"+f2+"\t");
for(int i = 0;i <=n-2;i++) {
	f3 = f1+f2;
	System.out.println(f3+"\t");
	f1 = f2;
	f2 = f3;
}
sc.close();
}
}