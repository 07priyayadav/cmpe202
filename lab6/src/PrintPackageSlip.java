public class PrintPackageSlip implements PrintReceiptStratergy {

	@Override
	public void printReceipt(Order o) {

		System.out.println("***** Printing Package Slip ******\n");
		System.out.println("**********************************\n\n");
		System.out.println( o.description);
		System.out.println("    12/1/2016  1:46:54 PM\n");
		System.out.println("\tFIVE GUYS\n");
		System.out.println("Sandwich# 1");
		
		for(Order item : o.getComponentList()) {
			if (item.place == "Burger" || item.place == "Fries" ) {
				System.out.println("1   " + item.description );
				for (Order topItem : item.getComponentList()) {
					if(topItem.place == "onTopBun") {
						System.out.println("        " + topItem.description);
					}
				}
				for (Order bottomItem : item.getComponentList()) {
					if(bottomItem.place == "onBeacon") {
						System.out.println("        " +"->|"+ bottomItem.description);
					}
				}
				for (Order baconItem : item.getComponentList()) {
					if(baconItem.place == "onBottomBun") {
						System.out.println("        {{{" + baconItem.description+"}}}");
					}
				}
			}
		}
		System.out.println(o.place);
		System.out.println("**********************************\n\n\n");
		
	};
	
}
