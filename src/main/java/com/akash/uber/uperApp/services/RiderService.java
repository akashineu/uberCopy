package com.akash.uber.uperApp.services;

import com.akash.uber.uperApp.dto.DriverDto;
import com.akash.uber.uperApp.dto.RideDto;
import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.dto.RiderDto;

import java.util.List;

public interface RiderService {
    RideRequestDto requestRide(RideRequestDto rideRequestDto);
    RideDto cancelRide(Long rideId);
    DriverDto rateDriver(Long rideId, Integer rating);
    RiderDto getMyProfile();
    List<RideDto> getAllMyRides();
}
