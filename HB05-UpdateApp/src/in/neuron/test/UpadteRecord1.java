package in.neuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuron.model.Student;
import in.neuron.util.HibernateUtil;

public class UpadteRecord1 {

	public static void main(String[] args) throws Exception{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
	
		try {
			session = HibernateUtil.getSession();

			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {

				Student student = new Student();
				student.setSid(18);
				student.setSname("virat");
				student.setEaddress("IND");
				student.setEage(36);
				  session.update(student);
				flag = true;
				
			}

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (flag) {
				transaction.commit();
				
				System.out.println("Object uoadted to database....");
				
			} else {
				transaction.rollback();
				System.out.println("Object not upadted to database...");
			}
			//System.in.read();
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}


	}

}
