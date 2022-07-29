
package SIG.model;

import java.util.ArrayList;
import java.util.Date;

public class InvoiceHeader {
    private int invoiceNum;
    private String customer;
    private String date;
    private ArrayList<InvoiceLine> lines;

  
    public InvoiceHeader(int invoiceNum, String customer, String date) {
        this.invoiceNum = invoiceNum;
        this.customer = customer;
        this.date = date;
    }

    public double getInoiceTotal() {
        double total=0;
        for(InvoiceLine line: getLines()){
            total += line.getLineTotal();       
        }
        return total;
    }

  

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public ArrayList<InvoiceLine> getLines() {
        if (lines==null){
        lines = new ArrayList<>();
        }
        return lines;
    }

   // public void setLines(ArrayList<InvoiceLine> lines) {
   //     this.lines = lines;
   // }


}
