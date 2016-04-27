package lesson2;

public class ObserverShow {

	public static void main(String[] args) {
		ExampleView view = new ExampleView();
		ExampleCommunication communication = new ExampleCommunication();
		communication.addObserver(view);
		communication.start();
	}
}
