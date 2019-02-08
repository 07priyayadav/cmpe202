public class GMAcceptsAllCoinsTo50Cents extends GumballMachine{

    private int tot_cost;

    public GMAcceptsAllCoinsTo50Cents(int numberGumballs) {
        super(numberGumballs);
        this.tot_cost=0;
    }

    public void insertCoin(int coin) {

        if(coin > 0)
        {
            this.tot_cost += coin;
            if (this.tot_cost >=50) {
                
                
                state.insertCoin();
                
            }
            else {
                System.out.println("You paid: "+this.tot_cost+", Please pay total cost 50 cents");
            }
        }
    }
    
    public void turnCrank() {
        if (this.tot_cost >=50) {
             
            this.tot_cost=0;
            state.turnCrank();
            state.dispense();
        }
        else{
                System.out.println("You turned, but you need to pay cost 50 cents.");
            }
        }

    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThis is a 50 cents Gumball Machine, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2007");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
