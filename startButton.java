import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButton extends Actor
{
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
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
}
