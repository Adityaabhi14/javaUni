import pack.Addition;
import pack.subpack.Subtraction;
class Use {
	public static void main(String args[]) {
		Addition obj = new Addition(10,20);
		obj.sum();
		Subtraction obj1 = new Subtraction(30,20);
		obj1.diff();
	}
}