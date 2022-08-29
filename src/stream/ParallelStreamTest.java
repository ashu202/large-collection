package stream;

import java.util.Random;
import java.util.ArrayList;
import java.util.List;

class Customer {

	static int customernumber;
	static int receivables;

	Customer(int customernumber, int receivables) {
		this.customernumber = customernumber;
		this.receivables = receivables;
	}

	public int getCustomernumber() {
		return customernumber;
	}

	public void setCustomernumber(int customernumber) {
		this.customernumber = customernumber;
	}

	public int getReceivables() {
		return receivables;
	}

	public void setReceivables() {
		this.receivables = receivables;
	}
}

public class ParallelStreamTest {

	public static void main(String args[]) {

		Random receivable = new Random();

		int upperbound = 1000000;

		List<Customer> custlist = new ArrayList<Customer>();

		for (int i = 0; i < upperbound; i++) {

			int custnumber = i + 1;
			int custreceivable = receivable.nextInt(upperbound);
			custlist.add(new Customer(custnumber, custreceivable));

		}

		long t1 = System.currentTimeMillis();

		System.out.println(
				"Sequential Stream count: " + custlist.stream().filter(c -> c.getReceivables() > 25000).count());

		long t2 = System.currentTimeMillis();

		System.out.println("Sequential Stream Time taken:" + (t2 - t1));

		t1 = System.currentTimeMillis();

		System.out.println(
				"Parallel Stream count: " + custlist.parallelStream().filter(c -> c.getReceivables() > 25000).count());

		t2 = System.currentTimeMillis();

		System.out.println("Parallel Stream Time taken:" + (t2 - t1));

	}

}