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
    
    static ScoreCounter score = new ScoreCounter();
    static ScoreCounter sonicScore = new Player2Score();
    static Sonic s = new Sonic();
    public void act() {
        scroll();
        if(s.getBool() == false) {
            Greenfoot.setWorld(new Finish());
        } //if mario or sonic are ever both dead it will call an
        //instanciation of the finish screen class
    }
    public SonicLeel()
    {    // Scales the size of the screen
        super(width, height, 1, false);
        GreenfootImage backImage = new GreenfootImage("GameBackground.png");
        scroller = new Scroller(this, backImage, worldLength, height);
        scrollActor = s;
        addObject(scrollActor, 20, (height-120));
        for(int i = 0; i <= worldLength; i += 200)// This is for the basic floor 
                addObject(new Floor2(), i, height-50);
        for(int i = 0; i < worldLength; i += 1000)// This is for the secondary floor, change after += to change the distance. 
                addObject(new Floor(), i, height/2);  
        
        score.resetScore();
        sonicScore.resetScore();
        
       // GreenfootSound backgroundMusic = new GreenfootSound("BackgroundMusic.mp3");
       // backgroundMusic.setVolume(5);
       // backgroundMusic.playLoop();
       
               double[][] screenCoinGrid = new double[66][66];
        for(int i = 0; i < 66; i++) {
            for(int j = 0; j < 66; j++) {
            screenCoinGrid[i][i] = ((int)(Math.random() * (20 + 1)));
            if(screenCoinGrid[i][i] == 1) {
                addObject(new Coin(), 50+ i*75, 50 + j*75);
            }
        }
 
        }
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
        public static void addScore() {
        score.newScore();
    } //add score method
    public static void addScore2() {
        sonicScore.newScore();
    } //add sore method for sonic
}
