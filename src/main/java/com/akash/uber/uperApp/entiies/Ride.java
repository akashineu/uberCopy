package com.akash.uber.uperApp.entiies;

import com.akash.uber.uperApp.entiies.enums.PaymentMethod;
import com.akash.uber.uperApp.entiies.enums.RideRequestStatus;
import com.akash.uber.uperApp.entiies.enums.RideStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.locationtech.jts.geom.Point;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter

public class Ride {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point pickUpLocation;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point dropOffLocation;
    @CreationTimestamp
    private LocalDateTime requestedTime;
    @ManyToOne(fetch = FetchType.LAZY)
    private Rider rider;
    @ManyToOne(fetch = FetchType.LAZY)
    private Driver driver;
    @Enumerated(EnumType.STRING)
    private PaymentMethod paymentMethod;
    @Enumerated(EnumType.STRING)
    private RideStatus rideStatus;
    private Double fare;
    private LocalDateTime startedAt;
    private LocalDateTime endedAt;

}

