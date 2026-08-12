class Box {
	double height,width,depth;
	Box() { //default contructor
		height = 20;
		width = 25;
		depth = 10;
	}
	Box(double h,double w,double d) { //parameterized constructor
		height = h;
		width = w;
		depth = d;
	}
	Box(Box b) { //copy contructor
		height = b.height;
		width = b.width;
		depth = b.depth;
	}
	double compute() { //computing the vairables
		double volume;
		volume = height*width*depth;
		return volume;
	}
}
class BoxDemo {
	public static void main(String args[]) {
		Box b1 = new Box();
		Box b2 = new Box(10,20,30);
		Box b3 = new Box(b2);
		System.out.println("volume of the  box1="+b1.compute());
		System.out.println("volume of the  box2="+b2.compute());
		System.out.println("volume of the  box3="+b3.compute());
	}
}