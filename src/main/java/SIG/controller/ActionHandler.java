
package SIG.controller;

import SIG.model.InvoiceHeader;
import SIG.model.InvoiceLine;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import javax.swing.JFileChooser;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class ActionHandler implements ActionListener,ListSelectionListener {
   
    @Override
    public void actionPerformed (ActionEvent e){
    System.out.println("Action Handling Call!");
    switch (e.getActionCommand()){
        case "Load File":
            System.out.println("Load File");
            loadFile();
            break ;
        case "Save File":
            System.out.println("Save File");
            saveFile();
            break ;
        case "New Invoice":
            System.out.println("New Invoice");
            //newInv();
            break ;
        case "Delete Invoice":
            System.out.println("Delete Invoice");
            deleteInv();
            break ;
        case "New Item":
            System.out.println("New Item");
            newItem();
            break ;
        case "Delete Item":
            System.out.println("Delete Item");
            deleteItem();
            break ;
        


}
  
    

}
     private void loadFile()  {
         try{
         JFileChooser fc = new JFileChooser();
         int result = fc.showOpenDialog(fc);
         if (result == JFileChooser.APPROVE_OPTION){
             File headerFile = fc.getSelectedFile();
             String headerStrPath = headerFile.getAbsolutePath();
             Path headerPath = Paths.get(headerStrPath);
             List <String> headerLines = Files.lines(headerPath).collect(Collectors.toList());
             //["1,22-11-2020,Ali","2,13-10-2021,Saleh"]
             ArrayList<InvoiceHeader> invoiceHeadersList = new ArrayList<>();
             for (String line: headerLines){
                 String[] parts = line.split(",");
                 // parts= ["1","22-11-2020","Ali"]
                 // parts= ["2","13-10-2021","Saleh
                 int id = Integer.parseInt(parts[0]);
                 InvoiceHeader invHeader = new InvoiceHeader (id,parts[2],parts[1]);
                 invoiceHeadersList.add(invHeader);
                 
             }
             System.out.println("Check");
             result = fc.showOpenDialog(fc);
             if (result== JFileChooser.APPROVE_OPTION){
                 String lineStrPath = fc.getSelectedFile().getAbsolutePath();
                 Path linPath = Paths.get(lineStrPath);
                 List<String> lineLines =Files.lines(linPath).collect(Collectors.toList());
                 for (String lineLine: lineLines){
                 String[] parts = lineLine.split(",");
                 // parts= ["1","22-11-2020","Ali"]
                 // parts= ["2","13-10-2021","Saleh
                 int invId = Integer.parseInt(parts[0]);
                 double price = Double.parseDouble(parts[2]);
                 int count= Integer.parseInt(parts[3]);
                 //int invoiceid, String itemName, double itemPrice, int count
               //  InvoiceLine invLine = new InvoiceLine (header,invId,parts[1],price,count);
                // invoiceHeadersList.add(invLine);
                 
             }
                 
                    
             }
             
         
                 
         }
     }catch(IOException ex){
             ex.printStackTrace();
             }
     }
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody

   //  private InvoiceHeader getInvoiceHeaderById(ArrayList<InvoiceHeader> invoices,int id){
    //     for (InvoiceHeader invoice :invoices){
     //        if(invoice.getId()==id){
     //            return invoice;
     //        }
     //    }

    private void deleteInv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void newItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteItem() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void newInv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     }


    

    

   

    

