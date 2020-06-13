import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    Player bluePlayer = new Player(0,0,255);
    Counter blueCounter = new Counter();
    int count = 0;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        addObject(bluePlayer, 300, 300);
        addObject(blueCounter, 300, 50);
    }
    public void act()
    {
        count++;
        if(count >100){
        addObject(new Food(255, 0, 0), Greenfoot.getRandomNumber(getWidth() -1), Greenfoot.getRandomNumber(getHeight() -1));
        count = 0;
    }
    }
}
