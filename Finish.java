import greenfoot.*;

/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{

    /**
     * Constructor for objects of class Finish.
     * 
     */
    public Finish()
    {   
        super(800, 800, 1); 
        String[] imageNames = {"MarioStandingStillRight.png","MarioRunLeft.png","MarioRunRight.png"}; 
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        addObject(new Floor2(), 125, 1000);
        addObject(new Floor2(), 375, 1000);
        addObject(new Floor2(), 625, 1000);
        addObject(new Floor2(), 875, 1000);
        addObject(new Floor2(), 1125, 1000);
        addObject(new Floor2(), 1375, 1000);
        addObject(new Princess(), 145, 940);
        addObject(new Mario(), 85, 940);
        //setImage(imageNames[0]);
        showText("YOU WIN", 250, 250);
    }
}
