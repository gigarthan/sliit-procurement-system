package lk.sliit.csse.procurementsystem.models;

public class Accounting {
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
