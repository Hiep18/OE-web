package enity;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="Video")
@NamedQuery(name="Video.findAll", query="SELECT v FROM Video v")
public class Video implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="Id")
	private String id;

	@Column(name="Active")
	private boolean active;

	@Column(name="Description")
	private String description;

	private String img;

	@Column(name="Poster")
	private String poster;

	@Column(name="Title")
	private String title;

	@Column(name="Views")
	private int views;

	public Video() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean getActive() {
		return this.active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImg() {
		return this.img;
	}

	public void setImg(String img) {
		this.img = img;
	} 

	public String getPoster() {
		return this.poster;
	}

	public void setPoster(String poster) {
		this.poster = poster;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getViews() {
		return this.views;
	}

	public void setViews(int views) {
		this.views = views;
	}

	public Video(String id, boolean active, String descriptionn, String img, String poster, String titile, int views) {
		super();
		this.id = id;
		this.active = active;
		this.description = description;
		this.img = img;
		this.poster = poster;
		this.title = title;
		this.views = views;
	}
}
