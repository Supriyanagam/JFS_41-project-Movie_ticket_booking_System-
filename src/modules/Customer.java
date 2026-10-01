package modules;

public class Customer extends User{
	private long mobilenumber;

	public Customer(int userid, String username, String mailid, String password, long mobilenumber) {
		super(userid, username, mailid, password);
		this.mobilenumber = mobilenumber;
	}

	public long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	@Override
	public String toString() {
		return "Customer [mobilenumber=" + mobilenumber + "]";
	}

}
