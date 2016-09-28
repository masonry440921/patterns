package flyweight.example_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AlchemistShop {
	  private List<Potion> topShelf;
	  private List<Potion> bottomShelf;
	  
	  public AlchemistShop() {
		// TODO Auto-generated constructor stub
		  topShelf = new ArrayList<Potion>();
		  this.bottomShelf = new ArrayList<Potion>();
		  fillShelves();
	  }

	private void fillShelves() {
		PationFactory factory = new PationFactory();
		// TODO Auto-generated method stub
		topShelf.add(factory.createPotion(PotionType.HEALING));
		topShelf.add(factory.createPotion(PotionType.HOLY_WATER));
		topShelf.add(factory.createPotion(PotionType.STRENGTH));
		
		bottomShelf.add(factory.createPotion(PotionType.HEALING));
		bottomShelf.add(factory.createPotion(PotionType.HOLY_WATER));
		bottomShelf.add(factory.createPotion(PotionType.STRENGTH));
		
	}
	
	public final List<Potion> getTopShelf(){
		return Collections.unmodifiableList(this.topShelf);
	}
	
	public final List<Potion> getBottmShelf(){
		return Collections.unmodifiableList(this.bottomShelf);
	}
	
	public void enumerate(){
		 System.out.println("Enumerating top shelf potions\n");
		 for(Potion p:topShelf){
			 p.drink();
		 }
		 System.out.println("\nEnumerating bottom shelf potions\n");
		 for(Potion p: bottomShelf){
			 p.drink();
		 }
	}
}
