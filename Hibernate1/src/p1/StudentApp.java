package p1;

public class StudentApp 
{

	public static void main(String[] args) 
	{
		Student s = new Student();
		s.setStudentid("003");
		s.setStudentname("Virat");
		
		HibernateManager hm = new HibernateManager();
		hm.connect();
		hm.insert(s);
			
	}

}
