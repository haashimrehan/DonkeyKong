import greenfoot.*;
import java.awt.Toolkit;
import java.awt.Dimension;
public class SonicLeel extends World
{
    // TODO: set all of the standards according to the height of the screen
    // Gets resolution of current display
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
    public static int width = (int)(screenSize.getWidth()-200); 
    public static int height = (int)(screenSize.getHeight()/1.4);
    private Scroller scroller;
    private Actor scrollActor;
    private int worldLength = 5000;
    private int random;
    
    public void act() {
        scroll();
        
    }
    public SonicLeel()
    {    // Scales the size of the screen
        super(width, height, 1, false);
        GreenfootImage backImage = new GreenfootImage("GameBackground.png");
        scroller = new Scroller(this, backImage, worldLength, height);
        scrollActor = new Mario();
        addObject(scrollActor, 20, (height-120));
        for(int i = 0; i <= worldLength; i += 200)// This is for the basic floor 
                addObject(new Floor2(), i, height-50);
        for(int i = 0; i < worldLength; i += 1000)// This is for the secondary floor, change after += to change the distance. 
                addObject(new Floor(), i, height/2);  
    }
   
    private void scroll () {
        if(scrollActor.getX() < 10) {
            scrollActor.setLocation(10, scrollActor.getY());
        }
        int dsx, dsy;
        dsx = scrollActor.getX()-500;
        dsy = 0;
        scroller.scroll(dsx, dsy);
    }
}
