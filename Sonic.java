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
    public int heartWidth;
    public int heartHeight;
    private int animationCount;
    private long frameCount = 0;
    private long lastTime;
    public int startingLives = 10;
    public int lives = 1; 
    GreenfootImage[] sonicRight = {new GreenfootImage("PNGSONIC1.png"), new GreenfootImage("PNGSONIC2.png"), new GreenfootImage("PNGSONIC3.png"), new GreenfootImage("PNGSONIC4.png"), new GreenfootImage("PNGSONIC5.png"), new GreenfootImage("PNGSONIC6.png"), new GreenfootImage("PNGSONIC7.png"), new GreenfootImage("PNGSONIC8.png"), new GreenfootImage("PNGSONIC9.png"), new GreenfootImage("PNGSONIC10.png")};
    boolean isAlive = true;
    public Heart[] hearts = new Heart[lives];
    public void act(){
    getWorld().showText("Player 2",hearts.length*50+100,60);
        frameCount++;
        speed = speed + 2;
        setLocation( getX(), getY() + speed);
        getWorld().showText("Lives : "+ lives +"",1450, 50);
            if(isTouching(Tube.class)) {
        Greenfoot.setWorld(new BackGround1());
    }
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
            while(isTouching(Floor.class) || isTouching(Tube.class))
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
            while(isTouching(Floor.class) || isTouching(Tube.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 2);
            }
        }    
        if(Greenfoot.isKeyDown("a"))
        {
            move(-10);
            while(isTouching(Floor.class) || isTouching(Tube.class))
            {
                move(2);
            } 
        } else {
            if(Greenfoot.isKeyDown("d"))
            {
                move(10);
                while(isTouching(Floor.class) || isTouching(Tube.class))
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
    public int sonicLives() {
        return lives;
    }
    public Heart[] heartCount() {
        return hearts;
    }
}
