
public class ThreadShow extends Thread{
	
	private ProgressBarDemo bar;
	int currentValue;
	public  ThreadShow(ProgressBarDemo demo) {
		bar=demo;
		currentValue=0;
	}
	
	@Override
	public void run() {
		while(true){
			bar.getBar().setValue(currentValue);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			currentValue=currentValue+5;
		}
	}
}
