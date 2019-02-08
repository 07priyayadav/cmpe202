
/**
 * Write a description of class GMAcceptsQuarter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GMAcceptsQuarter extends GumballMachine
{
    private boolean has_quarter;
    
    public GMAcceptsQuarter(int numberGumballs) {
        super(numberGumballs);
        this.has_quarter = false;
        //System.out.println("Called the child constructor");
    }

    public void insertCoin(int coin) {
        
        if(coin == 25){
            
            this.has_quarter = true;
            state.insertCoin();
        
        }
        else{
            
            System.out.println("Please insert a Quarter.");
        }

    }
    
    public void turnCrank() {
        
        if(this.has_quarter){
            state.turnCrank();
            state.dispense();
        }
        else{
            
            System.out.println("You turned, but you need to insert a Quarter.");
        }
        
    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThis is a Quarter Gumball Machine, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2005");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }

}
