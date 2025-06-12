/**
 * 
 */
package com.github.leeyazhou.trip.mcp.server.app.facade;

import org.springframework.ai.tool.annotation.Tool;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.leeyazhou.trip.mcp.server.app.service.TripService;

/**
 * @author leeyazhou
 */
@Component
public class TripFacadeService extends BaseFacadeService {

	@Autowired
	private TripService tripService;

	// Add methods to interact with the trip service layer
	// For example, methods to create, update, delete, or retrieve trips
	@Tool(name = "createTrip", description = "Create a new trip")
	public void createTrip(String tripDetails) {
		tripService.createTrip(tripDetails);
	}

	public void updateTrip(String tripId, String updatedDetails) {
		// Implementation for updating a trip
	}

	public void deleteTrip(String tripId) {
		// Implementation for deleting a trip
	}

	public String getTrip(String tripId) {
		// Implementation for retrieving a trip
		return "Trip details for " + tripId;
	}

}
