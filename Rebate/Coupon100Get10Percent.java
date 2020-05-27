package Rebate;
import BestBuy.*;

//Cole Bauer


public class Coupon100Get10Percent {
	

	public class BOGO_Mice extends ReceiptDec{

	    public Coupon100Get10Percent(ReceiptComp rc) {
	        super(rc);
	    }
	    

	    public void print()
	    {
	        myTrailer.print();    
	        System.out.println("REBATE: Spend 100 to get 10 off");       
	    } 

	   public boolean applies(Receipt order)          
	   {
	        Purchases temp;
	        for(int i = 0; i < order.getOrder().size(); i++)
	        {
	            temp = (Purchases)order.getOrder().get(i);
	            if(temp.getName().equals("graphics card"))
	                return true;
	        }
	        return false;
	   }
	    
	}
}
