

import java.util.Scanner;

public class Customer {
	
	public static void main(String[] args) {
		Customer customer = new Customer();
		Scanner scan  = new Scanner(System.in);
		System.out.println("주문을 입력해주세요 ." );
		System.out.println("Menu : IceAmericano, HotAmericano, IceLatte, HotLatte");
		String order = scan.nextLine();
		scan.close();
		
		
		customer.orderToCahser(order);
		
		
	}
	public void orderToCahser(String order) {
		Casher cash = new Casher();
		cash.getOrderFromCustomer(order);
	}
	
	public void getDrinksFromCasher() {
		
	}
}
