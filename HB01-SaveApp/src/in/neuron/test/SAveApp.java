package in.neuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuron.model.Student;
import in.neuron.util.HibernateUtil;

public class SAveApp {
public static void main(String[] args) {
	Session session = null;
	Transaction transaction = null;
	boolean flag = false;
	Integer id=null;
	try {
		session = HibernateUtil.getSession();

		if (session != null)
			transaction = session.beginTransaction();

		if (transaction != null) {

			Student student = new Student();
			student.setSid(10);
			student.setSname("Sachin");
			student.setEaddress("MI");
			

			 id=(Integer) session.save(student);
			flag = true;
		}

	} catch (HibernateException e) {
		e.printStackTrace();
	} catch (Exception e) {
		e.printStackTrace();
	} finally {
		if (flag) {
			transaction.commit();
			System.out.println("object saved with id :: "+id);
			System.out.println("Object saved to database....");
		} else {
			transaction.rollback();
			System.out.println("Object not saved to database...");
		}

		HibernateUtil.closeSession(session);
		HibernateUtil.closeSessionFactory();
	}

}
}