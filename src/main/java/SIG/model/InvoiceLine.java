
package SIG.model;


public class InvoiceLine {
    private InvoiceHeader invoice;
    private int  invoiceid;
    private String itemName;
    private double itemPrice;
    private int count;
    

  

    public InvoiceLine(InvoiceHeader invoice, int invoiceid, String itemName, double itemPrice, int count) {
        this.invoice = invoice;
        this.invoiceid = invoiceid;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
    }

   

    @Override
    public String toString() {
        return "InvoiceLine{" + "invoiceid=" + invoiceid + ", itemName=" + itemName + ", itemPrice=" + itemPrice + ", count=" + count + ", lineTotal=" + getLineTotal() + '}';
    }

    
    public double getLineTotal() {
       return itemPrice*count;
    }

    public InvoiceHeader getInvoice() {
        return invoice;
    }

    public void setInvoice(InvoiceHeader invoice) {
        this.invoice = invoice;
    }

    public int getInvoiceid() {
        return invoiceid;
    }

    public void setInvoiceid(int invoiceid) {
        this.invoiceid = invoiceid;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
