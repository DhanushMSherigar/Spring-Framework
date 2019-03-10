package p1;

public class BookApp 
{

	public static void main(String[] args) 
	{
Book123 b1=new Book123();
b1.setBookname("Maths");
Book123 b2=new Book123();
b2.setBookname("Social");
Book123 b3=new Book123();
b3.setBookname("science");
Book123 b4=new Book123();
b4.setBookname("java");

Publisher123 p1= new Publisher123();
p1.setPublishername("person");
Publisher123 p2= new Publisher123();
p2.setPublishername("Aradhya");
b1.setPublisher(p1);
b2.setPublisher(p1);
b3.setPublisher(p2);
b4.setPublisher(p2);

HibernateManager hm= new HibernateManager();
hm.connect();
hm.insert(b1);
hm.insert(b2);
hm.insert(b3);
hm.insert(b4);








	}

}
