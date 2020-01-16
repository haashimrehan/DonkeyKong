import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class howToPlayButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class howToPlayButton extends Actor
{
    /**
     * Act - do whatever the howToPlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if (Greenfoot.mousePressed(this))
        {
            Greenfoot.setWorld(new BackGround1());
        }
        GreenfootImage image = getImage();
        image.scale(150, 75);
        setImage(image);
    }
    // Add your action code here.
}    

