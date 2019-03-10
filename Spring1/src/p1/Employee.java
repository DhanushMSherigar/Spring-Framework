package p1;

public class Employee 
{
int empid;
String empname;
Address addr;
public Employee(int empid, String empname, Address addr) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.addr = addr;
}
public void disp()
{
	System.out.println(empid);
	System.out.println(empname);
	System.out.println(addr);
}
}
