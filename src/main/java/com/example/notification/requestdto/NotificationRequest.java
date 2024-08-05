package com.example.notification.requestdto;

import lombok.*;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class NotificationRequest {
    // Getters and setters
    private Integer ticketId;
    private String eventName;
    private LocalDate eventDate;
    private String eventLocation;
    private String userName;
    private String ticketType;
    private int numberOfTickets;
    private double paymentAmount;
    private String userEmail;

}

