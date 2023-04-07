package in.neuron.test;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import in.neuron.model.Student;
import in.neuron.util.HibernateUtil;

public class LoadRecordApp {

	public static void main(String[] args) throws Exception{
		Session session = null;
		
		int id=18;
	
		try {
			session = HibernateUtil.getSession();
			

			if (session != null) {
				
				Student student=session.load(Student.class, id);
				if(student!=null) {
					System.out.println("Student id is :: "+student.getSid());
					System.in.read();
					System.out.println("Student name is :: "+student.getSname());
					System.out.println("Student Address is :: "+student.getEaddress());
					System.out.println("Student Age is :: "+student.getEage());
				
				}
				else {
					System.out.println("record not found:: "+id);
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
