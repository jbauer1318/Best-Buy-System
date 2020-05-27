package BestBuy;

import Coupon.*;
import Header.*;
import Rebate.*;

//Cole Bauer

public abstract class ReceiptDec implements ReceiptComp{
       
    protected ReceiptComp myTrailer;
    
    public ReceiptDec(ReceiptComp rc)
    {
        myTrailer = rc;
    }
        
    public void callTrailer()
    {
        myTrailer.print();
    }
    
    public abstract void print();
    
    public abstract boolean applies(Receipt order);
        
}