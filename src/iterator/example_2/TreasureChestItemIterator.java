package iterator.example_2;

import java.util.List;

public class TreasureChestItemIterator implements ItemIterator {
	private int idx;
	private TreasureChest treasureChest;
	private ItemType type;
	
	
	public TreasureChestItemIterator(TreasureChest treasureChest,ItemType type) {
		// TODO Auto-generated constructor stub
		this.treasureChest = treasureChest;
		this.type = type;
		this.idx = -1;
	}
	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return findNextIdx() != -1;
	}

	private int findNextIdx() {
		// TODO Auto-generated method stub
		List<Item> items = treasureChest.getIterms();
		boolean found = false;
		int tempIdx = idx;
		while(!found){
			tempIdx++;
			if(tempIdx >= items.size()){
				tempIdx = -1;
				break;
			}
			if(type.equals(ItemType.ANY) || items.get(tempIdx).getType().equals(type)){
				break;
			}
		}
		return tempIdx;
	}
	
	
	@Override
	public Item next() {
		// TODO Auto-generated method stub
		   idx = findNextIdx();
		    if (idx != -1) {
		      return treasureChest.getIterms().get(idx);
		    }
		    return null;
	}
	
}
