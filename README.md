# 📝 Auto-Save API for Online Test Platform

A backend Spring Boot application to auto-save student responses during an online exam every 30 seconds.

---

## 📌 Features

- RESTful `POST /autosave` endpoint
- Saves or updates answers per student and test
- Supports:
  - Attempted
  - Skipped
  - Marked for Review
- Includes:
  - Input validation
  - Exception handling
  - Timestamps for last save

---

## 🛠 Tech Stack

- Java 17+
- Spring Boot
- PostgreSQL
- Spring Data JPA
- REST API
- Bean Validation (Hibernate Validator)

---

## 📦 API Endpoint

**POST** `/autosave`

### Request Body

```json
{
  "studentId": 1,
  "testId": 101,
  "answers": [
    {
      "questionId": 201,
      "response": "Option A",
      "status": "attempted"
    }
  ]
}

```


### ----  NOTE -----

Update your application.properties:

spring.datasource.url=jdbc:postgresql://localhost:5432/auto_save_db
spring.datasource.username=akash
spring.datasource.password=12345678




### ---- Running the Project ----
1. Clone the repo
git clone https://github.com/your-username/auto-save-api.git
cd auto-save-api

3. Build and run
Using Maven:
./mvnw spring-boot:run
