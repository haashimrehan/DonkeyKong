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
        for(int i = 0; i < SonicLeel.returnLives(); i++) {
            //if(this.getX() != sonicHearts[i].getX() && this.getY() != sonicHearts[i].getY()) {
            //    getWorld().removeObject(this);
            //}
    }
    }    

}
