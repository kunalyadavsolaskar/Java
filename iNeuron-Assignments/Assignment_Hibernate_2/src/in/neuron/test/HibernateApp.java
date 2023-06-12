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

        Employee employee = new Employee();
        employee.setName("John Doe");
        session.save(employee);

        session.getTransaction().commit();
        session.close();

        // Retrieve and display the inserted data
        session = sessionFactory.openSession();
        session.beginTransaction();

        Employee retrievedEmployee = session.get(Employee.class, employee.getId());
        System.out.println("ID: " + retrievedEmployee.getId() + ", Name: " + retrievedEmployee.getName());

        session.getTransaction().commit();
        session.close();
        sessionFactory.close();
    }
}
