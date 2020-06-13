import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnBack here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnBack extends Actor
{
    /**
     * Act - do whatever the btnback wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new Menu());
        }
    }    
}

