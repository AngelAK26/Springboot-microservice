package com.ibs.springbootmicroservice.trip.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ibs.springbootmicroservice.trip.entity.Trips;

public interface TripsRepository extends JpaRepository<Trips, Long>  {

	Trips findTripsById(Long id);



}
