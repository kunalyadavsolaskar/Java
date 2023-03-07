package in.ineuron.beans;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MyMainApp {

	public static void main(String[] args)
	{
		ApplicationContext factory=new ClassPathXmlApplicationContext("Beans.xml");
		factory.getBean("credit",CreditCardPay.class);
		factory.getBean("debit",DebitCardPay.class);
		PaymentProcess process=factory.getBean("paying",PaymentProcess.class);
		process.dopayment(100.00);
	}

}
