# 🐇 Spring Boot RabbitMQ Consumer  

This project is a **Spring Boot** application that acts as a **RabbitMQ consumer**. It listens to a RabbitMQ queue and processes incoming messages asynchronously.  

## 📌 Table of Contents  
- [Introduction to RabbitMQ](#introduction-to-rabbitmq)  
- [RabbitMQ Usage](#rabbitmq-usage)  
- [RabbitMQ Producer vs Consumer](#rabbitmq-producer-vs-consumer)  
- [Project Setup](#project-setup)  
- [How It Works](#how-it-works)  
- [Configuration](#configuration)  
- [Technologies Used](#technologies-used)  
  
---

## 🐇 Introduction to RabbitMQ  

**RabbitMQ** is a powerful message broker that enables applications to communicate asynchronously using a queue-based system. It supports multiple messaging patterns, including **point-to-point**, **publish/subscribe**, and **topic-based messaging**.  

---

## 📌 RabbitMQ Usage  

RabbitMQ is widely used for:  
- **Decoupling microservices**: Enables communication between services without direct dependencies.  
- **Event-driven architecture**: Supports event-based message passing.  
- **Load balancing**: Distributes tasks among multiple consumers.  
- **Asynchronous processing**: Handles background tasks efficiently, such as sending emails, processing orders, or handling logs.  

---

## 🔄 RabbitMQ Producer vs Consumer  

| Feature       | Producer | Consumer |
|--------------|----------|----------|
| **Role**     | Sends messages to RabbitMQ queue | Listens for messages from the queue |
| **Trigger**  | Event-driven or manually invoked | Runs continuously, waiting for messages |
| **Responsibility** | Generates and formats messages | Processes received messages asynchronously |
| **Example Use Case** | A payment service sending transaction data | A notification service sending an email confirmation |

---

```bash
   https://github.com/IT21826740/spring-boot-rabbitmq-producer.git
   ```

## 🚀 Project Setup  

### Prerequisites:  
- **Java 17+**  
- **Spring Boot**  
- **RabbitMQ installed** (or use [Docker](https://www.rabbitmq.com/download.html))  

### Steps to Run:  

1. Clone the repository:  
   ```bash
   git clone https://github.com/IT21826740/spring-boot-rabbitmq-consumer.git
   cd spring-boot-rabbitmq-consumer
   ```

2. Install dependencies and build the project:  
   ```bash
   mvn clean install
   ```

3. Start RabbitMQ (if using Docker):  
   ```bash
   docker run -d --name rabbitmq -p 5672:5672 -p 15672:15672 rabbitmq:management
   ```
   - **RabbitMQ Management UI**: `http://localhost:15672/`  
   - **Default login**: `guest / guest`  

4. Run the Spring Boot application:  
   ```bash
   mvn spring-boot:run
   ```

---

## ⚙️ How It Works  

1. The **Producer** sends a message to RabbitMQ.  
2. RabbitMQ queues the message until it is consumed.  
3. The **Consumer** listens for messages and processes them asynchronously.  

---

## 🛠 Configuration  

### `application.properties`  
```properties
spring.rabbitmq.host=localhost
spring.rabbitmq.port=5672
spring.rabbitmq.username=guest
spring.rabbitmq.password=guest
spring.rabbitmq.queue.name=my-queue
```

---

## 🛠 Technologies Used  

- **Spring Boot**  
- **Spring AMQP**  
- **RabbitMQ**  
- **Maven**  
- **Docker (Optional for running RabbitMQ)**  

---
 

