package _06_frogger;

import processing.core.PApplet;
import processing.core.PImage;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 580;
    Car car1;
    Car car2;
    PImage frog;
    PImage carLeft;
    PImage carRight;
    PImage froggerBackground;
    @Override
    public void settings() {
    	
        size(WIDTH, HEIGHT);
        
        
       
    }
    
    
    
    

    @Override
    public void setup() {
car1 = new Car(40, 100, 5, 90);
car2 = new Car(100,200,5,90);

froggerBackground = loadImage("src/_06_frogger/froggerBackground.png");
froggerBackground.resize(WIDTH,HEIGHT);
carLeft = loadImage("src/_06_frogger/carLeft.png");
carLeft.resize(160,100);
carRight = loadImage("src/_06_frogger/carRight.png");
carRight.resize(160,100);
frog = loadImage("src/_06_frogger/frog.png");
frog.resize(75,75);

    }

    @Override
    public void draw() {
   
    	background(froggerBackground);
        image (carLeft,car1.x,car1.y);
        image (carRight,car2.x, car2.y);
        image (frog, x, y);

    	
    car1.carMoveLeft();
    car2.carMoveRight();
   
    
  
    
    if(intersects(car1) || intersects (car2)) {
    x=400;
    y = 580;
    }
    
    
    
 
    
   
    	
    }
    
   public boolean keepFrogInsideFromCanvas(int x, int y){
    	if(x>601) {
    		return false;
    	}
    	else if(x<=0){
    	   return false;
    	   
   
    	   
    	}
    	
    	return true;
    	
    }
    
   
   
   
   
   
   
    
    public void keyPressed()
    {
        if(key == CODED){
            if(keyCode == UP)
            {
                //Frog Y position goes up
            	y-=5;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y+=5;
            }
            else if(keyCode == RIGHT && keepFrogInsideFromCanvas(x+1, y))
            {
                //Frog X position goes right
            	x+=5;
            	
            	
            }
            else if(keyCode == LEFT && keepFrogInsideFromCanvas (x-1, y))
            {
                //Frog X position goes left
            	x-=5;
            }   
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
    
    boolean intersects(Car car) {
    	 if ((y > car.getY() && y < car.getY()+50) &&
    	                (x > car.getX() && x < car.getX()+car.getSize())) {
    	   return true;
    	  }
    	 else  {
    	  return false;
    	 }
    	 
    }
    
}
