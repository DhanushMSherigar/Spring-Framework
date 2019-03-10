package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentApp {

	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
		Student s1=(Student) ac.getBean("s1");
s1.disp();
Student s2=(Student) ac.getBean("s2");
s2.disp();
Student s3=(Student) ac.getBean("s3");
s3.disp();
	}

}
