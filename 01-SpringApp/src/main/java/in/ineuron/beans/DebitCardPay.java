package in.ineuron.beans;

public class DebitCardPay implements IPay {
	 public DebitCardPay() {
		System.out.println("Debit Card object by IOC");
	}

	public boolean payBill(Double amt) {
	System.out.println("paying bill through debit card");
		return false;
	}

}
