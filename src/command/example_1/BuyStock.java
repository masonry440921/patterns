package command.example_1;

public class BuyStock implements Order{
	private Stock stock;
	public BuyStock(Stock stock) {
		// TODO Auto-generated constructor stub
		this.stock =stock;;
	}
	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}
	
}
