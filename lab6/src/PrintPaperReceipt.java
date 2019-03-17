import java.text.DecimalFormat;

public class PrintPaperReceipt implements PrintReceiptStratergy {


	@Override
	public void printReceipt(Order o) {
		
		DecimalFormat df = new DecimalFormat("$0.00");
		double subTotal = 0;
		double Total = 0;
		System.out.println("\n***** Printing Paper Receipt *****\n");
		System.out.println("**********************************\n\n");
		
		System.out.println("       FIVE GUYS");
		System.out.println("    BURGERS AND FRIES");
		System.out.println("     STORE # CA-1294");
		System.out.println("   5353 ALMADEN EXPY N60");
		System.out.println("    SAN JOSE, CA 95118");
		System.out.println("    (P) 408-264-9300\n\n");
		System.out.println("    12/1/2016 1:46:54 PM");
		System.out.println("       FIVE GUYS\n\n");
		
		for(Order item : o.getComponentList()) {
			if (item.place == "Burger") {
				System.out.println(item.quantity + "   "+ item.description+"                  "+df.format(item.price));
				subTotal += item.price;
			} else if(item.place == "Fries") {
				System.out.println(item.quantity + "   "+ item.description+"              "+df.format(item.price));
				subTotal += item.price;
			} else if (item.place == "onTopBun") {
					System.out.println("      "+item.description);
			} else if(item.place == "onBeacon") {
				System.out.println("      " +"->|"+ item.description);
			} else if(item.place == "onBottomBun") {
				System.out.println("      {{{"+item.description+"}}}");
			} else {
				System.out.println("      "+item.description);
			}
		}
		
		double tax = subTotal*0.09;
		Total = subTotal + tax;
		System.out.println("\nSub. Total:\t\t "+df.format(subTotal));
		System.out.println("Tax:\t\t\t "+df.format(tax));
		System.out.println("Total:\t\t\t "+df.format(Total));
		System.out.println(o.place);
		System.out.println("**********************************\n\n");
		

	};
}
