package iterator.example_2;

public class Item{
	private String name;
	private ItemType type;
	public Item(ItemType type,String name) {
		// TODO Auto-generated constructor stub
		this.type = type;
		this.name = name;
	}
	public ItemType getType() {
		return type;
	}
	public void setType(ItemType type) {
		this.type = type;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
