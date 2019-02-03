

public class Main {

    public static void main(String[] args) {
        GumballMachine gumballMachine = new GumballMachine(5);

        System.out.println(gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        gumballMachine= new GM50centsAccepts2Q(5);
        System.out.println("\n"+gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();

        gumballMachine = new GMAcceptsAllCoinsTo50Cents(5);
        System.out.println("\n"+gumballMachine);
        gumballMachine.insertQuarter( 25 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 10 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 5 );
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter( 1 );
        gumballMachine.insertQuarter( 1 );
        gumballMachine.insertQuarter( 1 );
        gumballMachine.insertQuarter( 1 );
        gumballMachine.insertQuarter( 1 );
        gumballMachine.turnCrank();

    }
}
