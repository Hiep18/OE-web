package enity;

public class User {
String UserID;
String PassWord;
String Email;
String FullName;
boolean Admin;
public String getUserID() {
	return UserID;
}
public void setUserID(String userID) {
	UserID = userID;
}
public String getPassWord() {
	return PassWord;
}
public void setPassWord(String passWord) {
	PassWord = passWord;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public String getFullName() {
	return FullName;
}
public void setFullName(String fullName) {
	FullName = fullName;
}
public boolean isAdmin() {
	return Admin;
}
public void setAdmin(boolean admin) {
	Admin = admin;
}


}
