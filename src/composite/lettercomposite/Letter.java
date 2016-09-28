package composite.lettercomposite;

public class Letter extends LetterComposite{
	private char c;
	
	public Letter(char c) {
		// TODO Auto-generated constructor stub
		this.c = c;
	}
	@Override
	public void printeThisBefore() {
		// TODO Auto-generated method stub
		System.out.print(c);
	}

	@Override
	public void printeThisAfter() {
		// TODO Auto-generated method stub
		
	}

}
