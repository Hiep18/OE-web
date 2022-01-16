package enity;

import java.util.Date;

public class Share {
	int FavoriteID;
	String UserID;
	String VideoID;
	String Emails;
	Date ShareDate;
	public int getFavoriteID() {
		return FavoriteID;
	}
	public void setFavoriteID(int favoriteID) {
		FavoriteID = favoriteID;
	}
	public String getUserID() {
		return UserID;
	}
	public void setUserID(String userID) {
		UserID = userID;
	}
	public String getVideoID() {
		return VideoID;
	}
	public void setVideoID(String videoID) {
		VideoID = videoID;
	}
	public String getEmails() {
		return Emails;
	}
	public void setEmails(String emails) {
		Emails = emails;
	}
	public Date getShareDate() {
		return ShareDate;
	}
	public void setShareDate(Date shareDate) {
		ShareDate = shareDate;
	}
	
	
}
