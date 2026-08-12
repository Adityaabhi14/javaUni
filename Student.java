import java.io.*;
class StudentInfo {
	private String sname;
	private int sno;
	private long sphno;
	void setName(String name) {
		sname = name;
	}
	void setNo(int no) {
		sno = no;
		}
	void setPhno(long phno) {
		sphno = phno;
		}
	String getName() {
		return sname;
		}
	int getNo() {
		return sno;
		}
	long getPhno() {
		return sphno;
		}
}
class Student
{
public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
String name;
int rollno;
long phone;
System.out.println("enter name,rollno, and phoneno of the student");
name = br.readLine();
rollno = Integer.parseInt(br.readLine());
phone = Long.parseLong(br.readLine());
StudentInfo s = new StudentInfo();
s.setName(name);
s.setNo(rollno);
s.setPhno(phone);
System.out.println("name of the student="+s.getName());
System.out.println("rollno of the student="+s.getNo());
System.out.println("phone number of the student="+s.getPhno());
}
}