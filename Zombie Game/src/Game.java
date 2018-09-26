import java.awt.*;
import java.awt.Canvas;


public class Game extends Canvas implements Runnable {

	public static int WIDTH = 800, HEIGHT = 608;
	public String title = "Zombie Game";
	
	public Game() {
		//Constructor
		new Window(WIDTH, HEIGHT, title, this);
	}
	
	//Game Loop 
	public void run() {
		
		
	}

	public static void main(String args[]) {
		new Game();
	}
}
