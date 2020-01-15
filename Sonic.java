import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sonic here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sonic extends Actor
{
    //I used Haashims live class and just took one heart off for sonic
    //everything else is identical to marios code, but i adjusted sonics speed
    //so he is a lot faster than sonic
    int speed;
    int animationCount;
    long frameCount = 0;
    long lastTime;
    int lives = 2; 
    GreenfootImage[] sonicRight = {new GreenfootImage("PNGSONIC1.png"), new GreenfootImage("PNGSONIC2.png"), new GreenfootImage("PNGSONIC3.png"), new GreenfootImage("PNGSONIC4.png"), new GreenfootImage("PNGSONIC5.png"), new GreenfootImage("PNGSONIC6.png"), new GreenfootImage("PNGSONIC7.png"), new GreenfootImage("PNGSONIC8.png"), new GreenfootImage("PNGSONIC9.png"), new GreenfootImage("PNGSONIC10.png")};
    boolean isAlive = true;
    public Heart[] hearts = new Heart[lives];
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
        getWorld().showText("Lives : "+ lives +"",1450, 50);
         if(lives == 0)
        {
            getWorld().removeObject(this);
            isAlive = false;
        }
        else {
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            getWorld().removeObject(hearts[lives-1]);
            lives = lives - 1;
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
                if(frameCount%7 == 0) {
                    animationCount++;
                    if(animationCount < 8) {
                        setImage(sonicRight[animationCount]);
                    }
                    else {
                        animationCount = 5;
                    }
                }
            }
            else {
                animationCount = 0;
                setImage(sonicRight[0]);
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
