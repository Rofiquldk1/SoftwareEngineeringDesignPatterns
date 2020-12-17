
public class Item {
	private String itemName;
	private String itemCode;
	private double itemPrice;
	
	public Item(String itemName, String itemCode, double itemPrice) {
		super();
		this.itemName = itemName;
		this.itemCode = itemCode;
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	
	

}
