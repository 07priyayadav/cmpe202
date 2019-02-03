public class GMAcceptsAllCoinsTo50Cents extends GumballMachine{

    private int tot_cost;

    public GMAcceptsAllCoinsTo50Cents(int size) {
        super(size);
        this.tot_cost=0;
        //System.out.println("Calling child constructor");
    }

    public void insertQuarter(int coin)
    {
        
        this.tot_cost += coin;
           
    }

    public void turnCrank()
    {
        //System.out.println(this.tot_cost);

        if ( this.tot_cost >= 50 )
        {
            //System.out.println("Calling child method with money of 50 cents");
            if ( this.num_gumballs > 0 )
            {
                this.num_gumballs-- ;
                this.tot_cost = 0 ;
                System.out.println( "Thanks for your 50 cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
            }
        }
        else
        {
            System.out.println( "Please insert a coin to pay the cost of 50 cents" ) ;
        }
    }
}
