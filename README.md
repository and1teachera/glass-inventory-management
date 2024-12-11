# Glass Inventory Management System

A modern, lightweight inventory management application designed specifically for glass warehouses. This application simplifies the process of tracking and managing glass sheets and packs, allowing for quick adjustments and an intuitive user experience. The system is created for single-warehouse operations with future extensibility in mind.

---

## Features

- **Comprehensive Product Management**:
  - Add and manage glass products with dynamic attributes like thickness, type, dimensions, and color.
  - Track inventory at multiple levels:
    - Packs (number of sheets per pack)
    - Individual sheets
    - Standalone items.
  - Flexible product structure for easy customization and modification.

- **Inventory Control**:
  - View inventory in a clear, hierarchical format.
  - Adjust quantities with validation to prevent negative stock.
  - Log every inventory operation with detailed tracking of changes.

- **Localized Interface**:
  - Full Bulgarian language support, including UI, error messages, and formatting.

- **Modern Design**:
  - Clean and responsive JavaFX interface.
  - Optimized database performance with MariaDB.

---

## Technology Stack

- **Backend**: Java 21, Spring Boot 3
- **Frontend**: JavaFX
- **Database**: MariaDB with Spring Data JPA and Hibernate ORM
- **Build Tool**: Gradle
- **Testing**: JUnit 5 for test-driven development
- **CI/CD**: GitHub Actions for automated builds and tests

---

## How It Works

1. **Add Products**: Define products with dynamic attributes like thickness, glass type, and dimensions.
2. **Track Inventory**: Monitor product availability, including packs, sheets per pack, and standalone items.
3. **Adjust Quantities**: Update inventory seamlessly with validation and detailed logging.
4. **Review Logs**: Keep track of every inventory operation, including additions, removals, and modifications.

---

## Development Highlights

This project is developed with a focus on professional practices:
- **Test-Driven Development (TDD)**: Ensuring robust and reliable functionality.
- **Continuous Integration/Continuous Deployment (CI/CD)**: Automated testing and deployment with GitHub Actions.
- **Conventional Commits**: Clear and structured commit messages for enhanced collaboration and tracking.
- **Modular Design**: Extensible and maintainable architecture.

---

## Getting Started

### Prerequisites
- Java 21
- MariaDB
- Gradle 8
- Windows (for standalone desktop execution)

### Setup
1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/glass-inventory-management.git
   cd glass-inventory-management
   ```
2. Configure the database in `application.properties`.
3. Build and Run the Application
Build the project:

    ``` bash
    ./gradlew build
    ```
Run the application:

``` bash
    java -jar build/libs/glass-inventory-management.jar
```


