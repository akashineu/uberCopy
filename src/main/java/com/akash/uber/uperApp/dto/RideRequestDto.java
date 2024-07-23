package com.akash.uber.uperApp.dto;

import com.akash.uber.uperApp.entiies.enums.PaymentMethod;
import com.akash.uber.uperApp.entiies.enums.RideRequestStatus;
import lombok.Data;

import java.time.LocalDateTime;
@Data
public class RideRequestDto {
    private Double id;
    private PointDto pickUpLocation;
    private PointDto dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private PaymentMethod paymentMethod;
    private RideRequestStatus rideRequestStatus;

}
