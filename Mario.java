import greenfoot.*;
public class Mario extends Actor
{
    boolean changeImage = false; // set boolean to false
    
    // Different pictures/sprites for mario in an array
    String[] imageNames = {"MarioStandingStillRight.png","MarioWalkLeft.png","MarioWalkRight.png","MarioStandingStill.png","mariopixel.png","mariopixelCopy2.png" };  

    //variabgles:
    int speed;
    long frameCount = 0; // set frame count (timer) to 0
    long lastTime;

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
        //add a frame counter (time)
        frameCount++;

        speed = speed + 1; // set speed
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
        if(Greenfoot.isKeyDown("left")) // if left is pressed
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
            
            //counts the time to change mario to a walking sprite to look more realistic
     if (frameCount %20 ==0) { // every frameCount modulo 20 change the boolean to false ( 20 frames )
                    changeImage = !changeImage;
                }
                if(changeImage) { 
                    setImage(imageNames[1]); // change the walking image 
                }         else {
                    setImage(imageNames[3]); //re-change the walking image
                }

            while(isTouching(Floor.class))
            {
                move(1);
            } 
        } 
        
        
        else {
            //this controls when the walking right image is displayed
            if(Greenfoot.isKeyDown("right"))
            {
                if (frameCount %20 ==0) { // every frameCount modulo 20 ( 20 frames)
                    changeImage = !changeImage; // change boolean
                }
                if(changeImage) {
                    setImage(imageNames[2]); // change the walking image
                }         else {
                    setImage(imageNames[0]); // re-change the image
                }

                
                move(5);
                
                // setImage(imageNames[2]);
                while(isTouching(Floor.class))
                {
                    move(-1);
                }
            } else{
                setImage(imageNames[0]); // chang the image 
            }
        }
        if(Greenfoot.isKeyDown("down")) // if down is pressed
        {
            speed = 50;
        }
       
        // add jump sprite for when mario jumps right and left
           if(Greenfoot.isKeyDown("up"))
                {
                    setImage(imageNames[4]); // change image to jumping
                }
                // change image to jumping to left ( when up and left are pressed)
                if(Greenfoot.isKeyDown("up") && Greenfoot.isKeyDown("left"))
                {
                    setImage(imageNames[5]); // change image to jump and left
                }        
                
    }
    } 
    public boolean getBool() {
        return isAlive;
    }
}
