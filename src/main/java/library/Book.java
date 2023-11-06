package library;

public class Book {
	protected String title;
	protected Double price;
	protected Integer quantity;

	public Book(String title, Double price, Integer quantity) {
		this.title = title;
		this.price = price;
		this.quantity = quantity;
	}

	public Double getFullPrice() {
		return price * quantity;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

}
