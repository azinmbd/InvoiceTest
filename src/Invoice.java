/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Azinm
 */
public class Invoice {
    private String number;
    private String description;
    private  int quantity;
    private double pricePerItem;
    
    public Invoice(String number,String description, int quantity, double pricePerItem) 
   {
       this.number = number;
       this.description = description;
      if (quantity > 0) {
          this.quantity = quantity;
      }
      if (pricePerItem > 0) {
          this.pricePerItem = pricePerItem;
      }
   }
    
    public void setNumber(String number){
     this.number = number;
    }
    public void setDescription( String description){
     this.description = description;
    }
    public void setQuantity(  int quantity){
     this.quantity = quantity;
    }
    public void setPricePerItem(  double pricePerItem){
     this.pricePerItem = pricePerItem;
    }
    
     public String getNumber(){
     return number;
    }
    public String getDescription(){
     return description;
    }
    public int getQuantity(){
     return quantity;
    }
    public double getPricePerItem(){
     return pricePerItem;
    }
    public double getInvoiceAmount(){
     return quantity*pricePerItem;
    }
}
