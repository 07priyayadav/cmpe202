public class Client {

    public static void main(String []args){

        Order burger = new Order("LLB", 1 ,5.59,"Burger");
        burger.addComponents(new Order("BACON", 0 ,0,"onBottomBun"));
        burger.addComponents(new Order("LETTUCE",0, 0,"onTopBun"));
        burger.addComponents(new Order("TOMATO",0, 0,"onTopBun"));
        burger.addComponents(new Order("G ONION",0, 0,"onBeacon"));
        burger.addComponents(new Order("JALA GRILLED",0, 0,"onBeacon"));


        Order fries  = new Order("LLT CAG",1, 2.79,"Fries");

        Order order = new Order("Order Number: 45",0, 0,"Register 1:  Tran Seq No:57845 \nCashier: Sakda* S.");
        order.addComponents(burger);
        order.addComponents(fries);
        
        PrintPaperReceipt paperReceipt = new PrintPaperReceipt();
        paperReceipt.printReceipt(order);

        PrintPackageSlip packageSlip = new PrintPackageSlip();
        packageSlip.printReceipt(order);
        

    }
}
