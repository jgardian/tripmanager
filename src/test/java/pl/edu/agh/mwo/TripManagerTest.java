package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	TripManager tripManager;

	@Before
	public void setupTest() {
		tripManager = new TripManager();
	}

	@Test
	public void addTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		assertEquals(0, tripmanager.getTrips().size());
		tripmanager.addTrip(trip);
		assertEquals(1, tripmanager.getTrips().size());
	}

	@Test
	public void removeTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		tripmanager.addTrip(trip);
		assertEquals(1, tripmanager.getTrips().size());
		tripmanager.removeTrip(trip);
		assertEquals(0, tripmanager.getTrips().size());

	}
	@Test
	public void GetTrips() {
		List<Trip> trips = new ArrayList<>();
		Trip trip = new Trip();
		tripManager.addTrip(trip);
		trips.add(trip);
		assertEquals(trips, tripManager.getTrips());
	}

	@Test
	public void findTrip(){
		TripManager tripmanager = new TripManager();
		Trip trip = new Trip();
		
		String name = "Mazury";
		tripmanager.addTrip(trip);
		trip.setName(name);
		assertEquals(trip, tripmanager.findTrip(name));
		
	}

	
}
