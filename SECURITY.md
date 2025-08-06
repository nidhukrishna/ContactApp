# Security Policy

## Supported Versions

| Version | Supported |
| ------- | --------- |
| 1.0.x   | ✅ Yes    |
| < 1.0   | ❌ No     |

## Reporting a Vulnerability

If you discover a security vulnerability in this Contact Management Application, please report it responsibly:

### 📧 Contact Information

- **Author:** Sharvesh S
- **Email:** [Contact via GitHub Issues](../../issues) (for non-sensitive issues)
- **Private Reports:** Create a private security advisory through GitHub

### 🔒 Reporting Process

1. **Do NOT** open a public issue for security vulnerabilities
2. Send a detailed report including:
   - Description of the vulnerability
   - Steps to reproduce
   - Potential impact
   - Suggested fix (if any)

### ⏱️ Response Timeline

- **Initial Response:** Within 48 hours
- **Status Update:** Within 7 days
- **Fix Timeline:** Depends on severity and complexity

### 🛡️ Security Best Practices

This application follows these security practices:

#### Backend (Spring Boot)

- Input validation and sanitization
- CORS configuration for frontend communication
- SQL injection prevention through JPA
- Secure file upload handling

#### Frontend (React)

- XSS protection through React's built-in sanitization
- Secure API communication
- Input validation on client side

#### General

- Regular dependency updates
- No hardcoded credentials in source code
- Environment-specific configuration

### 🔐 Known Security Considerations

1. **Development Database:** Uses H2 in-memory database with default credentials for development
2. **File Uploads:** Configured with large file size limits for demo purposes
3. **CORS:** Enabled for development - should be restricted in production

### 🚀 Production Security Recommendations

Before deploying to production:

1. **Database Security:**

   - Use a production database (PostgreSQL/MySQL)
   - Secure database credentials
   - Enable database encryption

2. **Application Security:**

   - Enable HTTPS/SSL
   - Configure proper CORS policies
   - Set secure file upload limits
   - Implement authentication/authorization

3. **Infrastructure:**
   - Use secure hosting environment
   - Regular security updates
   - Monitor application logs
   - Implement backup strategies

### 📋 Disclosure Policy

- Vulnerabilities will be disclosed after fixes are deployed
- Credit will be given to security researchers who report responsibly
- Public disclosure timeline will be coordinated with the reporter

Thank you for helping keep this project secure!

---

**Maintained by Sharvesh S**
