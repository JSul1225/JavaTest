package product.model.DTO;

public class ProductDTO {

	private String name; // 상품이름
	private String price; // 상품가격
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String display() {
		return "상품명 : " + name + "\t" +  "상품가격 : " + price;
	}
	
}
