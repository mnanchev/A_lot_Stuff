
public class InvoiceTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Invoice invoice = new Invoice("09AH "," Gearbox ",100,1999.99);
		invoice.displayInvoice();
		System.out.println();
		System.out.println("Invoice amount: "+invoice.invoiceAmount());
		invoice.setQuantity(2000);
		System.out.println();
		System.out.println("Invoice amount: "+invoice.invoiceAmount());
		invoice.setPrice(-1);
		System.out.println();
		System.out.println("Invoice amount: "+invoice.invoiceAmount());
		invoice.setQuantity(-10);
		System.out.println();
		System.out.println("Invoice amount: "+invoice.invoiceAmount());
		System.out.println(invoice.getQuantity());
		System.out.println(invoice.getPrice());
		invoice.displayInvoice();
		invoice.setPrice(10.99);
		invoice.setQuantity(5);
		System.out.println();
		System.out.println("Invoice amount: "+invoice.invoiceAmount());
		invoice.displayInvoice();
	}

}
