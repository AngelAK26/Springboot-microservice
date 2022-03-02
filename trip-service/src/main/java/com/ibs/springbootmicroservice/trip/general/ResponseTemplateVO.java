package com.ibs.springbootmicroservice.trip.general;

import com.ibs.springbootmicroservice.trip.entity.Trips;

public class ResponseTemplateVO {

	private User user;
	private Trips trips;

	public ResponseTemplateVO(User user, Trips trips) {
		super();
		this.user = user;
		this.trips = trips;
	}

	public ResponseTemplateVO() {
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Trips getTrips() {
		return trips;
	}

	public void setTrips(Trips trips) {
		this.trips = trips;
	}

}
