package com.bharathi.busticket.model;

import jakarta.persistence.*;

@Entity
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int seatsBooked;

    @ManyToOne
    private Bus bus;

    @ManyToOne
    private Passenger passenger;

    // Getters and Setters
}