package by.damenikan.fashion.enums;

public enum Doll {
	BARBIE(3),
	KEN(2);
	
	private int qty;
	
	Doll (int qty){
		this.qty = qty;
	}
	
	public int getDollQuantity(){
		return this.qty;
	}
}
