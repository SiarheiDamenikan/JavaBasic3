package by.damenikan.fashion.enums;

public enum Wear {
	DRESS(3),
	SHIRT(5),
	JEANS(2),
	SKILIRT(1),
	HAT(2),
	JACKET(2),
	COAT(3),
	LINEGRIE(5);
	
    private int qty;
    Wear(){}
    Wear(int qty) {
        this.qty = qty;
    }
    
    public int getWearQuantity() {
        return this.qty;
    }

}
