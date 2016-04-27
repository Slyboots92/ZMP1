package lesson2;

import java.util.Observable;
import java.util.Observer;

public class ExampleView implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println(arg);
		
	}

}
