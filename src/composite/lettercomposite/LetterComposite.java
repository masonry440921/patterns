package composite.lettercomposite;

import java.util.ArrayList;
import java.util.List;

public abstract class LetterComposite {
	
	public List<LetterComposite> children = new ArrayList<LetterComposite>();
		
	public void add(LetterComposite lc){
		children.add(lc);
	}
	
	public int count(){
		return children.size();
	}
	
	public abstract void printeThisBefore();
	
	public abstract void printeThisAfter();
	
	public void printer(){
		printeThisBefore();
		for(LetterComposite lc :children){
			
			lc.printer();
		}
		printeThisAfter();
	}
}
