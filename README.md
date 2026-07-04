<div align="center">

# ⚡ ChargeHub
### Enterprise EV Charging Aggregator Platform

### 🚗 BookMyShow for EV Charging Stations

Find • Book • Charge • Pay

---

![Java](https://img.shields.io/badge/Java-21-orange)
![JDBC](https://img.shields.io/badge/JDBC-MySQL-blue)
![MySQL](https://img.shields.io/badge/Database-MySQL-green)
![Maven](https://img.shields.io/badge/Build-Maven-red)
![License](https://img.shields.io/badge/License-MIT-success)
![Status](https://img.shields.io/badge/Status-Under%20Development-yellow)

</div>

---

# 📖 About

ChargeHub is an **Enterprise EV Charging Aggregator Platform** designed to connect EV users with charging stations operated by independent shop owners, businesses, apartments, and commercial partners.

The platform works similarly to **BookMyShow**, but instead of booking movie tickets, users discover nearby charging stations, reserve charging slots, complete charging sessions, and make secure digital payments.

This project is being developed as a **production-style enterprise Java application**, beginning as an Advanced Java Console Application using **JDBC + MySQL**, and later evolving into a complete Spring Boot + React ecosystem.

---

# 🎯 Vision

To build India's largest decentralized EV charging ecosystem by empowering local businesses to become charging partners while providing EV users with a seamless charging experience.

---

# 🚀 Project Objectives

- Build a scalable EV Charging Aggregator
- Demonstrate Enterprise Java Development
- Implement Industry Standard Architecture
- Practice Advanced Java Concepts
- Prepare for Spring Boot Migration
- Showcase Production-Level Software Engineering

---

# 🏗 Project Architecture

```
                 ChargeHub

                   Console
                      │
                      ▼
              Menu Controller Layer
                      │
                      ▼
               Business Service Layer
                      │
                      ▼
                   DAO Layer
                      │
                      ▼
                  JDBC Layer
                      │
                      ▼
                    MySQL
```

---

# 🛠 Technology Stack

## Programming Language

- Java 21

## Database

- MySQL 8

## Database Connectivity

- JDBC

## Build Tool

- Maven

## Logging

- Log4j2

## Testing

- JUnit 5
- Mockito

## Version Control

- Git
- GitHub

## IDE

- IntelliJ IDEA

---

# 📂 Project Structure

```
ChargeHub
│
├── src
│
├── main
│
│   ├── java
│   │
│   ├── com.chargehub
│   │
│   ├── app
│   ├── config
│   ├── controller
│   ├── dao
│   ├── daoimpl
│   ├── entity
│   ├── service
│   ├── menu
│   ├── repository
│   ├── validation
│   ├── exception
│   ├── utility
│   ├── report
│   ├── authentication
│   ├── payment
│   ├── booking
│   ├── charging
│   ├── station
│   └── vehicle
│
├── resources
│
│   application.properties
│
└── pom.xml
```

---

# 👥 User Roles

## EV User

- Registration
- Login
- Manage Profile
- Register Vehicles
- Search Charging Stations
- Book Charging Slot
- Make Payments
- Download Invoice
- View Charging History

---

## Shop Owner

- Register Business
- Manage Charging Stations
- View Bookings
- Start Charging Session
- Stop Charging Session
- Revenue Dashboard

---

## Field Technician

- Station Maintenance
- Update Charger Status
- Fault Reporting

---

## Customer Support

- Resolve Complaints
- Booking Assistance
- Refund Management

---

## Finance Team

- Revenue Reports
- Settlement Reports
- Invoice Verification

---

## Operations Manager

- Station Monitoring
- Partner Management
- Analytics

---

## Super Admin

- User Management
- Role Management
- Reports
- Revenue
- Dashboard
- System Configuration

---

# ✨ Features

## Authentication

- Email Login
- Mobile Login
- OTP Authentication (Simulation)
- Forgot Password
- Role Based Authentication
- Session Management

---

## Customer Module

- Register
- Login
- Profile Management
- Vehicle Management
- Search Stations
- Book Slot
- Charging History
- Payments
- Wallet
- Ratings

---

## Partner Module

- Shop Registration
- Station Management
- Charger Management
- Revenue Reports
- Booking Dashboard

---

## Admin Module

- User Management
- Station Management
- Employee Management
- Reports
- Revenue Analytics

---

# 📦 Database

```
chargehub_db
```

Tables

```
users

vehicles

shop_owners

charging_stations

chargers

bookings

charging_sessions

payments

wallets

invoices

roles

permissions
```

---

# 🧩 Advanced Java Concepts Used

- OOP
- Collections Framework
- Exception Handling
- File Handling
- Generics
- Lambda Expressions
- Stream API
- JDBC
- MySQL
- Multithreading
- Executor Framework
- Logging
- Reflection
- Serialization
- Design Patterns

---

# 🎨 Design Patterns

- Singleton
- Factory
- Builder
- DAO
- MVC
- Repository
- Strategy
- Observer
- Facade

---

# 📚 SOLID Principles

- Single Responsibility Principle
- Open Closed Principle
- Liskov Substitution Principle
- Interface Segregation Principle
- Dependency Inversion Principle

---

# 📋 Modules

- Authentication
- Customer
- Shop Owner
- Vehicle
- Charging Station
- Booking
- Charging Session
- Payment
- Invoice
- Reports
- Notifications
- Admin

---

# 🔄 Authentication Flow

```
Application

↓

Main Menu

↓

Login

↓

Authentication

↓

Role Verification

↓

Dashboard

↓

Business Modules
```

---

# 💳 Booking Flow

```
Search Station

↓

Select Station

↓

Select Slot

↓

Booking Confirmation

↓

Payment

↓

QR Generation

↓

Charging Session

↓

Invoice
```

---

# 🗂 Development Roadmap

## Phase 1

- Project Setup
- Authentication
- User Management
- JDBC Integration

---

## Phase 2

- Charging Station
- Booking
- Payments

---

## Phase 3

- Reports
- Analytics
- PDF Generation

---

## Phase 4

- Spring Boot Migration
- REST APIs
- JWT Authentication
- Swagger

---

## Phase 5

- React Web
- React Native
- Docker
- AWS Deployment

---

# 🧪 Testing

- Unit Testing
- Integration Testing
- DAO Testing
- Service Testing
- Exception Testing

---

# 📈 Future Enhancements

- Google OAuth
- SMS OTP
- UPI Integration
- QR Code Charging
- Live Station Tracking
- Maps Integration
- OCPP Integration
- AI Recommendation Engine
- Dynamic Pricing
- Mobile Application

---

# 🤝 Contributing

Contributions are welcome.

1. Fork Repository
2. Create Feature Branch
3. Commit Changes
4. Push Branch
5. Create Pull Request

---

# 📜 License

This project is licensed under the MIT License.

---

# 👨‍💻 Author

**Abdul Faisal**

Computer Science (Cyber Security)

Java Developer | Cyber Security Enthusiast | Entrepreneur

---

# ⭐ Support

If you found this project helpful,

⭐ Star this repository

🍴 Fork the project

🐞 Raise Issues

💡 Suggest Features

---

<div align="center">

### ⚡ ChargeHub

### Powering the Future of EV Charging

Made with ❤️ using Java

</div>
