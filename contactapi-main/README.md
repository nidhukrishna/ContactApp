# 🔧 Contact Management Backend API

**Created by Sharvesh S**

This is the Spring Boot backend API for the Contact Management Application. It provides RESTful endpoints for contact management operations.

## 🚀 Quick Start

1. **Run the application:**

   ```bash
   mvn spring-boot:run
   ```

2. **Or build and run JAR:**

   ```bash
   mvn clean package
   java -jar target/contactapi-0.0.1-SNAPSHOT.jar
   ```

3. **Access H2 Database Console:**
   - URL: `http://localhost:8080/h2-console`
   - JDBC URL: `jdbc:h2:mem:testdb`
   - Username: `sa`
   - Password: `password`

## 🛠️ Technologies Used

- **Spring Boot 3.1.5** - Java framework
- **Spring Data JPA** - Database abstraction layer
- **H2 Database** - In-memory database
- **Lombok** - Reduces boilerplate code
- **Maven** - Dependency management
- **Java 21** - Latest LTS Java version

## 📁 Project Structure

```
src/main/java/io/getarrays/contactapi/
├── Application.java        # Main Spring Boot application
├── config/
│   └── CorsConfig.java    # CORS configuration
├── constant/
│   └── Constant.java      # Application constants
├── domain/
│   └── Contact.java       # Contact entity
├── repo/
│   └── ContactRepo.java   # Data repository
├── resource/
│   └── ContactResource.java # REST controller
└── service/
    └── ContactService.java  # Business logic
```

## 🔗 API Endpoints

### Contact Management

- `GET /contacts?page={page}&size={size}` - Get paginated contacts
- `GET /contacts/{id}` - Get contact by ID
- `POST /contacts` - Create new contact
- `PUT /contacts` - Update existing contact
- `DELETE /contacts/{id}` - Delete contact

### Photo Management

- `PUT /contacts/photo` - Upload contact photo

### Example Requests

**Create Contact:**

```bash
curl -X POST http://localhost:8080/contacts \
  -H "Content-Type: application/json" \
  -d '{
    "name": "John Doe",
    "email": "john@example.com",
    "title": "Software Engineer",
    "phone": "+1234567890",
    "address": "123 Main St, City, State",
    "status": "Active"
  }'
```

**Get All Contacts:**

```bash
curl "http://localhost:8080/contacts?page=0&size=10"
```

## ⚙️ Configuration

### Database Configuration (application.yml)

```yaml
spring:
  datasource:
    url: jdbc:h2:mem:testdb
    username: sa
    password: password
    driver-class-name: org.h2.Driver
  h2:
    console:
      enabled: true
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    generate-ddl: true
    show-sql: true
    hibernate:
      ddl-auto: update
```

### Server Configuration

- **Port:** 8080
- **CORS:** Enabled for frontend communication
- **File Upload:** Max size 1000MB
- **Error Handling:** Custom error pages disabled

## 📊 Database Schema

### Contact Entity

```sql
CREATE TABLE contact (
    id VARCHAR(255) PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE,
    title VARCHAR(255),
    phone VARCHAR(255),
    address TEXT,
    status VARCHAR(50),
    photo_url VARCHAR(500),
    created_at TIMESTAMP,
    updated_at TIMESTAMP
);
```

## 🧪 Testing

Run tests with:

```bash
mvn test
```

## 🚀 Production Deployment

For production deployment:

1. **Switch to persistent database** (PostgreSQL/MySQL)
2. **Update application.yml** with production database settings
3. **Build production JAR:**
   ```bash
   mvn clean package -Pprod
   ```
4. **Deploy JAR** to your server

## 👨‍💻 Author

**Sharvesh S**

---

Part of the Contact Management Application suite.
