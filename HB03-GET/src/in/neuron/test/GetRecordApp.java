package in.neuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuron.model.Student;
import in.neuron.util.HibernateUtil;

public class GetRecordApp {

	public static void main(String[] args) throws Exception{
		Session session = null;
		
		int id=18;
	
		try {
			session = HibernateUtil.getSession();

			if (session != null) {
				Student student=session.get(Student.class, id);
				if(student!=null) {
					System.out.println(student);
				}
				else {
					System.out.println("record not found:: ");
				}
			}
				

			

		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			HibernateUtil.closeSession(session);
			HibernateUtil.closeSessionFactory();
		}


	}

}
