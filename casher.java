

public class Casher {
	String order;
	
	 public Casher() {
		 
	 }
	 
	 public String sendOrderToBaristar() {
		 String abc = "";
		 return abc;
	 }
	 
	 public void getOrderFromCustomer(String order) {
		 this.order = order;
		 System.out.println("casher�� �ֹ��� �����Ͽ����ϴ�.");
	 }
	 
	 public String[] convertOrder(String order) {
		 String orders[] = order.split(" ");
		 return orders;
	 }
	 
	 public void sendDrinksToCustomer(String drinks) {
		 
	 }
	 
	 public void getDrinksFromBarista() {
		 
	 }
	 
	 
}
