import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Coin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Coin extends Actor
{
    /**
     * Act - do whatever the Coin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isTouching(Mario.class)) {
           getWorld().removeObject(this);
           BackGround1.addScore();
        }
        else if(isTouching(Sonic.class)) {
           getWorld().removeObject(this);
           BackGround1.addScore2();
        } 
        //if these if methods in the at method are met, depending on who
        //it will either add sore to either mario or sonics score depending
        //on who touched the coin
    }    
}
