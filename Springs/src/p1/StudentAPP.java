package p1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentAPP {

	public static void main(String[] args) 
	{
ApplicationContext ac=new ClassPathXmlApplicationContext("beans.xml");
Student s=(Student) ac.getBean("s1");


System.out.println(s.getName());

	}

}
