import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import java.awt.*;
/**
 * Write a description of class pressEnterText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HTPImageText extends Actor
{
    public HTPImageText(String text){
        GreenfootImage img = new GreenfootImage(text.length()*20, 30);
        img.setColor(Color.GREEN);
        img.drawString(text, 10, 30);
        setImage(img);
    }

    public void setText(String text){
        GreenfootImage img = getImage(); //getting image
        img.clear();
        img.drawString(text, 10, 30); //redrawing string
    }
}