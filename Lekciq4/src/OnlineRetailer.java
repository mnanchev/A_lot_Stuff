
public class OnlineRetailer {
	private int quantity;
	private int productNumber;
	private double value;
	private double price;
	public OnlineRetailer(int quantity,int productNumber) {
		this.setQuantity(quantity);
		this.setProductNumber(productNumber);
	}
	public OnlineRetailer() {
	
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductNumber() {
		return productNumber;
	}
	public void setProductNumber(int productNumber) {
		this.productNumber = productNumber;
	}
	
	public void calculateTotalRetailValue(){
		switch(getProductNumber()){
		case 1:setPrice(2.98); break;
		case 2:setPrice(4.50);break;
		case 3:setPrice(9.98);break;
		case 4:setPrice(4.49);break;
		case 5: setPrice(6.87);break;
		default:System.out.println("The product number should be in range 1 to 5"); break;
		}
		setValue(getValue()+getPrice()*getQuantity());
	}
	private void setValue(double value) {
		// TODO Auto-generated method stub
		this.value = value;
	}
	private double getValue() {
		// TODO Auto-generated method stub
		return value;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void displayTotalValue(){
		System.out.println("The Value of your purchases is: "+getValue());
	}

}
