package _06_frogger;

import processing.core.PApplet;

public class Frogger extends PApplet {
    static final int WIDTH = 600;
    static final int HEIGHT = 400;
    
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
    }
    static public void main(String[] args) {
        PApplet.main(Frogger.class.getName());
    }
}
