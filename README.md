# SplitWiseTracker

A Spring Boot application to track shared expenses and users, inspired by Splitwise.

## Features

- User management (create, list)
- Expense management (create, list)
- RESTful API
- MariaDB integration

## Requirements

- Java 17+
- Maven
- MariaDB

## Setup

1. Clone the repository.
2. Configure your database in `src/main/resources/application.properties`.
3. Build and run:

```sh
./mvnw spring-boot:run
```

## API Endpoints

- `GET /users` - List all users
- `POST /users` - Create a user
- `GET /expenses` - List all expenses
- `POST /expenses` - Create an expense

## Testing

```sh
./mvnw test
```