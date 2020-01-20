import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class pressEnterText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class pressEnterText extends Actor
{
    /**
     * Act - do whatever the pressEnterText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(800, 1000);
        setImage(image);
        //setLocation(515, 560); 
        // Add your action code here.
    }    
}
