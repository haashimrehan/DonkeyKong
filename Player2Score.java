import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player2Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2Score extends ScoreCounter
{
    public void act() 
    {
        setImage(new GreenfootImage("Player 2" + " Score: " + currentScore, 24, Color.WHITE, Color.BLACK));
    }    
    public void resetScore() {
        currentScore = 0;
    }
}
