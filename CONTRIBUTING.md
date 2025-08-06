# Contributing to Contact Management Application

Thank you for your interest in contributing to this project! Created by **Sharvesh S**.

## How to Contribute

### 🐛 Reporting Bugs

1. Check if the bug has already been reported in the [Issues](../../issues) section
2. If not, create a new issue with:
   - Clear title and description
   - Steps to reproduce the bug
   - Expected vs actual behavior
   - Screenshots if applicable
   - Environment details (OS, browser, Java version, etc.)

### 🚀 Suggesting Features

1. Check existing [Issues](../../issues) for similar feature requests
2. Create a new issue with:
   - Clear feature description
   - Use case and benefits
   - Possible implementation approach

### 💻 Code Contributions

1. **Fork the repository**
2. **Create a feature branch**
   ```bash
   git checkout -b feature/amazing-feature
   ```
3. **Make your changes**
   - Follow the existing code style
   - Add comments for complex logic
   - Include tests if applicable
4. **Commit your changes**
   ```bash
   git commit -m "Add amazing feature"
   ```
5. **Push to your branch**
   ```bash
   git push origin feature/amazing-feature
   ```
6. **Open a Pull Request**

## Development Setup

### Prerequisites

- Java 21+
- Node.js 16+
- Maven 3.6+
- Git

### Local Development

1. **Clone your fork**

   ```bash
   git clone https://github.com/your-username/contact-app.git
   cd contact-app
   ```

2. **Backend setup**

   ```bash
   cd contactapi-main
   mvn spring-boot:run
   ```

3. **Frontend setup**
   ```bash
   cd contactapp-main
   npm install
   npm start
   ```

## Code Style Guidelines

### Java (Backend)

- Follow standard Java conventions
- Use meaningful variable and method names
- Add JavaDoc comments for public methods
- Keep methods small and focused

### JavaScript/React (Frontend)

- Use functional components with hooks
- Follow React best practices
- Use meaningful component and variable names
- Add comments for complex logic

### General

- Use consistent indentation (2 spaces for JS, 4 for Java)
- Remove trailing whitespace
- Add newline at end of files

## Testing

- Write tests for new features
- Ensure existing tests pass
- Test both frontend and backend changes

### Running Tests

**Backend:**

```bash
cd contactapi-main
mvn test
```

**Frontend:**

```bash
cd contactapp-main
npm test
```

## Pull Request Guidelines

- Use clear, descriptive titles
- Include detailed description of changes
- Reference related issues
- Keep changes focused and atomic
- Update documentation if needed
- Ensure tests pass

## Questions?

Feel free to open an issue for any questions about contributing!

## Recognition

All contributors will be recognized in the project documentation.

---

**Project Maintainer: Sharvesh S**
