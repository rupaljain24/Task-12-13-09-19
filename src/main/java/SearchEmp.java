import javax.management.Query;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import antlr.collections.List;

public class SearchEmp {

	public static void main(String[] args) {
		Configuration config= new Configuration().configure();
		SessionFactory sf=config.buildSessionFactory();
		Session session=sf.openSession();
		Emp e =session.get(Emp.class,2);
		System.out.println(e);


		
		org.hibernate.Transaction tr=session.beginTransaction();
		tr.commit();
		session.close();
	}
	}


