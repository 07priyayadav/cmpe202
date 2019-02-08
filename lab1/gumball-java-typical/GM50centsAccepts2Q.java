public class GM50centsAccepts2Q extends GumballMachine {

    private int numbOfQuarters;

    public GM50centsAccepts2Q(int size) {
        
        this.num_gumballs = size;
        this.numbOfQuarters=0;
        //System.out.println("Calling child constructor");
    }

    public void insertQuarter(int coin)
    {
        if (coin == 25){
            this.numbOfQuarters += 1;
        }
    }

    public void turnCrank()
    {
        if (this.numbOfQuarters == 2){
            //System.out.println("Calling child method with 2 quarters");
            if ( this.num_gumballs > 0 ){
                this.num_gumballs-- ;
                this.numbOfQuarters = 0 ;
                System.out.println( "Thanks for your 50 cents.  Gumball Ejected!" ) ;
            }
            else
            {
                System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
            }
        }
        else
        {
            System.out.println( "You turned, but you need to insert Quarter to pay cost 50 cents." ) ;
        }
    }


}
