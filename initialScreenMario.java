import greenfoot.*;
public class InitialScreenMario extends Actor
{
    boolean changeImage = false;
    String[] imageNames = {"MarioStandingStillRight.png","MarioWalkLeft.png","MarioWalkRight.png","MarioStandingStill.png" };  

    int speed;
    long frameCount = 0;
    long lastTime; 

    public void act() 
    {
        frameCount++;

        speed = speed + 1;
        setLocation(getX(), getY() + speed);
 
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);

            if (frameCount %20 ==0) {
                    changeImage = !changeImage;
                }
                if(changeImage) {
                    setImage(imageNames[1]);
                }         else {
                    setImage(imageNames[3]);
                }

        } else {
            if(Greenfoot.isKeyDown("right"))
            {
                if (frameCount %20 ==0) {
                    changeImage = !changeImage;
                }
                if(changeImage) {
                    setImage(imageNames[2]);
                }         else {
                    setImage(imageNames[0]);
                }

                move(5);
                // setImage(imageNames[2]);

            } else{
                setImage(imageNames[0]);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 50;
        }
    } 
}
