package BestBuy;


//Cole Bauer

public class Purchases {
    
    private int itemCode;
    private String name;
    private int price;
    private int quantity;
    
    public Purchases(int itemCode, String name, int price, int quantity)
    {
        this.itemCode = itemCode;
        this.name = name;
        this.price = price; 
        this.quantity = quantity;
    }
    
    public String getName()
    {
        return name;
    }

    public int getItemCode()
    {
        return itemCode;
    }    
    
    public int getPrice()
    {
        return price;
    }    

    public int getQuantity()
    {
        return quantity;
    }      
    
    public String getInfo()
    {
        return ("Name : " + name + " Price : " + price);
    }
    
}