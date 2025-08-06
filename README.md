# Contact Management Full-Stack Application

The **Contact Management Full-Stack Application** is a modern, feature-rich system for managing personal and professional contacts, built to demonstrate the power of combining modern web technologies with enterprise-grade backend frameworks. It leverages a responsive React frontend alongside a robust Spring Boot backend, delivering a seamless user experience with features such as CRUD operations, photo management, contact search, and secure REST APIs. This application uses H2 in-memory database for development and is designed for local development and testing, making it an ideal learning project for full-stack development.

**Created by Sharvesh S**

## Table of Contents

- [Overview](#overview)
- [Key Technologies](#key-technologies)
- [Screenshots](#screenshots)
- [Setup Instructions](#setup-instructions)
- [File Structure](#file-structure)
- [API Endpoints](#api-endpoints)
- [Backend Setup](#backend-setup)
  - [Prerequisites](#1-prerequisites)
  - [Clone the Repository](#2-clone-the-repository)
  - [Install Dependencies](#3-install-dependencies)
  - [Configure the Application](#4-configure-the-application)
  - [Start the Backend Server](#5-start-the-backend-server)
  - [Access the API Endpoints](#6-access-the-api-endpoints)
  - [Backend Testing](#7-backend-testing)
- [Frontend Setup](#frontend-setup)
  - [Clone the Repository](#1-clone-the-repository-1)
  - [Install Dependencies](#2-install-dependencies-1)
  - [Start the Development Server](#3-start-the-development-server)
  - [Build for Production](#4-build-for-production)
  - [Test the Application](#5-test-the-application)
- [Detailed Component Instructions](#detailed-component-instructions)
- [Containerization](#containerization)
- [Troubleshooting](#troubleshooting)
- [Contributing](#contributing)
- [License](#license)
- [Support](#support)

## Overview

The Contact Management System is a dynamic full-stack application that seamlessly combines cutting-edge and traditional technologies. By integrating a modern **React** frontend with a classic **Spring Boot** backend, this project demonstrates how new and established technologies can harmoniously work together to create a robust and efficient application for managing contact information and relationships!

![Java](https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=openjdk&logoColor=white)
![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black)
![React](https://img.shields.io/badge/React-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![React Router](https://img.shields.io/badge/React%20Router-CA4245?style=for-the-badge&logo=reactrouter&logoColor=white)
![Axios](https://img.shields.io/badge/Axios-5A29E4?style=for-the-badge&logo=axios&logoColor=white)
![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white)
![React Toastify](https://img.shields.io/badge/React%20Toastify-45CC11?style=for-the-badge&logo=react&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Spring Data JPA](https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![Hibernate](https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white)
![JUnit5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)
![H2 Database](https://img.shields.io/badge/H2%20Database-1021FF?style=for-the-badge&logo=h2&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![Node.js](https://img.shields.io/badge/Node.js-339933?style=for-the-badge&logo=nodedotjs&logoColor=white)
![npm](https://img.shields.io/badge/npm-CB3837?style=for-the-badge&logo=npm&logoColor=white)
![Git](https://img.shields.io/badge/Git-F05032?style=for-the-badge&logo=git&logoColor=white)
![GitHub](https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white)

## Screenshots

### Contact List View

<img width="2880" height="928" alt="image" src="https://github.com/user-attachments/assets/8e9c1afa-f33d-4d48-90c0-54d5b536b4f6" />

_Modern responsive contact management interface with search and pagination_

### Add/Edit Contact Form

<img width="2864" height="1128" alt="image" src="https://github.com/user-attachments/assets/81c56db3-33c5-43cc-9037-7a6f9aedf3de" />

_Intuitive contact creation and editing form with photo upload functionality_

### Photo Upload Interface

<img width="2880" height="1564" alt="image" src="https://github.com/user-attachments/assets/3911431a-9d37-4945-8c87-52259848d7bb" />

_Drag and drop photo upload with image preview and management_

<p align="center">
 And many more features to explore! Feel free to navigate through the application and test the various functionalities.
</p>

## 🌟 Features

- ✅ **Contact Management**: Add, edit, delete, and view contacts with comprehensive information
- 🖼️ **Photo Upload**: Upload and manage contact photos with image preview
- 🔍 **Search & Filter**: Find contacts quickly with real-time search functionality
- 📱 **Responsive Design**: Works seamlessly on desktop and mobile devices
- 🚀 **REST API**: Full RESTful API for contact operations with proper HTTP methods
- 💾 **Database Integration**: H2 in-memory database for development with easy setup
- 🔧 **Modern Tech Stack**: React 18 + Spring Boot 3 with latest best practices
- 📄 **Pagination**: Efficient contact browsing with paginated results
- 🎨 **Modern UI**: Clean and intuitive user interface with toast notifications
- 🔄 **Real-time Updates**: Instant feedback for all CRUD operations

## Setup Instructions

### Prerequisites

- **Node.js** (v16 or higher)
- **Java** (JDK 21 or higher)
- **Maven** (v3.6 or higher)
- **Git** (for version control)

### Installation

1. **Clone the Repository**

   ```bash
   git clone https://github.com/S-Sharvesh/Contact-Management-App.git
   cd Contact-Management-App
   ```

2. **Backend Setup**

   ```bash
   cd contactapi-main

   # Install dependencies
   mvn install -DskipTests

   # Start the backend server
   mvn spring-boot:run
   ```

3. **Frontend Setup**

   ```bash
   cd contactapp-main

   # Install dependencies
   npm install

   # Start the development server
   npm start
   ```

4. **Access the Application**
   - Frontend: [http://localhost:3000](http://localhost:3000)
   - Backend API: [http://localhost:8080](http://localhost:8080)
   - H2 Database Console: [http://localhost:8080/h2-console](http://localhost:8080/h2-console)

## Key Technologies

- **React (Frontend)**: A modern JavaScript library for building user interfaces, providing a responsive and interactive experience.
  - **React Router**: A routing library for React that enables navigation and URL handling in single-page applications.
  - **Axios**: A promise-based HTTP client for making API requests.
  - **React Toastify**: Beautiful toast notifications for user feedback.
  - **CSS3**: Custom responsive styling for modern UI design.
- **Java Spring Boot (Backend)**: A powerful Java framework for building production-ready applications, offering robust backend support and data management.
  - **Spring Data JPA**: Integration with relational databases using JPA/Hibernate.
  - **Spring Boot Starter Web**: For building web applications and RESTful services.
  - **RESTful APIs**: For communication between the frontend and backend.
  - **Java 21**: Latest LTS version of Java for stability and performance.
  - **JUnit 5**: Testing framework for Java applications.
  - **Lombok**: Reduces boilerplate code in Java classes.
- **H2 Database**: A lightweight, in-memory database perfect for development and testing.
- **Docker**: Containerization platform for packaging applications and their dependencies.
- **Maven**: Dependency management and build automation tool for Java projects.

## API Endpoints

Here's a table listing all the RESTful API endpoints provided by this application:

| Endpoint          | Method | Description                        |
| ----------------- | ------ | ---------------------------------- |
| `/contacts`       | GET    | Get all contacts (with pagination) |
| `/contacts/{id}`  | GET    | Get a contact by ID                |
| `/contacts`       | POST   | Add a new contact                  |
| `/contacts`       | PUT    | Update an existing contact         |
| `/contacts/{id}`  | DELETE | Delete a contact by ID             |
| `/contacts/photo` | PUT    | Upload a contact photo             |
| `/h2-console`     | GET    | Access H2 database console         |

## File Structure

```
Contact-Management-App/
├── README.md                 # Main project documentation
├── LICENSE                   # MIT License
├── CONTRIBUTING.md           # Contribution guidelines
├── SECURITY.md              # Security policy
├── DEPLOYMENT.md            # Deployment guide
├── .gitignore              # Git ignore rules
├── docker-compose.yml      # Docker deployment
├── contactapi-main/        # Spring Boot Backend
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── io/
│   │   │   │       └── getarrays/
│   │   │   │           └── contactapi/
│   │   │   │               ├── Application.java
│   │   │   │               ├── config/
│   │   │   │               │   └── CorsConfig.java
│   │   │   │               ├── constant/
│   │   │   │               │   └── Constant.java
│   │   │   │               ├── domain/
│   │   │   │               │   └── Contact.java
│   │   │   │               ├── repo/
│   │   │   │               │   └── ContactRepo.java
│   │   │   │               ├── resource/
│   │   │   │               │   └── ContactResource.java
│   │   │   │               └── service/
│   │   │   │                   └── ContactService.java
│   │   │   └── resources/
│   │   │       └── application.yml
│   │   └── test/
│   │       └── java/
│   │           └── io/
│   │               └── getarrays/
│   │                   └── contactapi/
│   │                       ├── ApplicationTests.java
│   │                       └── FileuploadanddownloadApplicationTests.java
│   ├── README.md
│   ├── Dockerfile
│   ├── pom.xml
│   └── target/
└── contactapp-main/        # React Frontend
    ├── src/
    │   ├── components/
    │   │   ├── Contact.js
    │   │   ├── ContactDetail.js
    │   │   ├── ContactList.js
    │   │   └── Header.js
    │   ├── api/
    │   │   ├── ContactService.js
    │   │   └── ToastService.js
    │   ├── App.js
    │   ├── index.js
    │   └── index.css
    ├── public/
    │   ├── index.html
    │   ├── favicon.ico
    │   ├── favicon.png
    │   ├── manifest.json
    │   └── robots.txt
    ├── README.md
    ├── Dockerfile
    └── package.json
```

## Backend Setup

### 1. Prerequisites

Ensure that you have Java 21 installed on your local machine. If not, follow the instructions below:

- For MacOS:

  ```bash
  brew install openjdk@21
  export JAVA_HOME=/usr/local/opt/openjdk@21
  ```

- For Windows: Download OpenJDK 21 from [https://adoptium.net/](https://adoptium.net/) and follow the installation instructions.

- Also, ensure that Maven is installed on your local machine.

### 2. Clone the Repository

```bash
git clone https://github.com/S-Sharvesh/Contact-Management-App.git
cd Contact-Management-App
cd contactapi-main
```

### 3. Install Dependencies

First, ensure you have [Maven](https://maven.apache.org/) and [Java JDK](https://adoptium.net/) installed. Run the following command to install them:

- For MacOS:
  ```bash
  brew install maven
  ```
- For Windows: Download Maven from [https://maven.apache.org/download.cgi](https://maven.apache.org/download.cgi) and follow the installation instructions.

Next, install the project dependencies:

```bash
mvn install
```

### 4. Configure the Application

The application comes pre-configured with H2 in-memory database settings in `src/main/resources/application.yml`:

```yaml
# Contact Management Application Configuration
# Created by Sharvesh S
spring:
  datasource:
    url: jdbc:h2:mem:contactdb
    username: sa
    password:
    driver-class-name: org.h2.Driver
  h2:
    console:
      enabled: true
      path: /h2-console
  jpa:
    database-platform: org.hibernate.dialect.H2Dialect
    generate-ddl: true
    show-sql: false
    hibernate:
      ddl-auto: update
```

> **Note**: For production deployment, replace H2 with a persistent database like PostgreSQL or MySQL.

### 5. Start the Backend Server

Run the following command to start the Spring Boot application:

```bash
mvn spring-boot:run
```

The backend will be available at [http://localhost:8080](http://localhost:8080).

### 6. Access the API Endpoints

- **Get All Contacts:**

  ```bash
  curl -X GET "http://localhost:8080/contacts?page=0&size=10"
  ```

- **Get Contact by ID:**

  ```bash
  curl -X GET http://localhost:8080/contacts/1
  ```

- **Create New Contact:**

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

- **Update Contact:**

  ```bash
  curl -X PUT http://localhost:8080/contacts \
    -H "Content-Type: application/json" \
    -d '{
      "id": "1",
      "name": "John Smith",
      "email": "johnsmith@example.com",
      "title": "Senior Software Engineer",
      "phone": "+1234567890",
      "address": "456 Oak St, City, State",
      "status": "Active"
    }'
  ```

- **Delete Contact:**

  ```bash
  curl -X DELETE http://localhost:8080/contacts/1
  ```

- **Upload Contact Photo:**

  ```bash
  curl -X PUT http://localhost:8080/contacts/photo \
    -F "id=1" \
    -F "file=@/path/to/photo.jpg"
  ```

### 7. Backend Testing

To run the unit and integration tests, use:

```bash
mvn test
```

This will run the tests and provide you with the results. Ensure that all tests pass before making any changes to the application.

Feel free to add more tests as needed to ensure the reliability and correctness of your application.

## Frontend Setup

### 1. Clone the Repository

```bash
git clone https://github.com/S-Sharvesh/Contact-Management-App.git
cd Contact-Management-App/contactapp-main
```

### 2. Install Dependencies

Ensure you have [Node.js](https://nodejs.org/) and [npm](https://www.npmjs.com/) installed. Run the following command to install the required dependencies:

```bash
npm install
```

### 3. Start the Development Server

Run the following command to start the React development server:

```bash
npm start
```

The frontend will be available at [http://localhost:3000](http://localhost:3000).

### 4. Build for Production

To create a production build of your application, run:

```bash
npm run build
```

The build files will be generated in the `build` directory.

### 5. Test the Application

To run tests for the frontend application, use the following command:

```bash
npm test
```

## Detailed Component Instructions

### `App.js`

Main application component that manages global state, routing, and API interactions. Handles contact CRUD operations and photo uploads with toast notifications for user feedback.

### `ContactList.js`

Displays a paginated list of contacts with search functionality. Includes options to view contact details, edit, and delete contacts. Features responsive design for mobile and desktop viewing.

### `ContactDetail.js`

Shows detailed information for a specific contact including photo display. Provides navigation options to edit the contact or return to the contact list.

### `Contact.js`

Provides a form component for adding or editing contact details. Includes photo upload functionality with drag-and-drop support and image preview.

### `Header.js`

The navigation header component that includes the application title and navigation links. Provides consistent branding and navigation across all pages.

### `ContactService.js`

Service layer that handles all API communications with the backend. Includes functions for CRUD operations, photo uploads, and error handling.

### `ToastService.js`

Utility service for displaying user notifications. Provides consistent success, error, and info messages throughout the application.

## Containerization

If you'd like to containerize the project, Docker files are included for both frontend and backend. You can build and run the application in Docker containers using the following commands:

```bash
# Build and run with docker-compose
docker-compose up --build

# Or build images separately
cd contactapi-main
docker build -t contact-management-backend .

cd ../contactapp-main
docker build -t contact-management-frontend .

# Run containers
docker run -p 8080:8080 contact-management-backend
docker run -p 3000:3000 contact-management-frontend
```

## Troubleshooting

### Backend Issues

- **`Could not autowire` Errors**: Ensure that all dependencies are correctly defined in the `pom.xml` and that the repository interfaces are located in the correct package structure.

- **`Connection refused` for H2**: Verify that the H2 console is enabled in `application.yml` and that the application is running on the correct port (8080).

- **`Build failed`**: Ensure that you are using Java 21 and that all dependencies are correctly installed. Check the `pom.xml` file for any missing dependencies.

- Regardless of the error, perhaps you can try running the following commands to clean and rebuild the project:

  ```bash
  mvn clean install
  ```

  If the issue persists, you can run Maven with more detailed logging to identify the problem:

  ```bash
  mvn -X spring-boot:run
  ```

### Frontend Issues

- **Error: Cannot read properties of undefined**: Ensure that API responses are properly handled and that components check for data availability before rendering.

- **CORS Issues**: Verify that the CORS configuration in the backend allows requests from `http://localhost:3000`.

- **Photo Upload Issues**: Check that the file size is within limits and that the backend endpoint is correctly configured for multipart file uploads.

- Regardless of the error, perhaps you can try running the following commands to clean and rebuild the project:

  ```bash
  npm install
  ```

  If the issue persists, you can run the React development server with more detailed logging to identify the problem:

  ```bash
  npm start --verbose
  ```

## Contributing

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add some amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Support

For support and questions:

- Create an issue on GitHub
- Contact the developer through GitHub

---

Thank you for checking out the **Contact Management Full-Stack Application!** Feel free to use this project for learning or development purposes.

Created and customized by **[Sharvesh S](https://github.com/S-Sharvesh)** - 2025

For more projects and updates, visit my GitHub profile: **[@S-Sharvesh](https://github.com/S-Sharvesh)**

---

**[⬆ Back to Top](#contact-management-full-stack-application)**
