package zad2;

enum state {
	CREATED,RUNNING,ABORTED,READY
};
public class StringTask implements Runnable {
	Thread th;
	String result="";
	String word;
	state stan=null; 
	int iloscWywolan;
	
	
	public StringTask(String word, int iloscWywolan) {
		this.word=word;
		this.iloscWywolan=iloscWywolan;
		stan=state.CREATED;
		th=new Thread(this);
	}
	public void start() {
		stan=state.RUNNING;
		th.start();
	}
	public state getState() {
		return stan;
	}

	public void run() {
		for(int i=0; i<iloscWywolan && !th.isInterrupted();i++){
		this.result+=word;
		}
		stan=state.READY;
	}

	public boolean isDone() {
			return stan==state.ABORTED || stan==state.READY;
	}

	public String getResult() {
		return result;
	}
	public void abort(){
		th.interrupt();
		stan=state.ABORTED;
		
	}

	
	
}
