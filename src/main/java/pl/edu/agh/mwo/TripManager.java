package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.List;

public class TripManager {

	List<Trip> trips = new ArrayList<>();

	public boolean addTrip(Trip trip) {
		return trips.add(trip);
	}

	public boolean removeTrip(Trip trip) {
		return trips.remove(trip);
	}

	public List<Trip> getTrips() {
		return trips;
	}
	
	public Trip findTrip(String keyword) {
		for (Trip trip : trips) {
			if (trip.getName().contains(keyword)) {
				return trip;
			}
		}
		return null;
	}

	
}
