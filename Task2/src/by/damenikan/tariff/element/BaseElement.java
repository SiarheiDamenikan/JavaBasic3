package by.damenikan.tariff.element;

public class BaseElement {
	private int price;
	
	public BaseElement() {}
	
	public BaseElement(int price) {
		this.price  = price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}

	@Override
	public int hashCode() {
		int prime = 31;
		int hash = 1;
		
		hash = prime * hash + price; 
		
		return hash;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (obj == null) {
			return false; 
		}
		
	    if (obj == this) {
	    	return true;
	    }
	    
	    if (!(obj instanceof BaseElement)) {
	    	return false;
	    }
	    
	    BaseElement element = (BaseElement) obj;
	    
	    if  (price != element.getPrice()) {
	    	return false;
	    }
	    
	    return true;
	}
	
}
