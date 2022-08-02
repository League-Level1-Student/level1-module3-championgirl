package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 800;
    static final int HEIGHT = 600;
    int x = 400;
    int y = 580;
    Car car1;
    @Override
    public void settings() {
    	
        size(WIDTH, HEIGHT);
        
        
       
    }

    @Override
    public void setup() {
car1 = new Car(40, 60, 40, 50);
    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(255, 0,0);
    	ellipse(16, 300, 40, 80);
    	
    	fill(0, 225, 0);
    	ellipse(x, y, 30, 30);
    	
    	rect(car1.x,car1.y,car1.size,car1.size);

  
    	
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
            	y-=1;
            }
            else if(keyCode == DOWN)
            {
                //Frog Y position goes down 
            	y+=1;
            }
            else if(keyCode == RIGHT && keepFrogInsideFromCanvas(x+1, y))
            {
                //Frog X position goes right
            	x+=1;
            	
            	
            }
            else if(keyCode == LEFT && keepFrogInsideFromCanvas (x-1, y))
            {
                //Frog X position goes left
            	x-=1;
            }   
        }
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
