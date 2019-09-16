import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateEmp {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Emp e1=new Emp();
		e1.setEno(2);
		e1.setEname("CCC");
		e1.setSal(75000);
		org.hibernate.Transaction tr=session.beginTransaction();
		session.update(e1);
		tr.commit();
		session.close();
		System.out.println("Data updated");
	}

}
