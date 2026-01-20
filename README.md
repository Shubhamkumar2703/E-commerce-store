🛒 Full-Stack E-Commerce Store

A full-stack E-commerce Store application built using React (Vite) for the frontend and Spring Boot for the backend. The project demonstrates RESTful API development, database integration, and modern frontend practices.

📌 About

This project includes both frontend and backend implementations of an e-commerce store.
The backend handles business logic, APIs, and database operations, while the frontend provides a responsive and user-friendly interface.

🛠 Tech Stack


Frontend

React.js

Vite

JavaScript (ES6)

Bootstrap

Fetch API

Backend

Spring Boot

Spring Data JPA

Hibernate

MySQL

REST APIs

CORS Configuration

CommandLineRunner (Data Seeding)
```
📂 Project Structure
├── ecom-catalog-react/     # Frontend (React + Vite)
├── src/                    # Backend source code
│   ├── model/             # Entity layer
│   ├── service/           # Service layer
│   ├── controller/        # REST controllers
├── pom.xml                 # Maven configuration
├── mvnw / mvnw.cmd         # Maven wrapper
├── .gitignore
└── README.md
````
🚀 Features

Full-stack e-commerce architecture

RESTful API development using Spring Boot

Responsive UI built with React and Bootstrap

Dynamic data fetching using Fetch API

MySQL database integration with JPA & Hibernate

CORS enabled for frontend–backend communication

Initial data seeding using CommandLineRunner
```
▶️ Run the Project
Backend
./mvnw spring-boot:run
````
```
Frontend
cd ecom-catalog-react
npm install
npm run dev
````

📈 Future Enhancements

User authentication and authorization

Shopping cart and checkout system

Payment gateway integration

Admin dashboard

📄 License

This project is for learning and demonstration purposes.

🤝 Contributing

Feel free to fork the repository, raise issues, or submit pull requests.
