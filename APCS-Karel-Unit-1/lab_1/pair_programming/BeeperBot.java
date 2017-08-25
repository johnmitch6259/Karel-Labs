package lab_1.pair_programming;
import kareltherobot.*; 


/**
 * @author :  J. Mitchell
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void findAllBeepers() {
        turnLeft();
        move3();
        turnLeft();
        move2();
        pickBeeper();
        move3();
        pickBeeper();
        turnLeft();
        move3();
        pickBeeper();
        turnLeft();
        move3();
        pickBeeper();
        move2();
        putBeeper4();
    }
    
   public void move3() {
       move();
       move();
       move();
   }
    
   public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
   }
   public void move2() {
       move();
       move();
    }
   public void putBeeper4(){
    putBeeper();
    putBeeper();
    putBeeper();
    putBeeper();
   }
      
}

