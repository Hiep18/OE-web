package enity;

public class Video {
String VideoID;
String Title;
String Poster;
int Views;
String Description;
boolean active;
public String getVideoID() {
	return VideoID;
}
public void setVideoID(String videoID) {
	VideoID = videoID;
}
public String getTitle() {
	return Title;
}
public void setTitle(String title) {
	Title = title;
}
public String getPoster() {
	return Poster;
}
public void setPoster(String poster) {
	Poster = poster;
}
public int getViews() {
	return Views;
}
public void setViews(int views) {
	Views = views;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}


}
