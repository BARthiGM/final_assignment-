package com.bharathi.busticket.repository;

import com.bharathi.busticket.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {}