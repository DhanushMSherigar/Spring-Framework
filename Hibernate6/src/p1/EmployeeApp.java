package p1;

public class EmployeeApp {

	public static void main(String[] args) {
		Employee15 e=new Employee15();
		e.setEname("Dhoni");
		Address15 a=new Address15();
		a.setCity("Ranchi");
		a.setStreet("4th Cross");
		a.setState("jharkand");
		a.setCountry("india");
		e.setAddr(a);
		HibernateManager hm=new HibernateManager();
		hm.connect();
		hm.insert(e);
		
		

	}

}
