package exercise5;

public class Item {

	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getTax() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean isOnSale() {
		// TODO Auto-generated method stub
		return false;
	}

	public float getSaleDiscount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public float getTotalPrice()) {
		float price = this.getPrice() + this.getTax();
		if (this.isOnSale())
			price = price - this.getSaleDiscount() * price;
		return price;	
	}
}
