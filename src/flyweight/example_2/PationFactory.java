package flyweight.example_2;

import java.util.EnumMap;
import java.util.Map;

public class PationFactory {
	private final Map<PotionType,Potion>potions;
	
	public PationFactory() {
		// TODO Auto-generated constructor stub
		potions = new EnumMap<>(PotionType.class);
	}
	
	Potion createPotion(PotionType type){
		Potion potion = potions.get(type);
		if(potion == null){
				switch(type){
				case HEALING:
					potion = new HealingPotion();
					potions.put(type, potion);
					break;
				case HOLY_WATER:
					potion = new HolyWaterPotion();
					potions.put(type, potion);
					break;
				case STRENGTH:
					potion = new StrengthPotion();
					potions.put(type, potion);
					break;
				default:
					break;
			}
				
		}
		return potion;
	}
	
	
}
