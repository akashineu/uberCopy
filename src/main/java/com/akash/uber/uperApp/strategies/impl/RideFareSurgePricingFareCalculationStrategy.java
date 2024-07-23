package com.akash.uber.uperApp.strategies.impl;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.strategies.RideFareCalculationStrategy;
import org.springframework.stereotype.Service;

@Service
public class RideFareSurgePricingFareCalculationStrategy implements RideFareCalculationStrategy {
    @Override
    public Double calculateFare(RideRequestDto rideRequestDto) {
        return 0.0;
    }
}
