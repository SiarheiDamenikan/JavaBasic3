package by.damenikan.synchro;

public class PaymentRunner {

	public static void main(String[] args) {
		final Payment payment = new Payment();
		new Thread() {
			public void run() {
				payment.doPayment(); // ����� synchronized ������
			}
		}.start();
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized (payment) { // 1-�� ����
			System.out.println("Init amount:");
			payment.initAmount();

			payment.notify(); // ����������� � �������� ����������
		}
		synchronized (payment) { // 2-�� ����
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
