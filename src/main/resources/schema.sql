CREATE TABLE notification (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    ticket_id BIGINT NOT NULL,
    event_name VARCHAR(255) NOT NULL,
    event_date DATE NOT NULL,
    event_location VARCHAR(255) NOT NULL,
    user_name VARCHAR(255) NOT NULL,
    ticket_type VARCHAR(255) NOT NULL,
    number_of_tickets INT NOT NULL,
    payment_amount DOUBLE NOT NULL,
    user_email VARCHAR(255) NOT NULL,
    sent_time TIMESTAMP,
    status VARCHAR(50), -- e.g., "SENT", "FAILED"
    error_message TEXT
);
