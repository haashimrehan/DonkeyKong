import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sonic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sonic extends Actor
{
    int speed;
    long frameCount = 0;
    long lastTime;
    int Lives = 2; 
    boolean isAlive = true;
    public Heart[] hearts = new Heart[Lives];
        protected void addedToWorld(World world){
        getWorld().showText("Player 2",hearts.length*50+30,60);
        for(int i = 0; i < hearts.length; i++) {
            hearts[i] = new Heart();
            getWorld().addObject(hearts[i],i*40+25,60);
        }
    }
    public void act() 
    {
        frameCount++;
        speed = speed + 2;
        setLocation( getX(), getY() + speed);
        getWorld().showText("Lives : "+ Lives +"",1450, 50);
         if(Lives == 0)
        {
            getWorld().removeObject(this);
            isAlive = false;
        }
        else {
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            getWorld().removeObject(hearts[Lives-1]);
            Lives = Lives - 1;
        }
        if(speed > 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() - 1);
                if(Greenfoot.isKeyDown("w"))
                {
                    speed = - 40;
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 2);
            }
        }    
        if(Greenfoot.isKeyDown("a"))
        {
            move(-10);
            while(isTouching(Floor.class))
            {
                move(2);
            } 
        } else {
            if(Greenfoot.isKeyDown("d"))
            {
                move(10);
                while(isTouching(Floor.class))
                {
                    move(-2);
                }
            }
        }
        if(Greenfoot.isKeyDown("s"))
        {
            speed = 50;
        }
    }
    }    
       public boolean getBool() {
        return isAlive;
    }
}
