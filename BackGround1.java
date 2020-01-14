import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{
    static ScoreCounter score = new ScoreCounter();
    static ScoreCounter sonicScore = new Player2Score();
    PowerUps p = new PowerUps();
    
    public void act() {
        
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
        addObject(new Mario(), 125, 700);
        addObject(new Sonic(), 200,  700);
        addObject(score, 100, 500);
        addObject(sonicScore, 100, 450);
        score.resetScore();
        sonicScore.resetScore();
        
       // GreenfootSound backgroundMusic = new GreenfootSound("BackgroundMusic.mp3");
       // backgroundMusic.setVolume(5);
       // backgroundMusic.playLoop();
        
        double[][] screenCoinGrid = new double[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
            screenCoinGrid[i][i] = ((int)(Math.random() * (20 + 1)));
            if(screenCoinGrid[i][i] == 1) {
                addObject(new Coin(), 50+ i*75, 50 + j*75);
            }
        }
        }

        p.update();
        
       //  addObject(new PowerUp(),5,5); 
    }
    public static void addScore() {
        score.newScore();
    }
    public static void addScore2() {
        sonicScore.newScore();
    }
}
