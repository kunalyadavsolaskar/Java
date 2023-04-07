package in.neuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuron.model.Student;
import in.neuron.util.HibernateUtil;

public class UpadteRecord2 {

	public static void main(String[] args) throws Exception{
		Session session = null;
		Transaction transaction = null;
		boolean flag = false;
	
		try {
			session = HibernateUtil.getSession();
			Student student=session.get(Student.class, 18);
			
			if (session != null)
				transaction = session.beginTransaction();

			if (transaction != null) {
				if (student != null) {
					System.out.println(student);
					System.out.println();

					student.setEaddress("RCB");
					session.update(student);
					flag = true;
				} else {
					System.out.println("Record not available for updation...");
				}
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
