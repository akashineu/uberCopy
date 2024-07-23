package com.akash.uber.uperApp.services;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.entiies.Driver;
import com.akash.uber.uperApp.entiies.Ride;
import com.akash.uber.uperApp.entiies.RideRequest;
import com.akash.uber.uperApp.entiies.enums.RideStatus;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface RideService {
    Ride getRideById(Long rideId);
    void matchWithDrivers(RideRequestDto rideRequestDto);
    Ride createNewRide(RideRequestDto rideRequestDto, Driver driver);
    Ride updateRideStatus(Long rideId, RideStatus rideStatus);
    Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest);
    Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest);

}