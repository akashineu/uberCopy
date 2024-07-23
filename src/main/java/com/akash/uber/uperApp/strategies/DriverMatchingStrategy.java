package com.akash.uber.uperApp.strategies;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.entiies.Driver;

import java.util.List;

public interface DriverMatchingStrategy {

    List<Driver> findMatchingDriver(RideRequestDto rideRequestDto);

}
