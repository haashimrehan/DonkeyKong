import greenfoot.*;
public class DK extends Actor
{
    boolean changeImage = false;
    long frameCount = 0;
    String[] imageNames = {"DKRightHand.png","DKLeftHand.png","DKIdol.png","DKAngryIdol.png" };  
    long lastTime;
    public void act() 
    {
        frameCount++;

                
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
        if(System.currentTimeMillis() - lastTime > 2500)

        {

        }
         
        if (frameCount %150 ==0) {

            lastTime = System.currentTimeMillis();
            getWorld().addObject(new Barrel(), getX(), getY());
        }

                
        if (frameCount %75 ==0) {
            changeImage = !changeImage;

        }
        if(changeImage) {
            setImage(imageNames[2]);

        }         else {
            setImage(imageNames[3]);
        }

    } 
}

