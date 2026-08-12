class Marks {
	int m,p,c;
	double total,avg;
	Marks(Marks m1) {
		m = m1.m;
		p = m1.p;
		c = m1.c;
	}
	Marks(int m1,int p1,int c1) {
		m = m1;
		p = m1;
		c = m1;
	}
	void compute() {
		total = m+p+c;
		avg = total/3;
	}
	void display() {
		System.out.println("total="+total+"\n"+"average="+avg);
	}
}
class MarksDemo {
	public static void main(String args[]) {
		Marks m2 = new Marks(70,80,90);
		Marks m3 = new Marks(m2);
		m3.compute();
		m3.display();
	}
}
		