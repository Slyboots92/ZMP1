
public class Main {

	public static void main(String[] args) {
		
		ProgressBarDemo demo = new ProgressBarDemo();
		ThreadShow thread = new ThreadShow(demo);
		thread.start();
	}

}
