package com.akash.uber.uperApp.strategies;

import com.akash.uber.uperApp.dto.RideRequestDto;

public interface RideFareCalculationStrategy {

    Double calculateFare(RideRequestDto rideRequestDto);

}
