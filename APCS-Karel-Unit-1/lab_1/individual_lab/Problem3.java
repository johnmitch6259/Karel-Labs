package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Robot
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void giveCarlBeeper() {
        //is method should allow karel, who is at (1, 1) to give a beeper to carl (at 1, 4)
    turnLeft();
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    putBeeper();
    turnLeft();
    turnLeft();
    move();
    move();
    move();
    turnLeft();
    turnLeft();
    turnLeft();
    
    }
    
    public void pickAndMoveBeeper() {
        //This method is for carl to pick up the beeper from karel and move ittwo blocks north
        h
    }
   
}