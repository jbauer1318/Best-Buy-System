package StateTax;

import BestBuy.Purchases;
import java.util.LinkedList;

 
//Cole Bauer

public class MDTax {
    
   
    
    public final static float SALESTAX = (float) .06;

    public static double getHoliday(LinkedList items)
    {
        float tax = 0;
        float cost = 0;
        Purchases temp;
        for(int i = 0; i < items.size(); i++)
        {
            temp = (Purchases)items.get(i);
            cost = temp.getPrice();
            if(cost>1000)
                tax = tax + cost*SALESTAX;
        }
        System.out.println("Holiday sales tax");
        return tax;
    }
    
}