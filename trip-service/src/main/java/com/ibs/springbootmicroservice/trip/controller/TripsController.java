package com.ibs.springbootmicroservice.trip.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibs.springbootmicroservice.trip.entity.Trips;
import com.ibs.springbootmicroservice.trip.general.ResponseTemplateVO;
import com.ibs.springbootmicroservice.trip.service.TripsService;

@RestController
@RequestMapping("/trips")
public class TripsController {
	
	@Autowired
	private TripsService tripsService;
	
	@PostMapping("/")
    public Trips saveDepartment(@RequestBody Trips trips) {
        return  tripsService.saveTrip(trips);
    }
	
	 @GetMapping("/{id}")
	    public ResponseTemplateVO getTripsWithUser(@PathVariable("id") Long id) {
	        return tripsService.getTripsWithUser(id);
	    }
	 
	 @GetMapping("/allTrips")
	 public List<Trips> getAllTripsDetails(){
		 return tripsService.getAllTrips(); 
	 }
	
	 @DeleteMapping("/{id}")
	 public void deleteTrip(@PathVariable long id) {
		 tripsService.deleteTrip(id);
	 }
	 
	@DeleteMapping("/deleteAll")
	public void deleteAllTrips() {
		tripsService.deleteAllTrips();
	}
	 
	


	

}
