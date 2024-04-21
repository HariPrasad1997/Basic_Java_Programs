package oopsConcepts;

public class GooglePay implements Payment {

	@Override
	public void doTransaction() {
		System.out.println("Transaction done by using Google-Pay..");

	}

	@Override
	public void addCoupon() {
		// TODO Auto-generated method stub
		Payment.super.addCoupon();
	}

	public static void main(String[] args) {
		Payment payment = new GooglePay();
		payment.doTransaction();
		payment.addCoupon();
	}
}
