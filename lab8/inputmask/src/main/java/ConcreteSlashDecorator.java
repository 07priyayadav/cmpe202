public class ConcreteSlashDecorator extends Decorator {

    private String expiry;

    public ConcreteSlashDecorator(IDisplayComponent c) {
        super(c);

    }

    public String addedDecorator(String CardNum){
        String out ="";
        CardNum =CardNum.substring(1, CardNum.length()-3);
        for(int i = 0; i< CardNum.length();i++){
            if(i ==1){
                out += CardNum.charAt(i);
                out += "/";
            }
            else
                out += CardNum.charAt(i);
        }
        return "["+ out + "]"+ "  ";
    }

    @Override
    public String display() {
        expiry=super.display();
        return addedDecorator(expiry);
    }

    @Override
    public void setNext(IKeyEventHandler next) {

        super.setNext((IKeyEventHandler )super.component);
        ((IKeyEventHandler) super.component).setNext(next);

    }
}