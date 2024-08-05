
### Notification Microservice

API Documentation
Swagger documentation is available at http://localhost:8082/swagger-ui.html.

```markdown
# Notification Microservice

## Overview

The Notification Microservice is responsible for sending notifications to users regarding their ticket bookings and cancellations. It integrates with email services to deliver these notifications.

## Technologies

- **Java 17**
- **Spring Boot 3**
- **Spring Data JPA**
- **H2 Database (In-Memory)**
- **SpringDoc OpenAPI (Swagger)**
- **JUnit 5 (JUnit Jupiter)**
- **Mockito**

## Setup

### Prerequisites

- Java 17
- Maven (for building the project)

### Clone the Repository

```bash
git clone https://github.com/your-repo/notification-microservice.git
cd notification-microservice


Build the Project
bash
Copy code
mvn clean install
Run the Application
bash
Copy code
mvn spring-boot:run
The application will start on port 8083 by default.
Testing
To run unit tests, use:

bash
Copy code
mvn test
Exception Handling
The microservice uses Spring's @ControllerAdvice for centralized exception handling. Common exceptions are:

NotificationSendException: If the notification fails to send.
InvalidNotificationDataException: If the provided notification data is invalid.

Configuration
Application Properties: Configure application settings in src/main/resources/application.properties.
