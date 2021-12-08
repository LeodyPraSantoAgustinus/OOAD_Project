package model;

public class TransactionItem {
	private String productId;
	private int qty;

	public TransactionItem(String productId, int qty) {
		super();
		this.productId = productId;
		this.qty = qty;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

}
