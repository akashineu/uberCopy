package com.akash.uber.uperApp.services.impl;

import com.akash.uber.uperApp.configs.MapperConfig;
import com.akash.uber.uperApp.dto.DriverDto;
import com.akash.uber.uperApp.dto.RideDto;
import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.dto.RiderDto;
import com.akash.uber.uperApp.entiies.RideRequest;
import com.akash.uber.uperApp.entiies.enums.RideRequestStatus;
import com.akash.uber.uperApp.repositories.RideRequestRepository;
import com.akash.uber.uperApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RiderServiceImpl implements RiderService {

    private final ModelMapper modelMapper;
    private final RideRequestRepository rideRequestRepository;


    @Override
    public RideRequestDto requestRide(RideRequestDto rideRequestDto) {
        RideRequest rideRequest = modelMapper.map(rideRequestDto, RideRequest.class);
        return null;

    }

    @Override
    public RideDto cancelRide(Long rideId) {
        return null;
    }

    @Override
    public DriverDto rateDriver(Long rideId, Integer rating) {
        return null;
    }

    @Override
    public RiderDto getMyProfile() {
        return null;
    }

    @Override
    public List<RideDto> getAllMyRides() {
        return List.of();
    }
}
