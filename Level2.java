import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{

    /**
     * Constructor for objects of class Level2.
     * 
     */
  //  public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize(); 
    //public static int width = (int)(screenSize.getWidth()-200); 
  //  public static int height = (int)(screenSize.getHeight()/1.4);
    private Scroller scroller;
    private Actor scrollActor;
    
    int width = 600;
    int height = 700;
    private int worldHeight = 5000;
    private int worldLength = 800;
    
    static Mario m = new Mario();
    
    public void act() {
    scroll();
    }
    
    public Level2()
    {    
   super(800,800,1);
            }
    
        private void scroll () {

    }
    
}
