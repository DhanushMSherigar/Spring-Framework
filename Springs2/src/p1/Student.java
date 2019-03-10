package p1;

public class Student 
{
int studentid;
String studentname;
School sch;
public Student(int studentid, String studentname, School sch) {
	super();
	this.studentid = studentid;
	this.studentname = studentname;
	this.sch = sch;
}
public void disp()
{
	System.out.println(studentid);
System.out.println(studentname);
System.out.println(sch);
}
}