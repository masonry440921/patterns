package memento.example_1;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
	private List<Memento> list = new ArrayList<Memento>();
	
	public void add(Memento memento){
		list.add(memento);
	}
	
	public Memento get(int index){
		return list.get(index);
	}
}
