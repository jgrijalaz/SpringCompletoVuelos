package com.example.entities;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Builder

@Entity
@Table(name = "Flights")
public class Flight
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "flight")
    @ToString.Exclude
    private List<Ticket> ticketList;

    private String plane;
    private String airportFrom;
    private String airportTo;
    private LocalDateTime dateTimeFrom;
    private LocalDateTime dateTimeTo;
    private Integer seats;
}