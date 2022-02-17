package enity;

import javax.persistence.*;


/**
 * The persistent class for the Users database table.
 * 
 */
@Entity
@Table(name="Users")
public class User {
    @Id
	@Column(name="UserId")
	String Id;
	@Column(name="Password")
	String Password;
	@Column(name="Fullname")
	String Fullname;
	@Column(name="Email")
	String Email;
	@Column(name="Admin")
	boolean Admin= false;
	
	
	
	
	public User() {
		
	}
	
	
	
	public User(String id, String password, String fullname, String email, boolean admin) {
		Id = id;
		Password = password;
		Fullname = fullname;
		Email = email;
		Admin = admin;
	}



	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public String getFullname() {
		return Fullname;
	}
	public void setFullname(String fullname) {
		Fullname = fullname;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public boolean getAdmin() {
		return Admin;
	}
	public void setAdmin(boolean admin) {
		Admin = admin;
	}
}