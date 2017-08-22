package by.damenikan.synchro;

public class PaymentRunner {

	public static void main(String[] args) {
		final Payment payment = new Payment();
		new Thread() {
			public void run() {
				payment.doPayment(); // вызов synchronized метода
			}
		}.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (payment) { // 1-ый блок
			System.out.println("Init amount:");
			payment.initAmount();

			payment.notify(); // уведомление о возврате блокировки
		}
		synchronized (payment) { // 2-ой блок
			try {
				payment.wait(1_000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("ok");
		}

	}

}
