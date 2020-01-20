import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class HTPExitText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HTPExitText extends Actor
{
    /**
     * Act - do whatever the HTPExitText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage image = getImage();
        image.scale(250, 200);
        setImage(image);
        // Add your action code here.
    }    
}
