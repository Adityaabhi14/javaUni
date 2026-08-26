class One
{
final void display() 
{
System.out.println("Parent class method");
}
}
class Two extends One
{
void display()
{
System.out.println("child class method");
}
}
class Example
{
public static void main(String args[])
{
Two obj = new Two();
obj.display();
}
}