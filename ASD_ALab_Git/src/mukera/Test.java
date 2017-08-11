package mukera;

import java.io.Serializable;
import java.util.Timer;
import java.util.TimerTask;

public class Test extends TimerTask implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;
	private int id;
	private Enum h = Enum.Instance;
	public Test(String name, int id) {
		this.name = name;
		this.id = id;
		Timer timer = new Timer();
		timer.schedule(this, 0, 5000);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public void print(){
		System.out.println("check 123 it works");
	}

	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + ", h=" + h + "]";
	}

	@Override
	public void run() {
		this.print();		
	}
	
	
}
