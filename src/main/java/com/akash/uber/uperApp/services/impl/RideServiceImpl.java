package com.akash.uber.uperApp.services.impl;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.entiies.Driver;
import com.akash.uber.uperApp.entiies.Ride;
import com.akash.uber.uperApp.entiies.enums.RideStatus;
import com.akash.uber.uperApp.services.RideService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class RideServiceImpl implements RideService {
    @Override
    public Ride getRideById(Long rideId) {
        return null;
    }

    @Override
    public void matchWithDrivers(RideRequestDto rideRequestDto) {

    }

    @Override
    public Ride createNewRide(RideRequestDto rideRequestDto, Driver driver) {
        return null;
    }

    @Override
    public Ride updateRideStatus(Long rideId, RideStatus rideStatus) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfRider(Long riderId, PageRequest pageRequest) {
        return null;
    }

    @Override
    public Page<Ride> getAllRideOfDriver(Long driverId, PageRequest pageRequest) {
        return null;
    }
}
