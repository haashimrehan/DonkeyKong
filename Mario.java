import greenfoot.*;
public class Mario extends Actor
{
    boolean changeImage = false;
    String[] imageNames = {"MarioStandingStillRight.png","MarioWalkLeft.png","MarioWalkRight.png","MarioStandingStill.png" };  

    int speed;
    long frameCount = 0;
    long lastTime;
    int maxLives = 3;
    int lives = 3; 
    boolean isAlive = true;
    public Heart[] hearts = new Heart[lives];
    protected void addedToWorld(World world){
        getWorld().showText("Player 1",hearts.length*50+30,20);
        for(int i = 0; i < hearts.length; i++) {
            hearts[i] = new Heart();
            getWorld().addObject(hearts[i],i*40+25,20);
        }

    }

    public void act() 
    {
        frameCount++;

        speed = speed + 1;
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
                if(Greenfoot.isKeyDown("up"))
                {
                    speed = - 27;
                }
            }
        }
        if(speed <= 0)
        {
            while(isTouching(Floor.class))
            {
                speed = 0;
                setLocation(getX(), getY() + 1);
            }
        }    
        if(Greenfoot.isKeyDown("left"))
        {
            move(-5);
            /*if(System.currentTimeMillis() - lastTime > 500 && Marioimage.equals("mariopixelCopy.png"))
            {
            Marioimage = "marioleft.png";
            setImage("marioleft.png");
            lastTime = System.currentTimeMillis();
            } else {
            if(System.currentTimeMillis() - lastTime > 500)
            {
            Marioimage = "mariopixelCopy.png";
            setImage("mariopixelCopy.png");
            lastTime = System.currentTimeMillis();
            }
            } */
     if (frameCount %20 ==0) {
                    changeImage = !changeImage;
                }
                if(changeImage) {
                    setImage(imageNames[1]);
                }         else {
                    setImage(imageNames[3]);
                }

            while(isTouching(Floor.class))
            {
                move(1);
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
                while(isTouching(Floor.class))
                {
                    move(-1);
                }
            } else{
                setImage(imageNames[0]);
            }
        }
        if(Greenfoot.isKeyDown("down"))
        {
            speed = 50;
        }
    }
    
    if (isTouching(PowerUp.class) && lives < maxLives) {
        removeTouching(PowerUp.class);
        getWorld().addObject(hearts[lives-1],(lives-1)*40+25,20);
    lives++;
    
    }
    } 
    public boolean getBool() {
        return isAlive;
    }
}
