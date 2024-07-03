/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

/**
 *
 * @author Azinm
 */
public class InvoiceTest {


    public static void main(String[] args) {
        
        Invoice invoice1 = new Invoice("12", "book", 3, 12.4);

         System.out.printf("Number: %s %nDescription: %s %nQuantity: %d %nPrice per item: $%.2f %nInvoce amount: $%.2f%n%n",
           invoice1.getNumber(), invoice1.getDescription(), invoice1.getQuantity(), invoice1.getPricePerItem(), invoice1.getInvoiceAmount()); 

        Scanner input = new Scanner(System.in);

        System.out.print("Enter part number: "); 
        String number = input.next(); 
        invoice1.setNumber(number);

        System.out.print("Enter part description: "); 
        String description = input.next(); 
        invoice1.setDescription(description);

        System.out.print("Enter part quantity: "); 
        int quantity = input.nextInt(); 
        invoice1.setQuantity(quantity);

        System.out.print("Enter part price per item: "); 
        double pricePerItem = input.nextDouble();
        invoice1.setPricePerItem(pricePerItem);
     
        Invoice invoice2 = new Invoice(number, description,quantity, pricePerItem);
        System.out.printf("%n%nNumber: %s %nDescription: %s %nQuantity: %d %nPrice per item: $%.2f %nInvoce amount: $%.2f%n%n",
         invoice2.getNumber(), invoice2.getDescription(), invoice2.getQuantity(), invoice2.getPricePerItem(), invoice2.getInvoiceAmount()); 
      
    }
    
}
