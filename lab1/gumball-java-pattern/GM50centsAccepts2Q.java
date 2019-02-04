public class GM50centsAccepts2Q extends GumballMachine {

    private int numbOfQuarters;

    public GM50centsAccepts2Q(int numberGumballs) {
        super(numberGumballs);
        this.numbOfQuarters=0;
        //System.out.println("Called the child constructor");
    }

    public void insertQuarter(int coin) {
        if (coin ==25){
            this.numbOfQuarters ++;
            //System.out.println("numbOfQuarters"+numbOfQuarters);

            if(this.numbOfQuarters==2)
            {
                //System.out.println("Called the child insert method");
                this.numbOfQuarters=0;
                state.insertQuarter();
                
            }
            else{
                System.out.println("Please insert another Quarter");
            }

        }

    }

    public String toString() {
        StringBuffer result = new StringBuffer();
        result.append("\nMighty Gumball, Inc.");
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
