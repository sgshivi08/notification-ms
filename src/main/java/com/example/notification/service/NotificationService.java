package com.example.notification.service;

import com.example.notification.entity.Notification;
import com.example.notification.repo.NotificationRepository;
import com.example.notification.requestdto.NotificationRequest;
import com.sendgrid.*;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.LocalDateTime;

@Service
public class NotificationService {

    @Value("${sendgrid.api.key}")
    private String sendGridApiKey;

    @Autowired
    private NotificationRepository notificationRepository;

    public void sendNotification(NotificationRequest request) {
        Notification notification = new Notification();
        notification.setTicketId(request.getTicketId());
        notification.setEventName(request.getEventName());
        notification.setEventDate(request.getEventDate());
        notification.setEventLocation(request.getEventLocation());
        notification.setUserName(request.getUserName());
        notification.setTicketType(request.getTicketType());
        notification.setNumberOfTickets(request.getNumberOfTickets());
        notification.setPaymentAmount(request.getPaymentAmount());
        notification.setUserEmail(request.getUserEmail());
        notification.setSentTime(LocalDateTime.now());

       /* try {
            Email from = new Email("no-reply@youreventapp.com");
            String subject = "Event Booking Confirmation";
            Email to = new Email(request.getUserEmail());
            Content content = new Content("text/plain", createEmailContent(request));
            Mail mail = new Mail(from, subject, to, content);

            SendGrid sg = new SendGrid(sendGridApiKey);
            Request sendGridRequest = new Request();
            sendGridRequest.setMethod(Method.POST);
            sendGridRequest.setEndpoint("mail/send");
            sendGridRequest.setBody(mail.build());
            Response response = sg.api(sendGridRequest);

            if (response.getStatusCode() == 202) {
                notification.setStatus("SENT");
            } else {
                notification.setStatus("FAILED");
                notification.setErrorMessage(response.getBody());
            }
        } catch (IOException e) {
            notification.setStatus("FAILED");
            notification.setErrorMessage(e.getMessage());
        }*/

        notificationRepository.save(notification);
    }

   /* private String createEmailContent(NotificationRequest request) {
        return "Dear " + request.getUserName() + ",\n\n" +
                "Thank you for booking tickets for the event '" + request.getEventName() + "'. Here are the details:\n" +
                "Event Date: " + request.getEventDate() + "\n" +
                "Event Location: " + request.getEventLocation() + "\n" +
                "Ticket Type: " + request.getTicketType() + "\n" +
                "Number of Tickets: " + request.getNumberOfTickets() + "\n" +
                "Payment Amount: $" + request.getPaymentAmount() + "\n\n" +
                "Looking forward to seeing you at the event!\n\n" +
                "Best regards,\nYour Event Team";
    }*/
}
