package BestBuy;

import StateTax.*;
import java.util.Date;
import java.util.LinkedList;

//Cole Bauer


 
public class Receipt implements ReceiptComp{
    
    Date date;
    HeaderStore header;
    LinkedList order = new LinkedList();
    float total = 0;
    float subTotal = 0;        
    
    
    public Receipt(HeaderStore header, LinkedList items)
    {
        this.header = header;
        date = new Date();
        Purchases temp;
        for(int i = 0; i < items.size(); i++)
        {
            temp = (Purchases)items.get(i);
            subTotal = subTotal + temp.getPrice();
            order.add(temp);
        }
        getAmountDue(header, items);
        
        
        
    }
    
    public void print()
    {
        Purchases temp;
        System.out.println(header.getHeader());
        System.out.println(date.toString());
        System.out.println("Your purchases:");
        for(int i = 0; i < order.size(); i++)
        {
            temp = (Purchases)order.get(i);
            System.out.println(temp.getInfo());
        }        
        System.out.println("Subtotal : " + subTotal);
        System.out.println("Total after tax : " + total);
        
    }
 

    public void getAmountDue(HeaderStore header, LinkedList items)
    {
        String state = header.getAddress();
        int month = date.getMonth();
        int day = date.getDay();
        boolean holiday = false;
            if( (state.equals("MD")|state.equals("GE")) & month==8 & (day==1|day==2) )
            {
                holiday = true;
            }
        
        switch(state)
        {
            case "MD" : if(holiday)
                            total = (float) (subTotal + MDTax.getHoliday(items));
                        else
                            total = subTotal + subTotal* MDTax.SALESTAX;
                        break;
                
                
            case "CA" : total = subTotal + subTotal*CATax.SALESTAX;
                        break;           
        }       
    }
    
    public LinkedList getOrder()
    {
        return order;
    }
    
    public Date getDate()
    {
        return date;
    }    
    
}