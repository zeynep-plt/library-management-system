# Library Management System

A full-stack Library Management System project developed using Spring Boot and React.

## Technologies Used

### Backend
- Java
- Spring Boot
- Spring Security
- Spring Data JPA
- H2 Database
- Maven

### Frontend
- React
- Axios
- CSS

## Features

- Add Book
- List Books
- Delete Book
- Search Book
- Validation
- Exception Handling
- Role Based Access Control (RBAC)
- Spring Security Authentication

## Project Structure

- Entity
- Repository
- Service
- Controller
- DTO
- Exception

## User Roles

### ADMIN
- Add Book
- Delete Book
- View All Books

### USER
- Search Books

## API Endpoints

### Book Endpoints

| Method | Endpoint | Description |
|---|---|---|
| POST | /api/books | Add Book |
| GET | /api/books | Get All Books |
| DELETE | /api/books/{id} | Delete Book |
| GET | /api/books/search?title= | Search Book |

### Auth Endpoints

| Method | Endpoint | Description |
|---|---|---|
| GET | /auth/admin | Admin Access |
| GET | /auth/user | User Access |

## Authentication

### Admin User
Username:
admin

Password:
1234

### Normal User
Username:
user

Password:
1234

## How to Run

1. Clone the repository

```bash
https://github.com/zeynep-plt/library-management-systems