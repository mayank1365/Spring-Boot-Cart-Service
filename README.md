
# Spring Boot Cart Service

This is a Spring Boot application that provides a Cart Service. It is developed using Java and managed with Gradle.

## Getting Started

These instructions will get you a copy of the project up and running on your local machine for development and testing purposes.

### Prerequisites

- Java 17 or higher
- Intellij Idea

### Installing

1. Clone the repository
```bash
git clone https://github.com/mayank1365/Spring-Boot-Cart-Service.git
```
2. Open the project in your IDE
3. Run the application
```bash
./gradlew bootRun
```

## API Endpoints

### Get Cart
```
GET /cart
```
This endpoint returns the current cart.

### Add Item to Cart
```
POST /cart
```
This endpoint adds an item to the cart.

### Get Cart by ID
```
GET /cart/{id}
```
This endpoint returns the cart with the specified ID.

### Remove Item from Cart
```
DELETE /cart/{id}
```
This endpoint removes an item from the cart.

### Update Item in Cart
```
PUT /update
```
This endpoint updates an item in the cart. 

### Get Cart by User ID
```
GET /user/{userId}
```
This endpoint returns the cart with the specified user ID.

### Get Cart by Date

```
GET /cart/dateRange?from={from}&to={to}
```
This endpoint returns the carts added between the specified dates

