package pl.edu.agh.mwo;

import org.junit.Assert;
import org.junit.Test;

public class PhotoTest {

	@Test
	public void testGetComment() {
		Photo photo = new Photo();
		photo.setComment("Dobrze wykonane zdjecie");
		Assert.assertEquals("Dobrze wykonane zdjecie", photo.getComment());
	}
	
}
