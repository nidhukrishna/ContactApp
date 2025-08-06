# 📱 Contact Management Frontend

**Created by Sharvesh S**

This is the React frontend for the Contact Management Application. It provides a modern, responsive user interface for managing contacts.

## 🚀 Quick Start

1. **Install dependencies:**

   ```bash
   npm install
   ```

2. **Start development server:**

   ```bash
   npm start
   ```

3. **Build for production:**
   ```bash
   npm run build
   ```

## 🛠️ Technologies Used

- **React 18** - Latest React with hooks
- **React Router DOM** - Client-side routing
- **Axios** - HTTP client for API communication
- **React Toastify** - Beautiful toast notifications
- **CSS3** - Custom responsive styling

## 📁 Project Structure

```
src/
├── components/          # React components
│   ├── Contact.js      # Contact form component
│   ├── ContactDetail.js # Contact detail view
│   ├── ContactList.js  # Contact list component
│   └── Header.js       # Application header
├── api/                # API service layer
│   ├── ContactService.js # Contact API calls
│   └── ToastService.js  # Toast notification service
├── App.js              # Main application component
├── index.js            # Application entry point
└── index.css           # Global styles
```

## 🔗 API Integration

The frontend communicates with the Spring Boot backend running on `http://localhost:8080`. Make sure the backend is running before starting the frontend.

## 📱 Features

- Responsive design that works on all devices
- Real-time contact management
- Photo upload functionality
- Toast notifications for user feedback
- Smooth navigation with React Router

## 👨‍💻 Author

**Sharvesh S**

---

Part of the Contact Management Application suite.
