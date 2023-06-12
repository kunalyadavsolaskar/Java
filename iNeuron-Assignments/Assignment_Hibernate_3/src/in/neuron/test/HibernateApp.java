package in.neuron.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateApp {

    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();

        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Retrieve the employee to be updated
        Employee employee = session.get(Employee.class, 1);
        if (employee != null) {
            // Update the employee's name
            employee.setName("Updated Name");
            session.update(employee);
        }

        session.getTransaction().commit();
        session.close();

        // Retrieve and display the updated data
        session = sessionFactory.openSession();
        session.beginTransaction();

        Employee retrievedEmployee = session.get(Employee.class, 1);
        if (retrievedEmployee != null) {
            System.out.println("ID: " + retrievedEmployee.getId() + ", Name: " + retrievedEmployee.getName());
        }

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
