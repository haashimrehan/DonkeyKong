import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PowerUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PowerUp extends Actor
{
    /**
     * Act - do whatever the PowerUp wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        this.setImage("Heart.png");
           if (this.isTouching(Mario.class) || this.isTouching(Sonic.class)) {
        getWorld().removeObject(this);
        }
        // Add your action code here.
    }    
}
