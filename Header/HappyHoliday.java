package Header;
import BestBuy.*;

//Cole Bauer

public class HappyHoliday extends ReceiptDec{

    public HappyHoliday(ReceiptComp rc) {
        super(rc);
    }
        
    public void print()
    {
        myTrailer.print();        
        System.out.println("Happy Holidays!");
    }

    
    public boolean applies(Receipt order) {
        return true;
    }
}