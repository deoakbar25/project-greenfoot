import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Tail here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tail extends Actor
{
    /**
     * Act - do whatever the Tail wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int r, g , b, player;
    int countLength = 0;
    static int blueLength = 1;
     public Tail( int r, int g, int b)
    {
       this.r = r;
       this.g = g;
       this.b = b; 
       getImage().setColor(new Color(r,g,b));
       getImage().fillRect(0,0,40,40);
       
       
    }
    
    public void act() 
    {
        countLength++;
        if(countLength>15 && isTouching(Player.class))
        {
            getWorld().addObject(new YouLose(),getWorld().getWidth()/2, getWorld().getHeight()/2);
            Greenfoot.stop();
        }
        
        if (countLength > 100 )
        {
            getWorld().removeObject(this);                      
        }
        // Add your action code here.
    }    
}
