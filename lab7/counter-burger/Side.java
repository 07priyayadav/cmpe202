public class Side extends LeafDecorator {

    private String[] options ;


    public Side( String d )
    {
        super(d) ;
    }

    // 1 cheese free, extra cheese +1.00
    public void setOptions( String[] options )
    {
        this.options = options ;
        for ( int i = 0; i<options.length; i++ )
        {

            this.price += 3.00  ;
            //System.out.println(this.price);
        }
    }

    public String getDescription()
    {
        String desc = "   " ;
        for ( int i = 0; i<options.length; i++ )
        {
            if (i>0) desc += " + " + options[i] ;
            else desc = options[i] ;
        }
        return desc ;
    }

}
