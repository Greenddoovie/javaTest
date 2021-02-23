
public class casher {
	String order;
	
	 public casher() {
		 
	 }
	 
	 public String sendOrderToBaristar() {
		 String abc = "";
		 return abc;
	 }
	 
	 public void getOrderFromCustomer(String order) {
		 this.order = order;
	 }
	 
	 public String[] convertOrder(String order) {
		 String orders[] = order.split(" ");
		 return orders;
	 }
	 
	 
	 
}
