public class ConcreteDecoratorSpace extends Decorator {

    private String number;

    public ConcreteDecoratorSpace(IDisplayComponent c) {
        super(c);
    }

    public String addedDecorator(String CardNum){

        CardNum =CardNum.substring(1, CardNum.length()-3);
        String out="";

        for(int i = 0; i< CardNum.length();i++){
            if(i ==3 || i==7 || i==11){
                    out += CardNum.charAt(i);
                    out += " ";
            }
            else
                out += CardNum.charAt(i);
        }
        return "["+ out + "]" + "  ";
    }

    @Override
    public String display() {
       number=super.display();
       return addedDecorator(number);
    }

    @Override
    public void setNext(IKeyEventHandler next) {

        super.setNext((IKeyEventHandler )super.component);
        ((IKeyEventHandler) super.component).setNext(next);

    }

}
