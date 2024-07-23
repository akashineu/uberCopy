package com.akash.uber.uperApp.entiies;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.locationtech.jts.geom.Point;

@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double ratting;
    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;
    private Boolean available;
    @Column(columnDefinition = "Geometry(Point, 4326)")
    private Point currentLocation;
}
