

public class Main {

        public static void main(String[] args) {
            GumballMachine gumballMachine;
            
            gumballMachine = new GMAcceptsQuarter(5);

            System.out.println(gumballMachine);
            
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(10);
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();
    
            //System.out.println(gumballMachine);
    
            /*gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();*/
    
            gumballMachine = new GM50centsAccepts2Q(5);
    
            System.out.println(gumballMachine);
            gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();
    
            gumballMachine = new GMAcceptsAllCoinsTo50Cents(5);
    
            System.out.println(gumballMachine);
            gumballMachine.insertCoin(25);
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(10);
            gumballMachine.turnCrank();
            gumballMachine.insertCoin(5);
            gumballMachine.insertCoin(5);
            gumballMachine.insertCoin(1);
            gumballMachine.insertCoin(1);
            gumballMachine.insertCoin(1);
            gumballMachine.insertCoin(1);
            gumballMachine.insertCoin(1);
            gumballMachine.turnCrank();
	}
}
