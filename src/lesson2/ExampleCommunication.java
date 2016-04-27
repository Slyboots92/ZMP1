package lesson2;

import java.util.Observable;
import java.util.Observer;

public class ExampleCommunication extends Thread{

	private ObservableDelegate delegate= new ObservableDelegate();
	public void addObserver(Observer observer){
		delegate.addObserver(observer);
	}
	@Override
	public void run() {
		while(true){
			try {
				delegate.myNotifyObservers("sygnal");
				System.out.println("wyslano sygnal ");
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

	
}
