package p1;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;
import java.util.*;
public class HibernateManager 
{
	Session session;
	public void connect()
	{
	//Connection code
		// these 5 lines would remain same and is used for getting connection
       Configuration configuration = new Configuration().configure("hibernate.cfg.xml"); //connects to cfg
       ServiceRegistryBuilder builder = new ServiceRegistryBuilder().applySettings(configuration.getProperties());
       SessionFactory sessionFactory = configuration.buildSessionFactory(builder.buildServiceRegistry());       		   
          		 
        session =sessionFactory.openSession();	
        System.out.println("Connected to Pf....");
	}
	
	public void selectUsingWhere(String sid, String sname)
	{
		session.beginTransaction();
		Query q = session.createQuery("From Student where SID=:studentid");
		q.setParameter("studentid", sid);
		List l = q.list();
		Iterator itr = l.iterator();
		while(itr.hasNext()==true)
		{
			Student s =(Student) itr.next();
			
			System.out.println(s.getStudentid());
			System.out.println(s.getStudentname());
			
			
		}
		
	}
}