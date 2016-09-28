package command.example_1;

public class SellStork implements Order{
	private Stock stock;
	
	public SellStork(Stock stock) {
		// TODO Auto-generated constructor stub
		this.stock = stock;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		stock.sell();
	}

}
