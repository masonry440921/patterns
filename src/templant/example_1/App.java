package templant.example_1;
import java.awt.LayoutManager;
public class App {
	public static void main(String[] args) {
		Game g = new Cricket();
		Game g2 = new Football();
		g.play();
		g2.play();
	}
}
