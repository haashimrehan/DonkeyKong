import greenfoot.*;

/**
 * Write a description of class BackGround1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackGround1 extends World
{

    /**
     * Constructor for objects of class BackGround1.
     * 
     */
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
    }
}
