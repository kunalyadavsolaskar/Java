package in.ineuron.beans;

public class CreditCardPay implements IPay {
	
	public CreditCardPay() {
		System.out.println("Credit Card object by IOC");
	}

	public boolean payBill(Double amt) {
		System.out.println("paying through credit card");
		return false;
	}

}
