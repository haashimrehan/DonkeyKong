import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Toolkit;
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
public class InitialScreen extends World
{
    boolean changeImage= false;
    long frameCount = 0; 
    long lastTime;
    private static final int w = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.80);
    private static final int h = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.80);

    String[] initialImages = {"DonkeyKongLogo[1].png", "DKAngryIdol.png", "pressEnter.png"};  
    
    /**
     * Constructor for objects of class initialScreen.
     * 
     */
    boolean buttonPressed = false;
    int buttonY = 0; 
    int buttonW = 270; 
    int buttonH = 50; 
    //int width = 600;
    //int height = 400;
    int gameScreen = 0; 
    //int buttonX = width/2; 
    
    public void act(){
        frameCount++;
               if (Greenfoot.isKeyDown("enter"))
        {
         Greenfoot.setWorld(new BackGround1());
       }
    }
    public InitialScreen(){    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        GreenfootImage bg = new GreenfootImage("startScreen.png");
         bg.scale(getWidth(), getHeight());
         setBackground(bg); 
         //addObject(new pressEnterText(), 515, 560);
         addObject(new InitialScreenMario(), 450, 500);
         addObject(new StartButton(), w/2, h/2+150);
         addObject(new HowToPlayButton(), w/2-15, h/2+350);
         

    }
    
    
}
