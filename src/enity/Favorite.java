package enity;

import java.util.Date;

public class Favorite {
int FavoriteID;
String UserID;
String VideoID;
Date LikeDate;
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
public Date getLikeDate() {
	return LikeDate;
}
public void setLikeDate(Date likeDate) {
	LikeDate = likeDate;
}


}
