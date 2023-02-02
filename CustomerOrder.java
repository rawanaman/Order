
package order;

public class CustomerOrder {
    private String cutomername;
    private int customerid;
    private int numberofitem;
    private double price;
    private double total;
    private double subtotal;
    private double taxamount;
    private double tax=.15;

    public CustomerOrder(String name, int id,int itemno ,double cost){
        this.cutomername = name;
        this.customerid = id;
        this.numberofitem = itemno;
        this.price = cost;
        this.total = 0.0;
        this.subtotal = 0.0;
    }

    public String getCutomername() {
        return cutomername;
    }

    public int getCustomerid() {
        return customerid;
    }

    public int getNumberofitem() {
        return numberofitem;
    }

    public double getPrice() {
        return price;
    }

    public double getTotal() {
        return total;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public double getTaxamount() {
        return taxamount;
    }

    public double getTax() {
        return tax;
    }

    public void setCutomername(String name) {
        this.cutomername = name;
    }

    public void setCustomerid(int id) {
        this.customerid = id;
    }

    public void setNumberofitem(int itemno) {
        this.numberofitem = itemno;
    }

    public void setPrice(double cost) {
        this.price = cost;
    }
    
    public double calculateSubTotal(int itemno, double price){
        subtotal=itemno*price;
        return subtotal;
    }
    
    public double calculatetax(){
        taxamount=subtotal*tax;
        return taxamount;
    }
    
    public double calculatetotal(){
        total=calculatetax()+subtotal;
        return total;
    }
    
    public double calculatetotal(double discount){
        double discount_amount=(calculatetotal()*discount)/100;
        discount_amount-=calculatetotal();
        return discount_amount;
    }
    
    
    public String toString(){
        return "customer name: "+cutomername+"\n"+"customer id: "+customerid+"\n"+
                "number of item: "+numberofitem+"\n"+"price: "+price+"\n"+"total: "+
                total+"\nsubtotal: "+subtotal+"\n"+"tax amount: "+
                taxamount;
    }
    
    
    
    
}
