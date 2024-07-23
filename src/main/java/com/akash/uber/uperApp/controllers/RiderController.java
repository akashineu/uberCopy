package com.akash.uber.uperApp.controllers;

import com.akash.uber.uperApp.dto.RideRequestDto;
import com.akash.uber.uperApp.dto.VehicleRequest;
import com.akash.uber.uperApp.services.RiderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/rider")
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
public class RiderController {

    private final RiderService riderService;

    @PostMapping(path = "/requestRide")
    public RideRequestDto requestRide(@RequestBody RideRequestDto rideRequestDto){
        log.info("Akash kumar" + rideRequestDto.toString());
        return riderService.requestRide(rideRequestDto);
    }

}
