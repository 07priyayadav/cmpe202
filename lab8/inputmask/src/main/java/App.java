/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 *  Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private IDisplayComponent num;
    private IDisplayComponent exp;
    private IDisplayComponent cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new ConcreteDecoratorSpace(new CreditCardNum());
        exp = new ConcreteSlashDecorator(new CreditCardExp());
        cvc = new CreditCardCVC();

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        if(ch.matches("1|2|3|4|5|6|7|8|9|0")) {
            if(count < 23) {
                count++;
            }
            else{
                count +=0;
            }
            screen.key(ch, count);
        }
        else if(ch.matches("x|X")){
            screen.key(ch, count);
            count--;
        }
    }

}

