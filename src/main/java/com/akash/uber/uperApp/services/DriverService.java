package com.akash.uber.uperApp.services;

import com.akash.uber.uperApp.dto.DriverDto;
import com.akash.uber.uperApp.dto.RideDto;

import java.util.List;

public interface DriverService {
    RideDto acceptRide(Long rideId);
    RideDto startRide(Long rideId);
    RideDto cancelRide(Long rideId);
    RideDto endRide(Long rideId);
    RideDto rateRider(Long rideId, Integer rating);
    DriverDto getMyProfile();
    List<RideDto> getAllMyRides();
}
