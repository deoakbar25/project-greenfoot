import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class btnPetunjuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class btnPetunjuk extends Actor
{
    /**
     * Act - do whatever the btnPetunjuk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this) )  
        {   
            Greenfoot.setWorld(new Petunjuk()); 

        }
        // Add your action code here.
    }    
}
