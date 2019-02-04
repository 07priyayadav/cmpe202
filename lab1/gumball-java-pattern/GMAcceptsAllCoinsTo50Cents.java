public class GMAcceptsAllCoinsTo50Cents extends GumballMachine{

    private int tot_cost;

    public GMAcceptsAllCoinsTo50Cents(int numberGumballs) {
        super(numberGumballs);
        this.tot_cost=0;
    }

    public void insertQuarter(int coin) {

        if(coin > 0)
        {
            this.tot_cost += coin;
            if (this.tot_cost >=50) {
                
                this.tot_cost=0;
                state.insertQuarter();
                
            }
            else {
                System.out.println("Please pay cost of 50 cents");
            }
        }
    }

    
    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
        result.append("\nJava-enabled Standing Gumball Model #2006");
        result.append("\nInventory: " + count + " gumball");
        if (count != 1) {
            result.append("s");
        }
        result.append("\n");
        result.append("Machine is " + state + "\n");
        return result.toString();
    }
}
