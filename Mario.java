import greenfoot.*;
public class Mario extends Actor
{
    boolean changeImage = false;
    String[] imageNames = {"MarioStandingStillRight.png","MarioRunLeft.png","MarioRunRight.png"};  
    int speed;
    long frameCount = 0;
    long lastTime;
    int Lives = 3; 
    public Heart[] hearts = new Heart[Lives];
    protected void addedToWorld(World world){

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
        getWorld().showText("Lives : "+ Lives +"",1450, 50);
        if(isTouching(Barrel.class))
        {
            removeTouching(Barrel.class);
            getWorld().removeObject(hearts[Lives-1]);
            Lives = Lives - 1;
        }
        if(Lives == 0)
        {
            getWorld().showText("GAME OVER", 750, 600);
            Greenfoot.stop();
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
            if (changeImage) {
                setImage(imageNames[1]);
            } else {
                setImage(imageNames[0]);}
            changeImage = !changeImage;

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
}
