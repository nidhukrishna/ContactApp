# 🚀 Deployment Guide

**Contact Management Application - Created by Sharvesh S**

This guide covers different deployment options for the Contact Management Application.

## 📋 Prerequisites

- Docker & Docker Compose (for Docker deployment)
- Java 21+ (for local deployment)
- Node.js 16+ (for local deployment)
- Git

## 🐳 Docker Deployment (Recommended)

### Quick Start with Docker Compose

1. **Clone the repository:**

   ```bash
   git clone https://github.com/S-Sharvesh/Contact-Management-App.git
   cd Contact-Management-App
   ```

2. **Build and run with Docker Compose:**

   ```bash
   docker-compose up --build
   ```

3. **Access the application:**
   - Frontend: http://localhost:3000
   - Backend API: http://localhost:8080
   - H2 Database Console: http://localhost:8080/h2-console

### Individual Docker Builds

**Backend:**

```bash
cd contactapi-main
docker build -t contact-api .
docker run -p 8080:8080 contact-api
```

**Frontend:**

```bash
cd contactapp-main
docker build -t contact-frontend .
docker run -p 3000:3000 contact-frontend
```

## 🖥️ Local Development Deployment

### Backend (Spring Boot)

1. **Navigate to backend directory:**

   ```bash
   cd contactapi-main
   ```

2. **Run with Maven:**

   ```bash
   mvn spring-boot:run
   ```

   Or build and run JAR:

   ```bash
   mvn clean package
   java -jar target/contactapi-1.0.0.jar
   ```

### Frontend (React)

1. **Navigate to frontend directory:**

   ```bash
   cd contactapp-main
   ```

2. **Install dependencies and start:**
   ```bash
   npm install
   npm start
   ```

## ☁️ Cloud Deployment Options

### 1. Heroku Deployment

**Backend (Spring Boot):**

1. Create a `Procfile` in the backend root:

   ```
   web: java -jar target/contactapi-1.0.0.jar
   ```

2. Deploy to Heroku:
   ```bash
   heroku create your-contact-api
   git subtree push --prefix contactapi-main heroku main
   ```

**Frontend (React):**

1. Create a `serve.json` for routing:

   ```json
   {
     "routes": [
       {
         "src": "^/static/(.*)",
         "headers": { "cache-control": "s-maxage=31536000" }
       },
       { "src": "^/favicon.ico$", "dest": "/favicon.ico" },
       { "src": "^/manifest.json$", "dest": "/manifest.json" },
       { "src": "^/(.*)", "dest": "/index.html" }
     ]
   }
   ```

2. Deploy to Vercel or Netlify

### 2. AWS Deployment

**Using AWS Elastic Beanstalk:**

1. Package the Spring Boot JAR
2. Upload to Elastic Beanstalk
3. Configure environment variables

**Using AWS EC2:**

1. Set up EC2 instance
2. Install Java and Docker
3. Deploy using Docker Compose

### 3. Digital Ocean App Platform

1. Connect your GitHub repository
2. Configure build settings:
   - Backend: Dockerfile in `contactapi-main/`
   - Frontend: Dockerfile in `contactapp-main/`

## 🔧 Production Configuration

### Environment Variables

**Backend:**

```bash
export SPRING_PROFILES_ACTIVE=prod
export DATABASE_URL=your_database_url
export DATABASE_USERNAME=your_username
export DATABASE_PASSWORD=your_password
```

**Frontend:**

```bash
export REACT_APP_API_URL=https://your-api-url.com
```

### Database Configuration

For production, update `application-prod.yml`:

```yaml
spring:
  datasource:
    url: ${DATABASE_URL}
    username: ${DATABASE_USERNAME}
    password: ${DATABASE_PASSWORD}
    driver-class-name: org.postgresql.Driver
  jpa:
    database-platform: org.hibernate.dialect.PostgreSQLDialect
    hibernate:
      ddl-auto: validate
    show-sql: false
```

## 🔒 Security Checklist

- [ ] Change default database credentials
- [ ] Enable HTTPS/SSL
- [ ] Configure proper CORS policies
- [ ] Set up authentication/authorization
- [ ] Configure file upload restrictions
- [ ] Set up monitoring and logging
- [ ] Regular security updates

## 📊 Monitoring & Health Checks

### Health Endpoints

- Backend health: `GET /actuator/health`
- Application info: `GET /actuator/info`

### Add Spring Boot Actuator

Add to `pom.xml`:

```xml
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-actuator</artifactId>
</dependency>
```

## 🔄 CI/CD Pipeline

### GitHub Actions Example

Create `.github/workflows/deploy.yml`:

```yaml
name: Deploy Contact App

on:
  push:
    branches: [main]

jobs:
  deploy:
    runs-on: ubuntu-latest

    steps:
      - uses: actions/checkout@v2

      - name: Set up JDK 21
        uses: actions/setup-java@v2
        with:
          java-version: "21"
          distribution: "temurin"

      - name: Build Backend
        run: |
          cd contactapi-main
          mvn clean package

      - name: Build Frontend
        run: |
          cd contactapp-main
          npm install
          npm run build

      - name: Deploy
        # Add your deployment steps here
```

## 📝 Troubleshooting

### Common Issues

1. **Port conflicts:** Ensure ports 3000 and 8080 are available
2. **CORS errors:** Check frontend API URL configuration
3. **Database connection:** Verify database URL and credentials
4. **File upload issues:** Check file size limits and permissions

### Logs

- Backend logs: Check Spring Boot console output
- Frontend logs: Check browser developer console
- Docker logs: `docker-compose logs`

## 📞 Support

For deployment issues, please:

1. Check the troubleshooting section
2. Review application logs
3. Open an issue on GitHub

---

**Created by Sharvesh S** | Last updated: 2024
