package _06_frogger;
import processing.core.PApplet;
public class Car extends PApplet {
	int x = 500;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	int y = 680;
	int speed = 50;
	int size = 150;
	public Car(int x, int y, int speed, int size) {
		// TODO Auto-generated constructor stub
		      this.x = x;
		      this.y = y ;
		      this.speed = speed;
		      this.size = size;
		      
		  
		
	}
	
	//void display()
	 // {
	  //  fill(0,255,0);
	 //   rect(x , y,  size, 50);
	  //}
	
	
	
	
}
