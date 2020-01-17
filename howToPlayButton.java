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
        if (Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new howToPlay());
        }
        GreenfootImage howto = getImage();
        howto.scale(300, 200);
        setImage(howto);
    }
    // Add your action code here.
}    

