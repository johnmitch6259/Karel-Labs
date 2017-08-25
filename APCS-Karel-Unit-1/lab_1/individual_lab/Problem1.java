package lab_1.individual_lab;
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    
    public void rearrangeBeepers() {
       turnLeft();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       move();
       pickBeeper();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       move();
       putBeeper();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       move();
       turnLeft();
       turnLeft();
       turnLeft();
       move();
       move();
       
       
    }
   
}