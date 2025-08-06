# Contact Management Frontend - Dockerfile
# Created by Sharvesh S

# Use Node.js 18 as base image
FROM node:18-alpine

# Set the working directory
WORKDIR /app

# Copy package.json and package-lock.json
COPY package*.json ./

# Install dependencies
RUN npm ci --only=production

# Copy source code
COPY . .

# Build the application
RUN npm run build

# Install serve to run the application
RUN npm install -g serve

# Expose port 3000
EXPOSE 3000

# Serve the built application
CMD ["serve", "-s", "build", "-l", "3000"]

# Add labels for metadata
LABEL maintainer="Sharvesh S"
LABEL description="Contact Management Frontend - React Application"
LABEL version="1.0.0"
LABEL repository="https://github.com/S-Sharvesh/Contact-Management-App"
