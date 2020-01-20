import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    Heart[] sonicHearts = SonicLeel.numOfHearts();
    public void act() 
    {
        GreenfootImage image = getImage();
        
        setImage(image);
        //setLocation(515, 560); 
        // Add your action code here.
    }    

}
