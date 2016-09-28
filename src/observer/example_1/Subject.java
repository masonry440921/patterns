package observer.example_1;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	
	//关键存放观测者，再实现观测者
	private List<Observer> observers = new ArrayList<Observer>();
	private int state;
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
		notifyAllObservers();
	}
	
	public void attach(Observer observer){
		observers.add(observer);
	}
	
	public void notifyAllObservers(){
		for(Observer o: observers){
			o.update();
		}
	}
}
