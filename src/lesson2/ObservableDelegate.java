package lesson2;

import java.util.Observable;

public class ObservableDelegate extends Observable{
	public void myNotifyObservers(Object arg){
		setChanged();
		notifyObservers(arg);
		
	}

}
