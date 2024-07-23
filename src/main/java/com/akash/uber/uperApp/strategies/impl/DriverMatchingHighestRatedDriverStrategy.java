package com.akash.uber.uperApp.strategies.impl;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.entiies.Driver;
import com.akash.uber.uperApp.strategies.DriverMatchingStrategy;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DriverMatchingHighestRatedDriverStrategy implements DriverMatchingStrategy {
    @Override
    public List<Driver> findMatchingDriver(RideRequestDto rideRequestDto) {
        return List.of();
    }
}
