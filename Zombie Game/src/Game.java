import java.awt.*;
import java.awt.Canvas;


public class Game extends Canvas implements Runnable {

	public static int WIDTH = 800, HEIGHT = 608;
	public String title = "Zombie Game";
	
	private Thread thread;
	private boolean isRunning = false;	 
	//is game running or not?
	
	public Game() {
		//Constructor
		new Window(WIDTH, HEIGHT, title, this);
	}
	
	private synchronized void start (){
		if(isRunning) return;
		
	}
	
	private synchronized void stop() {
		if(!isRunning) return; 
	}
	//Game Loop 
	public void run() {
		
		
	}

	public static void main(String args[]) {
		new Game();
	}
}
