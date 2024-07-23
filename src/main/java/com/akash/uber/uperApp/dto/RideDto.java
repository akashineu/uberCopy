package com.akash.uber.uperApp.dto;

import com.akash.uber.uperApp.entiies.enums.PaymentMethod;
import com.akash.uber.uperApp.entiies.enums.RideStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RideDto {
    private Point pickUpLocation;
    private Point dropOffLocation;
    private LocalDateTime requestedTime;
    private RiderDto rider;
    private DriverDto driver;
    private PaymentMethod paymentMethod;
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;
}
