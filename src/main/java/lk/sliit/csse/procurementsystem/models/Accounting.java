package lk.sliit.csse.procurementsystem.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Accounting {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String id;

	private String orderID;
	private String BankName;
	private String Branch;
	private String AccountNO;
	private String TotalPrice;

	public String getBankName() {
		return BankName;
	}

	public void setBankName(String bankName) {
		BankName = bankName;
	}

	public String getBranch() {
		return Branch;
	}

	public String getOrderID() {
		return orderID;
	}

	public void setOrderID(String orderID) {
		this.orderID = orderID;
	}

	public void setBranch(String branch) {
		Branch = branch;
	}

	public String getAccountNO() {
		return AccountNO;
	}

	public void setAccountNO(String accountNO) {
		AccountNO = accountNO;
	}

	public String getTotalPrice() {
		return TotalPrice;
	}

	public void setTotalPrice(String totalPrice) {
		TotalPrice = totalPrice;
	}

		
}
