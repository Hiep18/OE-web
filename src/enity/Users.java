package enity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Users")
public class Users {
    @Id
	@Column(name="Id")
	String Id;
	@Column(name="Password")
	String Password;
	@Column(name="Fullname")
	String Fullname;
	@Column(name="Email")
	String Email;
	@Column(name="Admin")
	boolean Admin= false;
	
	
	
	
	public Users() {
		
	}
	
	
	
	public Users(String id, String password, String fullname, String email, boolean admin) {
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
