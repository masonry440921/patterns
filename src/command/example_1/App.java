package command.example_1;

public class App {
	public static void main(String[] args) {
		
		Stock stock = new Stock();
		
		BuyStock buyStock = new BuyStock(stock);
		SellStork sellStork = new SellStork(stock);
		
		Broker broker = new Broker();
		
		broker.takeOrder(buyStock);
		broker.takeOrder(sellStork);
		broker.placeOrders();
	}
	
   
    

}
