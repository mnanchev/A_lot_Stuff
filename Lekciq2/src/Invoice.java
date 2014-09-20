
public class Invoice {
	private String partNumber,partDescription;
	private int quantity;
	private double price;
	public Invoice(String partNumber,String partDescription,int quantity,double price ){
		this.partNumber = partNumber;
		this.partDescription = partDescription;
		this.quantity = quantity;
		this.price = price;
	}
	public void setPartNumber(String number){
		partNumber = number;
	}
	public String getPartNumber(){
		return partNumber;
	}
	public void setPartDescription(String description){
		partDescription = description;
	}
	public String getPartDescription(){
		return partDescription;
	}
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}
	public int getQuantity(){
		return quantity;
	}
	public void setPrice(double price){
		this.price = price;
	}
	public double getPrice(){
		return price;
	}
	public double invoiceAmount(){
		double result;
		if(quantity < 0){
			setQuantity(0);
			return result = getPrice()*getQuantity();
		}
		else if(price<0.0){
			setPrice(0.0);
			return result = getPrice()*getQuantity();
		}
		else
			return result = getPrice()*getQuantity();
	}
	public void displayInvoice(){
		System.out.printf("\nItem number: %s\nItem description:%s\nquantity:%d\nItem price:%.2f",getPartNumber(),getPartDescription(),getQuantity(),getPrice());
	}
}
