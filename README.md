# Movie Ticket Booking System

## 📌 Project Overview

The **Movie Ticket Booking System** is a console-based Java application developed using **Core Java**. It allows customers to register, log in, view available movies, book movie tickets, view their bookings, and cancel bookings.

The system also provides an **Admin module** to manage movies and view booking details.

This project was developed to practice **Java OOP concepts, Collections, constructors, methods, inheritance, encapsulation, and menu-driven programming**.

---

## 🎯 Objectives

* Provide a simple system for booking movie tickets.
* Allow customers to register and log in.
* Display available movies and show details.
* Allow customers to book multiple tickets.
* Calculate the total ticket amount automatically.
* Allow customers to view and cancel their bookings.
* Allow the admin to manage movies and view bookings.
* Practice Core Java concepts through a real-world application.

---

## ✨ Features

### 👤 Customer

* Customer Registration
* Customer Login
* View Available Movies
* Book Movie Tickets
* Select Theatre and Show
* Calculate Total Ticket Amount
* View Booking Details
* Cancel Booking
* Logout

### 🔐 Admin

* Admin Login
* Add New Movies
* View Movies
* Delete Movies
* View All Bookings
* Logout

---

## 🛠️ Technologies Used

* **Programming Language:** Java
* **Concepts:** OOP, Inheritance, Encapsulation, Method Overloading
* **Collections:** ArrayList
* **Input:** Scanner
* **IDE:** Eclipse / VS Code
* **Version Control:** Git and GitHub

---

## 📂 Project Structure

```text
Movie_Ticket_Booking_System
│
└── src
    │
    ├── com.modules
    │   ├── User.java
    │   ├── Admin.java
    │   ├── Customer.java
    │   ├── Movies.java
    │   ├── Theatres.java
    │   ├── Shows.java
    │   └── Bookings.java
    │
    ├── com.Services
    │   ├── UserServices.java
    │   ├── MovieServices.java
    │   └── Booking_services.java
    │
    └── com_main
        └── Movie_Ticket_Booking_main.java
```

---

## 🔄 Application Flow

```text
Start
  ↓
Main Menu
  ↓
Admin / Customer
  ↓
Customer Registration
  ↓
Customer Login
  ↓
View Movies
  ↓
Select Movie
  ↓
Select Theatre & Show
  ↓
Enter Number of Tickets
  ↓
Calculate Total Amount
  ↓
Confirm Booking
  ↓
View / Cancel Booking
  ↓
Logout
```

---

## 👨‍💼 Admin Flow

```text
Admin Login
     ↓
Admin Menu
     ↓
 ┌───────────────┬────────────────┬─────────────────┐
 │               │                │
Add Movie    View Movies     Delete Movie
 │
 └───────────────→ View Bookings
```

### Default Admin Login

```text
Email: admin@gmail.com
Password: admin123
```

---

## 🎟️ Booking Process

1. Customer logs into the system.
2. Available movies are displayed.
3. Customer selects a movie.
4. The system displays the available show and theatre details.
5. Customer enters the number of tickets.
6. The system checks ticket availability.
7. The total amount is calculated.
8. Booking details are stored in the booking list.
9. Available ticket count is updated.
10. Customer can view or cancel the booking.

### Example

```text
Ticket Price = ₹200
Number of Tickets = 2

Total Amount = 200 × 2
             = ₹400
```

---

## 🧩 Java Concepts Used

### 1. Encapsulation

Data members are declared as private and accessed using getters and setters.

### 2. Inheritance

`Admin` and `Customer` inherit common properties from the `User` class.

```java
public class Customer extends User
```

```java
public class Admin extends User
```

### 3. ArrayList

`ArrayList` is used to store customers, movies, and bookings dynamically.

```java
ArrayList<Movies> movieList = new ArrayList<>();
```

### 4. Method Overloading

Different methods are used to search movies based on different parameters such as movie ID or movie name.

### 5. Constructors

Constructors are used to initialize objects when they are created.

### 6. Object Relationships

A show is associated with a movie and theatre, while a booking contains show and ticket information.

---

## ▶️ How to Run the Project

### Using Eclipse

1. Download or clone this repository.
2. Open **Eclipse**.
3. Select **File → Import**.
4. Select **Existing Projects into Workspace**.
5. Select the project folder.
6. Make sure the `src` folder is configured as the source folder.
7. Open:

```
Movie_Ticket_Booking_main.java
```

8. Right-click the file.
9. Select **Run As → Java Application**.
10. ---

This project is created for **learning and educational purposes**.
