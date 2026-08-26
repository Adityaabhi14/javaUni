class Sample {
final int x = 10;
void access() {
x = 20;
}
public static void main(String args[]) {
Sample s = new Sample();
s.access();
}
}