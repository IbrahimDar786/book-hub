# 📚 BookHub

BookHub is a Library Management System built using Spring Boot, Thymeleaf, Spring Data JPA, and MySQL. The application allows administrators to manage books and students through a simple web interface.

---

## 🚀 Features

### 📖 Book Management
- Add Book
- View All Books
- Update Book
- Delete Book
- Search Book by Title
- Search Book by Author

### 👨‍🎓 Student Management
- Add Student
- View All Students
- Update Student
- Delete Student

### ✅ Validation
- Book title cannot be empty
- Author cannot be empty
- Genre cannot be empty
- Publisher cannot be empty
- Price must be positive
- Student name cannot be empty
- Email must be valid
- Mobile cannot be empty
- Address cannot be empty

---

## 🛠️ Tech Stack

### Backend
- Java
- Spring Boot
- Spring Data JPA
- Hibernate

### Frontend
- Thymeleaf
- HTML
- Bootstrap 5

### Database
- MySQL

### Build Tool
- Maven

### Utilities
- Lombok

---

## 📂 Project Structure

```text
src/main/java
└── com.springproject.bookhub
    ├── controller
    ├── service
    ├── repository
    └── entity

src/main/resources
├── static
│   └── css
├── templates
│   ├── index.html
│   ├── books.html
│   ├── book-form.html
│   ├── students.html
│   └── student-form.html
└── application.properties
```

## 🗄️ Database Configuration

Create a database named:

```sql
CREATE DATABASE bookhub;
```

Update `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/bookhub
spring.datasource.username=root
spring.datasource.password=your_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

## 📚 Entity Design

### Book

| Field | Type |
|---------|---------|
| id | Long |
| title | String |
| author | String |
| genre | String |
| publisher | String |
| price | Double |

### Student

| Field | Type |
|---------|---------|
| id | Long |
| name | String |
| email | String |
| mobile | String |
| address | String |

---

## ▶️ Running the Application

### Clone Repository

```bash
git clone <repository-url>
```

### Navigate to Project

```bash
cd BookHub
```

### Run Application

```bash
mvn spring-boot:run
```

or run:

```text
BookHubApplication.java
```

from your IDE.

---

## 🌐 Application URLs

### Dashboard

```text
http://localhost:8081
```

### Books

```text
http://localhost:8081/books
```

### Students

```text
http://localhost:8081/students
```

---

## 🎯 Learning Objectives

This project was built to learn:

- Spring Boot Fundamentals
- MVC Architecture
- Spring Data JPA
- MySQL Integration
- Thymeleaf Templates
- Form Validation
- CRUD Operations
- Repository Pattern
- Service Layer Design

---

## 🔮 Future Enhancements

- Authentication & Authorization
- Borrow Book Functionality
- Return Book Functionality
- Book Availability Tracking
- Dashboard Statistics
- REST APIs
- Exception Handling
- Pagination & Sorting
- Responsive UI Improvements

---

## 👨‍💻 Author

Developed as part of a Spring Boot learning journey focused on building real-world CRUD applications and understanding backend development fundamentals.
