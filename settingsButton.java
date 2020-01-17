import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class settingsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class settingsButton extends Actor
{
    /**
     * Act - do whatever the settingsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new BackGround1());
        }
        GreenfootImage image = getImage();
        image.scale(250, 195);
        setImage(image);
        // Add your action code here.
    }    
}
