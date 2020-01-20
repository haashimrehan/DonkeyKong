import greenfoot.*;
import java.awt.Toolkit;
/**
 * Write a description of class Finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Finish extends World
{
 private static final int w = (int)(Toolkit.getDefaultToolkit().getScreenSize().getWidth()*0.80);
    private static final int h = (int)(Toolkit.getDefaultToolkit().getScreenSize().getHeight()*0.80);
    /**
     * Constructor for objects of class Finish.
     * 
     */
        public void act(){
               if (Greenfoot.isKeyDown("space"))
        {
         Greenfoot.setWorld(new InitialScreen());
       }
  
    }
    public Finish()
    {    
       
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(w, h, 1); 
        GreenfootImage bg = new GreenfootImage("board.jpg");
         bg.scale(getWidth(), getHeight());
         setBackground(bg); 
        addObject(new FinishImage(), w/2, h/2);
    }
}
