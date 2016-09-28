package iterator.example_2;

import java.util.ArrayList;
import java.util.List;

public class TreasureChest{
	private List<Item> items;
	
	public TreasureChest() {
		// TODO Auto-generated constructor stub
		  items = new ArrayList<>();
		    items.add(new Item(ItemType.POTION, "Potion of courage"));
		    items.add(new Item(ItemType.RING, "Ring of shadows"));
		    items.add(new Item(ItemType.POTION, "Potion of wisdom"));
		    items.add(new Item(ItemType.POTION, "Potion of blood"));
		    items.add(new Item(ItemType.WEAPON, "Sword of silver +1"));
		    items.add(new Item(ItemType.POTION, "Potion of rust"));
		    items.add(new Item(ItemType.POTION, "Potion of healing"));
		    items.add(new Item(ItemType.RING, "Ring of armor"));
		    items.add(new Item(ItemType.WEAPON, "Steel halberd"));
		    items.add(new Item(ItemType.WEAPON, "Dagger of poison"));
	}
		
	public List<Item> getIterms(){
		List<Item> list= new ArrayList<>();
		list.addAll(items);
		return list;
	}

	 ItemIterator iterator(ItemType type) {
		// TODO Auto-generated method stub
		return new TreasureChestItemIterator(this,type);
	}
}
