package com.akash.uber.uperApp.repositories;

import com.akash.uber.uperApp.entiies.Rider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<Rider, Long> {
}
