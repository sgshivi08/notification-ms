package com.example.notification.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Notification {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ticketId;
    private String eventName;
    private LocalDate eventDate;
    private String eventLocation;
    private String userName;
    private String ticketType;
    private int numberOfTickets;
    private double paymentAmount;
    private String userEmail;
    private LocalDateTime sentTime;
    private String status; // e.g., "SENT", "FAILED"
    private String errorMessage;

    // Getters and setters
}
