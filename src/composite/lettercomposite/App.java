package composite.lettercomposite;

public class App {
public static void main(String[] args) {
	  System.out.println("Message from the orcs: ");

	    LetterComposite orcMessage = new Messenger().messageFromOrcs();
	    orcMessage.printer();

	    System.out.println("\n");

	    System.out.println("Message from the elves: ");

	    LetterComposite elfMessage = new Messenger().messageFromElves();
	elfMessage.printer();
}
}
