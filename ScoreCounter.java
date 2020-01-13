import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreCounter extends Actor
{
    int currentScore = 0;
    int player = 0;
    /**
     * Act - do whatever the ScoreCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Player 1" + " Score: " + currentScore, 24, Color.WHITE, Color.BLACK));
    }  //updates the score whenever a coin is touched
    public void newScore() {
        currentScore++;
    } //method to use in the world class to add score
    
    public void resetScore() {
        currentScore = 0;
    } //resets score when called
}
