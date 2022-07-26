package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    int x = 400;
    int y = 580;
    @Override
    public void settings() {
    	
        size(WIDTH, HEIGHT);
        
        
        size(800, 600);
    }

    @Override
    public void setup() {

    }

    @Override
    public void draw() {
    	background(0,0,255);
    	fill(255, 0,0);
    	ellipse(16, 300, 40, 80);
    	
    	fill(0, 225, 0);
    	ellipse(x, y, 30, 30);

  
    	
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
