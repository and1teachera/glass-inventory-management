**Title**: Glass Inventory Management Desktop Application

**Objective**: Develop a lightweight, standalone desktop application using JavaFX for the UI, MariaDB for the database, and Gradle for dependency management. The application will allow a single user to manage glass inventory in a warehouse, tracking the quantity of glass sheets and packs by type, attribute (such as thickness or glass type), dimensions, and color. It will facilitate efficient inventory tracking with a focus on simplicity, allowing quick adjustments for sales or inventory movements. The product entry process will be highly flexible, allowing the user to define sections based on different properties such as thickness or glass type.

**Scope**:

The application provides comprehensive inventory management capabilities with the following scope:

- The application runs on a Windows device, managing inventory for a single warehouse.
- The system tracks both the number of sheets and packs, allowing users to specify how many sheets are in each pack and if there are any standalone items.
- Users can add product entries dynamically, with each section representing a property like thickness or glass type. Users can enter multiple dimensions and quantities per section.
- Users can search and view inventory based on product name, with the system designed for potential future expansion to search by other attributes.
- The application includes a detailed inventory operations log to track all inventory changes.
- The focus remains on simplicity, with basic data integrity checks and validation.
- The application integrates with a MariaDB database for reliable data storage.

#### **Technology Stack**

- **Programming Language**: Java 21
- **UI Framework**: JavaFX
- **Database**: MariaDB
- **Build Tool**: Gradle
- **Spring Framework**: Spring Boot 3.3.3 for dependency injection and data access
- **Additional Libraries**: 
    - Hibernate ORM for database operations
    - ModelMapper for object mapping
    - Lombok for reducing boilerplate code
- **Localization**: Bulgarian language only

#### **Development Steps**

1. **Project Setup**:
    - Create a Spring Boot Gradle project
    - Add dependencies for JavaFX, MariaDB, Spring Data JPA, and supporting libraries
    - Configure Gradle for building the application
    
2. **Database Implementation**:
    - Design and implement the database schema using JPA entities
    - Configure MariaDB connection and Hibernate properties
    - Implement repository interfaces using Spring Data JPA
    
3. **UI Development**:
    - Design and implement the JavaFX interface with Bulgarian localization
    - Create a dynamic form for product entry and inventory management
    - Implement a hierarchical view for products using TreeTableView
    - Develop inventory adjustment functionality
    - Create the inventory operations log view
    
4. **Backend Implementation**:
    - Implement service layer with business logic
    - Create DTOs for data transfer between layers
    - Implement validation and error handling
    - Add transaction management
    
5. **Testing**:
    - Test the application functionality
    - Verify data integrity and constraint handling
    - Test the dynamic product entry system
    - Validate inventory adjustment operations
    
6. **Application Integration**:
    - Integrate Spring Boot with JavaFX
    - Configure proper shutdown and startup procedures
    - Implement proper window management
    
7. **Create the Installer**:
    - Use `jpackage` (included in the JDK) to create an installer for Windows.
    - Configure the installer to include all necessary dependencies.
    - Add database configuration scripts and documentation.
    
8. **Deployment**:
    - Distribute the installer for installation on Windows machines.
    - Provide database setup and configuration instructions.
    - Include initial database schema creation scripts.
