import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HTPRules here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HTPRules extends Actor
{
    /**
     * Act - do whatever the HTPRules wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();            
        image.scale(405, 300);   
        setImage(image);
        // Add your action code here.
    }    
}
