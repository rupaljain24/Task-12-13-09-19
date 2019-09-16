
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AddEmp {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Emp e1=new Emp();
		e1.setEno(1);
		e1.setEname("AAA");
		e1.setSal(80000);
		//or
		Emp e2=new Emp(2,"BBB",50000);
		
		org.hibernate.Transaction tr=session.beginTransaction();
		session.save(e1);session.save(e2);
		tr.commit();
		session.close();
		System.out.println("Data Added");
		
	}

}
