package composite.lettercomposite;

import java.util.List;

public class Sentence extends  LetterComposite{
	public Sentence(List<Word> words) {
		// TODO Auto-generated constructor stub
		for(Word w:words){
			this.add(w);
		}
	}
	@Override
	public void printeThisBefore() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void printeThisAfter() {
		// TODO Auto-generated method stub
		System.out.println(".");
	}

}
