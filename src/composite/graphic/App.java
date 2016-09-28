package composite.graphic;

public class App {

	  /**
	   * Program entry point
	   * 
	   * @param args command line args
	   */
	  public static void main(String[] args) {
	    System.out.println("Message from the orcs: ");

	    LetterComposite orcMessage = new Messenger().messageFromOrcs();
	    orcMessage.print();

	    System.out.println("\n");

	    System.out.println("Message from the elves: ");

	    LetterComposite elfMessage = new Messenger().messageFromElves();
	    elfMessage.print();
	  }
	}