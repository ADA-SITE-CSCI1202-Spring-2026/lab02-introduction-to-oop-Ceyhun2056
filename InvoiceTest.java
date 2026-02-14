package week03.invoice;

public class InvoiceTest {
    public static void main(String[] args) {
        Invoice invoice = new Invoice("AB23", "Screwdriver", 3, 5.0);
        System.out.println("Part Number: " + invoice.getPartNumber());
        System.out.println("Description: " + invoice.getPartDescription());
        System.out.println("Quantity: " + invoice.getQuantity());
        System.out.println("Price per item: " + invoice.getPricePerItem());
        System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());
    }
}
