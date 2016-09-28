package composite.lettercomposite;

import java.util.List;

public class Word extends LetterComposite{
	public  Word(List<Letter> list) {
		// TODO Auto-generated method stub
		for(Letter l:list){
			this.add(l);
		}
	}
	@Override
	public void printeThisBefore() {
		// TODO Auto-generated method stub
		System.out.print(" ");
	}

	@Override
	public void printeThisAfter() {
		// TODO Auto-generated method stub
		
	}

}
