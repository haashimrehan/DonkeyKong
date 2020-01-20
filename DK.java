import greenfoot.*;
public class DK extends Actor
{
    boolean changeImage = false; // set boolean to false
    long frameCount = 0; // set frame count (timer) to 0
    
    // different donkey kong images in a array
    String[] imageNames = {"DKRightHand.png","DKLeftHand.png","DKIdol.png","DKAngryIdol.png" };  
    long lastTime;
    public void act() 
    {
        frameCount++; // count frames ( as a somewhat timer)

                
        if(isTouching(Mario.class))
        {
            Greenfoot.setWorld(new Finish());

            //Greenfoot.stop();
        }
        else if(isTouching(Sonic.class))
        {
            Greenfoot.setWorld(new Finish());

            //Greenfoot.stop();
        }
        
         // add barrel counter
        if (frameCount %150 ==0) { // every 150 frames 

            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY()); // add a new barrel
        }

                
        if (frameCount %75 ==0) { // controls the sprite change (every 75 frames)
            changeImage = !changeImage; // change the boolean changeimage

        }
        if(changeImage) { // boolean change the sprite image
            setImage(imageNames[2]);

        }         else { // else keep the original image
            setImage(imageNames[3]);
        }

    } 
}

