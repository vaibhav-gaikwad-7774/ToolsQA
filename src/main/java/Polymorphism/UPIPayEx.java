package Polymorphism;

class Payment{
	void makePayment(double amount) {
		System.out.println("payment of rs" + amount + "processed");
	}
	
	void makePayment(double amount, String method) {
		System.out.println("payment of rs"+ amount + "through" + method + "processed");
		
	}
	
	void showPaymentType() {
		System.out.println("generic payment method");
	}
}

class CreditCardPayment extends Payment{
	@Override
	void showPaymentType() {
		System.out.println("CreditCardPayment payment initiated");
		
	}
}


class UPIPayment extends Payment{
	@Override
	void showPaymentType() {
		System.out.println("UPIPayment payment initiated");
		
	}
}

public class UPIPayEx {
	public static void main(String[] args) {
		Payment p1 = new CreditCardPayment();
		p1.showPaymentType();
		p1.makePayment(1200);
		p1.makePayment(1200, "Credit Card");
		
		System.out.println("-------------");
		
		Payment p2 = new UPIPayment();
		p2.showPaymentType();
		p2.makePayment(500, "UPI");

	}

}
