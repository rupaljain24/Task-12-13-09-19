
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class RemoveEmp {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Emp e1=new Emp();
		e1.setEno(1);
		org.hibernate.Transaction tr=session.beginTransaction();
		session.delete(e1);
		tr.commit();
		session.close();
		System.out.println("Data removed");

	}

}
