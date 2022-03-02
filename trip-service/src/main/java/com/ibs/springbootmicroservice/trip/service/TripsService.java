package com.ibs.springbootmicroservice.trip.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ibs.springbootmicroservice.trip.entity.Trips;
import com.ibs.springbootmicroservice.trip.exception.ResourceNotFoundException;
import com.ibs.springbootmicroservice.trip.general.ResponseTemplateVO;
import com.ibs.springbootmicroservice.trip.general.User;
import com.ibs.springbootmicroservice.trip.repo.TripsRepository;

@Service
public class TripsService {

	@Autowired
	private TripsRepository tripsRepository;

	@Autowired
	private RestTemplate restTemplate;

	
	// For Saving trip details 
	public Trips saveTrip(Trips trips) {
		return tripsRepository.save(trips);
	}
	
	//For getting/fetching trip details with user details
	public ResponseTemplateVO getTripsWithUser(Long id) {

		ResponseTemplateVO vo = new ResponseTemplateVO();
		Trips trips = tripsRepository.findTripsById(id);

		User user = restTemplate.getForObject("http://USER-SERVICE/users/" + trips.getUserId(), User.class);

		vo.setUser(user);
		vo.setTrips(trips);

		return vo;
	}
	
	//For fetching all trips from database
	public List<Trips> getAllTrips() {
		List<Trips> trips = new ArrayList<>();
		tripsRepository.findAll().forEach(trips::add);
		return trips;
	}

	//for deleting specific trip by id
	public void deleteTrip(long id) {

		Trips existingTrip = tripsRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Trip not found with id :" + id));
		tripsRepository.delete(existingTrip);

	}
	
	//for deleting all trips
	 public void deleteAllTrips() {
		 tripsRepository.deleteAll();
	 }

}
