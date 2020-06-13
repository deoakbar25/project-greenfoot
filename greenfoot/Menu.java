import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {
        super(600, 400, 1);
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        btnPlay btnplay = new btnPlay();
        addObject(btnplay,174,216);
        btnAbout btnAbout = new btnAbout();
        addObject(btnAbout,172,255);
        btnPetunjuk btnPetunjuk = new btnPetunjuk();
        addObject (btnPetunjuk, 174, 300);
       
    }
}
