package Coupon;

import BestBuy.*;

//Cole Bauer

public class Gift extends ReceiptDec{

    public Gift(ReceiptComp rc) {
        super(rc);
    }
    
    public void print()
    {
        myTrailer.print();        
        System.out.println("COUPON: Bring this to concierge for a gift");       
    } 

   public boolean applies(Receipt order)          
   {
       
        float subTotal = 0;
        Purchases temp;
        for(int i = 0; i < order.getOrder().size(); i++)
        {
            temp = (Purchases)order.getOrder().get(i);
            subTotal = subTotal + temp.getPrice();
        }

        if(subTotal > 1000)
            return true;
        
        return false;
   }
   
}