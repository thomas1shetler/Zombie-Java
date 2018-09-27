import java.awt.*;
import java.awt.Canvas;

//2D Zombie Survival
//coded by Thomas Shetler
//intial Dev version 0.0.1



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
		//starting game
		if(isRunning) return;
		
		thread = new Thread(this);
		thread.start();
		isRunning = true;
				
	}
	
	private synchronized void stop() {
		//stopping game
		if(!isRunning) return; 
		
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		isRunning = false;
		
	}
	//Game Loop 
	public void run() {
		long lastTime = System.nanoTime();
		double amountOfTicks = 60.0;
		double ns = 1000000000 / amountOfTicks;
		double delta = 0;
		long timer = System.currentTimeMillis();
		int updates = 0;
		int frames = 0;
		while(isRunning){
			long now = System.nanoTime();
			delta += (now - lastTime) / ns;
			lastTime = now;
			while(delta >= 1){
				tick();
				updates++;
				delta--;
			}
			render();
			frames++;
					
			if(System.currentTimeMillis() - timer > 1000){
				timer += 1000;
				System.out.println("FPS: " + frames + " TICKS: " + updates);
				frames = 0;
				updates = 0;
				//pre-made start up loop made by 
			}
		}
		stop();
	}
	
	private void tick() {
		
	}
	
	private void render() {
		
	}
	
	public static void main(String args[]) {
		new Game();
	}
}
