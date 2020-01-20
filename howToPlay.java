import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Toolkit;
/**
 * Write a description of class howToPlay here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HowToPlay extends World
{
    String[] imageNames = {"howToPlay.png","controls.png"};  
    private static final int w = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.80);
    private static final int h = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.80);
    /**
     * Constructor for objects of class howToPlay.
     * 
     */
    public void act(){
               if (Greenfoot.isKeyDown("space"))
        {
         Greenfoot.setWorld(new InitialScreen());
       }

    }
    public HowToPlay()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1);
        //getHowToPlay().drawImage(new GreenfootImage("Text to display", 64, null, null), 40, 40);
        addObject(new HTPImage(), 100, 300); //coin
        addObject(new HTPImage2(),w/2, h/2+100); //controls
        addObject(new HTPTextMain(), w/2, 170);
        addObject(new HTPRules(), w/4 +600, 400);
        addObject(new HTPExitText(), w/2, h/4 + 500);
        addObject(new HTPHeart(), 100, 350);
        addObject(new HTPMario(), 100, 420);
        addObject(new HTPSonic(), 100, 480);
        addObject(new HTPTexts(), 240, 550);
        addObject(new HTPBarrel(), 100, 540);
        addObject(new HTPkeys(), w/2, h/2 +75);
        //setImage("howToPlay.png");
        
    }
}
