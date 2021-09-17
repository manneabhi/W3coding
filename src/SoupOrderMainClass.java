
public class SoupOrderMainClass {

    public static void main(String[] args) {
    
     VegSoup vs = new VegSoup();
     BuyVegSoup buy = new BuyVegSoup(vs);
     SellVegSoup sell = new SellVegSoup(vs);

     	Invoker in = new Invoker();
     	in.takeOrder(buy);
     	in.takeOrder(sell);
     	in.placeOrder();
     	
     	 NonVegSoup nonveg = new NonVegSoup();
         BuynonVegSoup nonvegbuy = new BuynonVegSoup(nonveg);
         SellnonVegSoup nonvegsell = new SellnonVegSoup(nonveg);

         Invoker in1 = new Invoker();
         in1.takeOrder(nonvegbuy);
         in1.takeOrder(nonvegsell);
         in1.placeOrder();
    }
}
