package pojo;

public class LoginInfo {

	String username;
	String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginInfo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}
	public LoginInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "LoginInfo [username=" + username + ", password=" + password + "]";
	}
	
}
