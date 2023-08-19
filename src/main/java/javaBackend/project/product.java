package javaBackend.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="product")
//@Getter
//@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class product {

	@Id
	@Column(name="id")
	private int id;
	
	@Column(name="product_name")
	private String productName;
	
	@Column(name="price")
	private int price;
	
	@Column(name="quantity")
	private int quantity;

//	public int getId() {
//		return id;
//	}
//
//	public void setId(int id) {
//		this.id = id;
//	}
//
//	public String getProductName() {
//		return productName;
//	}
//
//	public void setProductName(String productName) {
//		this.productName = productName;
//	}
//
//	public int getPrice() {
//		return price;
//	}
//
//	public void setPrice(int price) {
//		this.price = price;
//	}
//
//	public int getQuantity() {
//		return quantity;
//	}
//
//	public void setQuantity(int quantity) {
//		this.quantity = quantity;
//	}
//
//	@Override
//	public String toString() {
//		return "product [id=" + id + ", productName=" + productName + ", price=" + price + ", quantity=" + quantity
//				+ "]";
//	}
//
//	product(){
//		
//	};
//	
//	public product(int id, String productName, int price, int quantity) {
//		super();
//		this.id = id;
//		this.productName = productName;
//		this.price = price;
//		this.quantity = quantity;
//	}
//	
	
}
