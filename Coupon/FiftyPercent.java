package Coupon;

import BestBuy.*;

//Cole Bauer


public class FiftyPercent extends ReceiptDec{

    public FiftyPercent(ReceiptComp rc) {
        super(rc);
    }

    public void print()
    {
        myTrailer.print();        
        System.out.println("COUPON: Bring this to save");      
    } 

   public boolean applies(Receipt order)          
   {
        if(order.getOrder().size() >= 3)
            return true;
        return false;
   }    
}