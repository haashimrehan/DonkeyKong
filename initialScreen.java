import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class initialScreen here.
 * A subclass for the initial menu screen
 * Will include:
 * 
 * START
 * HOW TO PLAY
 * SETTINGS (mute music, etc)
 * HIGH SCORES ? 
 * 
 * 
 * @Aaliyah
 * @version (a version number or a date)
 */
public class initialScreen extends World
{

    /**
     * Constructor for objects of class initialScreen.
     * 
     */
    boolean buttonPressed = false;
    int buttonY = 0; 
    int buttonW = 270; 
    int buttonH = 50; 
    
    int buttonX = (width)/2;
 
    
    
    public initialScreen(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        text("Hello!", 20, 40); 
    }
    
}
