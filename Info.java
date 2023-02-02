
package order;

public class Info {

    public static void main(String[] args) {
        CustomerOrder customer=new CustomerOrder("sara",123,2,300);
        
       System.out.println("subtotal: "+customer.calculateSubTotal(2,300));
       
       if(customer.calculatetotal()<500){
           customer.calculatetotal(0);
       }
       else if(customer.calculatetotal()>=500&&customer.getSubtotal()<1000){
           customer.calculatetotal(10);
       }
       else if(customer.calculatetotal()>=1000){
           customer.calculatetotal(15);
       }
       System.out.println(customer);
           
        
    }
    
}
