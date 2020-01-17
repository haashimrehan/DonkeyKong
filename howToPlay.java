import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Toolkit;
/**
 * Write a description of class howToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class howToPlay extends World
{
    String[] imageNames = {"howToPlay.png","controls.png"};  
    private static final int w = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.80);
    private static final int h = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.80);
    /**
     * Constructor for objects of class howToPlay.
     * 
     */
    public howToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1);
        //setImage("howToPlay.png");
        
    }
}
