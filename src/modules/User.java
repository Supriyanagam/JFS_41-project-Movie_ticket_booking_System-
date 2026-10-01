package modules;

public class User {
	private int userid;
	private String username;
	private String mailid;
	private String password;
	
	public  User() {
		super();
	}
	
	
	public User(int userid, String username, String mailid, String password) {
		super();
		this.userid = userid;
		this.username = username;
		this.mailid = mailid;
		this.password = password;
	}
	
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	@Override
	public String toString() {
		return "User [userid=" + userid + ", username=" + username + ", mailid=" + mailid + ", password=" + password
				+ "]";
	}
	
	
	

}
