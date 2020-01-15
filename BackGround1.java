import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{
    static ScoreCounter score = new Player2Score();
    static ScoreCounter sonicScore = new Player2Score();
    static Mario m = new Mario();
    static Sonic s = new Sonic();
    long frameCount = 0;
    public void act() {
        if (frameCount %100 == 0) {
            addObject(new PowerUp(), Greenfoot.getRandomNumber(800),Greenfoot.getRandomNumber(800));
        }
        frameCount++;
  
        if(m.getBool() == false && s.getBool() == false) {
            Greenfoot.setWorld(new Finish());
        } //if mario or sonic are ever both dead it will call an
        //instanciation of the finish screen class
    }
    public BackGround1()
    {    
        super(800, 800, 1);
        addObject(new DK(), 150, 150);
        addObject(new Floor(), 125, 219);
        addObject(new Floor(), 375, 219);
        addObject(new Floor2(), 625, 500);
        addObject(new Floor2(), 875, 500);
        addObject(new Floor(), 125, 781);
        addObject(new Floor(), 375, 781);
        addObject(new Floor(), 625, 781);
        addObject(new Floor(), 875, 781);
        addObject(m, 125, 700);
        addObject(s, 200,  700);
        addObject(sonicScore, 100, 450); //adding all objects to world
        addObject(sonicScore, 100, 450); //adding all objects to world
        sonicScore.resetScore(); //this will reset mario and sonics score(when reset)
        
       // GreenfootSound backgroundMusic = new GreenfootSound("BackgroundMusic.mp3");
       // backgroundMusic.setVolume(5);
       // backgroundMusic.playLoop();
       
       //background music that will keep looping
        
        double[][] screenCoinGrid = new double[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
            screenCoinGrid[i][i] = ((int)(Math.random() * (20 + 1)));
            if(screenCoinGrid[i][i] == 1) {
                addObject(new Coin(), 50+ i*75, 50 + j*75);
            }
        }
        }//this randomly generates the coins throughout the world
        //with an offset so it doesn't spawn on DK
    }
    public static void addScore() {
        score.newScore();
    } //add score method
    public static void addScore2() {
        sonicScore.newScore();
    } //add sore method for sonic
}
