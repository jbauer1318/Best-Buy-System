package BestBuy;
import java.util.LinkedList;
import Header.*;
import Rebate.*;
import Coupon.*;

//Cole Bauer


public class ReceiptFactory {
    
    Receipt receipt;
    ReceiptComp everything;
    ReceiptDec[] added = new ReceiptDec[7];
    
    
    
    int count = 0;
    
    public ReceiptFactory(HeaderStore header,LinkedList order)
    {
        receipt = new Receipt(header, order);
        //Decorate();
        
        added[0] = new HappyHoliday(everything);
        added[1] = new Gift(everything);
        added[2] = new TenPercent(everything);
        added[3] = new FiftyPercent(everything);
        added[4] = new Coupon100Get10Percent(everything);
        
        
        everything = receipt;
        
        everything = new HappyHoliday(everything);
        
        if(added[1].applies(receipt))
        {
            everything = new Gift(everything);
        }
        
        if(added[2].applies(receipt))
        {
            everything = new TenPercent(everything);
        }
        if(added[3].applies(receipt))
        {
            everything = new FiftyPercent(everything);
        }        
        if(added[4].applies(receipt))
        {
            everything = new Coupon100Get10Percent(everything);
        }        
       

    }
    
    public void getReceipt()
    {
        everything.print();
    }

 

    
}