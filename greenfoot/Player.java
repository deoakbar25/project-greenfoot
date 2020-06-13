import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    /**
     * Act - do whatever the Player wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    MyWorld myWorld = (MyWorld)getWorld();
    int r, g, b, player;
    int count = 0;
    int speed = 3;
    public Player(int r, int g, int b)
    {
        setRotation(270);
        this.r = r;
        this.g = g;
        this.b = b;
        getImage().setColor(new Color(r,g,b));
        getImage().fillRect(0,0,40,40);
    }
    public void act() 
    {
        count++;
        getWorld().addObject(new Tail(r, g, b), getX(),getY());
        move(speed);
        moveAround();
        eatFood();
        }    
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("right"))
           setRotation(0);
        if(Greenfoot.isKeyDown("left"))
           setRotation(180);
        if(Greenfoot.isKeyDown("up"))
           setRotation(270);
        if(Greenfoot.isKeyDown("down"))
           setRotation(90);
    }
    public void eatFood()
    {
        if(isTouching(Food.class) && player == 0)
        {
            MyWorld myWorld = (MyWorld)getWorld();
            myWorld.blueCounter.addScore();
        }
    }
}
