package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class Trip {

	private String name;
	private String description;

	List<Photo> photos = new ArrayList<Photo>();

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Photo> getPhotos() {
		return photos;
	}

	public void addPhoto(Photo photo) {
		photos.add(photo);
	}

}
