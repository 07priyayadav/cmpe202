import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class Order {

    String          description;
    double          price;
    String          place;
    int             quantity;
    List<Order>     components;

    public Order(String description, int quantity, double price, String place) {
        this.description = description;
        this.quantity    = quantity;
        this.price       = price;
        this.place       = place;
        components       = new ArrayList<>();

    }

    public void addComponents(Order o) {
        this.components.add(o);
        //System.out.println(o.description);
    }
    
    public List<Order> getComponentList() {
    	List<Order> burgerList = new ArrayList<Order>();
    	Iterator<Order> it = this.components.iterator();
    	burgerList.add(this);
    	while(it.hasNext()) {
    		Order next = it.next();
    		List<Order> itemList = next.getComponentList();
    		if(itemList.size() > 0) {
    			for(Order i : itemList) {
    				burgerList.add(i);
    			}
    		}
    		    
    	}
    	
    	return burgerList;
    }



}
