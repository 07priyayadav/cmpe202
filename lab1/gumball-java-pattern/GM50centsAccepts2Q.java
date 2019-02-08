public class GM50centsAccepts2Q extends GumballMachine {

    private int numbOfQuarters;

    public GM50centsAccepts2Q(int numberGumballs) {
        super(numberGumballs);
        this.numbOfQuarters=0;
        //System.out.println("Called the child constructor");
    }

    public void insertCoin(int coin) {
        
        if (coin ==25){
            this.numbOfQuarters ++;
            //System.out.println("numbOfCoins"+numbOfCoins);

            if(this.numbOfQuarters==2)
            {
                //System.out.println("Called the child insert method");
                state.insertCoin();
                
            }
            else{
                System.out.println("Please insert another Quarter.");
            }

        }

    }
    
    public void turnCrank() {
        
        if(this.numbOfQuarters==2){
            
            this.numbOfQuarters=0;
            state.turnCrank();
            state.dispense();
        }
        else{
            System.out.println("You turned, but there are no suffient Quarters.");
        }

    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nThis is a two Quarter Gumball Machine, Inc.");
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
