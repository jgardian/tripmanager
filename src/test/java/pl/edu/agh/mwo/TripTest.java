package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class TripTest {

	@Test
	public void testGetName() {
		Trip trip = new Trip();
		trip.setName("Polska");
		Assert.assertEquals("Polska", trip.getName());
	}

	@Test
	public void testGetDescription() {
		Trip trip = new Trip();
		trip.setDescription("Wakacje");
		Assert.assertEquals("Wakacje", trip.getDescription());
	}

	@Test
	public void testAddPhoto() {
		Trip trip = new Trip();
		Photo photo = new Photo();
		assertEquals(0, trip.getPhotos().size());
		trip.addPhoto(photo);
		assertEquals(1, trip.getPhotos().size());
	}

	@Test
	public void testGetPhotos() {
		List<Photo> photos = new ArrayList<>();
		Trip trip = new Trip();
		Photo photo = new Photo();
		trip.addPhoto(photo);
		photos.add(photo);
		Assert.assertEquals(photos, trip.getPhotos());
	}
}
