public abstract class Decorator implements IDisplayComponent , IKeyEventHandler{

    protected IDisplayComponent component;
    protected IKeyEventHandler nextHandler ;

    public Decorator(IDisplayComponent c) {

        component = c;

    }

    public String display(){

        return component.display();
    }

    @Override
    public void addSubComponent(IDisplayComponent c) {

    }

    abstract String addedDecorator(String s);

    public void setNext(IKeyEventHandler next) {
        this.nextHandler = next ;
    }

    public void key(String ch, int cnt) {
        if ( nextHandler != null )
            nextHandler.key(ch, cnt) ;
    }
}
