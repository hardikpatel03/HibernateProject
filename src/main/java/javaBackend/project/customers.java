package javaBackend.project;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "customers")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class customers {

	@Id
	@Column(name = "customer_id")
	private int customerId;

	@Column(name = "customer_name")
	private String customername;

	@Column(name = "email")
	private String email;

	@Column(name = "mobile_number")
	private long mobilenumber;

	// setter and getter
//	public int getCustomerId() {
//		return customerId;
//	}
//
//	public void setCustomerId(int customerId) {
//		this.customerId = customerId;
//	}
//
//	public String getCustomername() {
//		return customername;
//	}
//
//	public void setCustomername(String customername) {
//		this.customername = customername;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public long getMobilenumber() {
//		return mobilenumber;
//	}
//
//	public void setMobilenumber(long mobilenumber) {
//		this.mobilenumber = mobilenumber;
//	}
//
//    //constructor
//	
//	public customers(){
//		
//	};
//
//	public customers(int customerId, String customername, String email, long mobilenumber) {
//		super();
//		this.customerId = customerId;
//		this.customername = customername;
//		this.email = email;
//		this.mobilenumber = mobilenumber;
//	}
//
//    //string
//	@Override
//	public String toString() {
//		return "customers [customerId=" + customerId + ", customername=" + customername + ", email=" + email
//				+ ", mobilenumber=" + mobilenumber + "]";
//	}

}
