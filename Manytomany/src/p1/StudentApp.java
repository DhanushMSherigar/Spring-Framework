package p1;

import java.util.HashSet;
import java.util.Set;

public class StudentApp {

	public static void main(String[] args)
	{
	Student125 s1=new Student125();
	s1.setStudentname("Virat");
	Student125 s2=new Student125();
	s2.setStudentname("Dhoni");
	Student125 s3=new Student125();
	s3.setStudentname("Rahul");
	
	Set<Course125> c1=new HashSet<Course125>();
	c1.add(new Course125("Maths"));
	c1.add(new Course125("Science"));
	c1.add(new Course125("Social"));
	
	Set<Course125> c2=new HashSet<Course125>();
	c2.add(new Course125("Maths"));
	c2.add(new Course125("Science"));
	
	s1.setCourse(c1);
	s2.setCourse(c2);
	s3.setCourse(c1);
	
	HibernateManager hm=new HibernateManager();
	hm.connect();
	hm.insert(s1);
	hm.insert(s2);
	hm.insert(s3);
	
	
	}

}
