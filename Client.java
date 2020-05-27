package BestBuy;

import Header.*;
import java.util.LinkedList;
import java.util.Scanner;

 //Cole Bauer

public class Client {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        
        LinkedList order = new LinkedList();
        HeaderStore header;
        
        header = makeHeader(console);        
        makeOrder(order, console);
        
                
        ReceiptFactory rf = new ReceiptFactory(header, order);        
        rf.getReceipt();
    }
    
   
    public static HeaderStore makeHeader(Scanner console)
    {
        String stateCode, address, phone;
        int number;
            System.out.println("What is the state code (MD, CA)");
            stateCode = console.nextLine();
            System.out.println("What is the address?");
            address = console.nextLine();
            System.out.println("What is the phone number");
            phone = console.nextLine();
            System.out.println("What is the store number?");
            number = console.nextInt(); console.nextLine();
            return new HeaderStore(stateCode, address, phone, number);
    }

    public static void makeOrder(LinkedList order, Scanner console)
    {
        boolean more = true;
        int itemNum, cost, quantity;
        String name, ans;

        while(more)
        {
            System.out.println("What is the item number?");
            itemNum = console.nextInt(); console.nextLine();
            System.out.println("What is the item name?");
            name = console.nextLine();
            System.out.println("What is the item cost?");
            cost = console.nextInt(); console.nextLine();
            System.out.println("How many?");
            quantity = console.nextInt(); console.nextLine();
            order.add(new Purchases(itemNum, name, cost, quantity));
            System.out.println("Any more items? (y / n)");
            ans = console.nextLine();
            if(ans.equals("n"))
                more = false;
        }
    }
 
  
    
    public static void testItems(LinkedList order)
    {
        order.add(new Purchases(0, "graphics card", 15, 2));
        order.add(new Purchases(1, "television", 1000, 1));        
        order.add(new Purchases(2, "desktop", 1500, 1));        
        order.add(new Purchases(3, "bluetooth dongle", 25, 1));        
        order.add(new Purchases(4, "hard drive", 10, 2));  
        order.add(new Purchases(5, "computer", 30, 1));        
        order.add(new Purchases(6, "hdmi", 5, 1)); 
        order.add(new Purchases(7, "printer", 50, 1)); 
        order.add(new Purchases(8, "camera", 20, 1));
        order.add(new Purchases(9, "keyboard", 20, 1)); 
    }
    
    public static HeaderStore testStoreInfo()
    {
        return new HeaderStore("MD", "123 Main St.", "410-704-5555", 123);
    }
 
}