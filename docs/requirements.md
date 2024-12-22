### **Functional Requirements**

1. **Glass Product Management**

    The system allows comprehensive management of glass products through the following capabilities:

    - **Dynamic Product Entry**: 
        The application enables users to add new glass products by entering the product name, with support for complex product structures. Users can specify multiple attributes including thickness and glass type, with thickness being the default attribute. For each product specification, users can specify multiple dimensions and quantities.

        Product entries support:
        - Basic product information (name, optional description)
        - Multiple attribute sections (thickness values or glass types)
        - Multiple dimensions per section (e.g., "3210/2250")
        - Quantity tracking including:
            - Number of sheets per pack
            - Number of packs available
            - Number of standalone items
        - Optional attributes like glassmaker and type
        - Dynamic addition of sections and dimensions

    - **Product Specification Management**:
        The system provides tools for managing product specifications effectively:
        - Creation of new specifications based on existing products
        - Modification of specification attributes and quantities
        - Hierarchical organization of specifications by attributes

    - **Product Editing**:
        Users can modify existing products with capabilities to:
        - Update product information
        - Modify sections and their attributes
        - Adjust dimensions and quantities
        - Add or remove specifications

    - **Product Deletion**:
        The system supports complete removal of products including:
        - Deletion of the main product record
        - Removal of all associated specifications
        - Cleanup of related inventory entries
        - Preservation of historical log entries

2. **Inventory Management**

    The inventory management system offers comprehensive tracking and adjustment capabilities:

    - **Quantity Tracking**:
        The system maintains detailed quantity information:
        - Pack-level tracking
        - Individual sheet counting
        - Standalone item management
        - Categorization by product attributes

    - **Inventory Adjustments**:
        Users can modify inventory levels with:
        - Quantity modifications per specification
        - Multiple quantity entries per specification
        - Validation to prevent negative inventory
        - Reason logging for adjustments

    - **Inventory View**:
        The system presents inventory information through:
        - Hierarchical tree structure
        - Product-based grouping
        - Attribute-based organization
        - Searchable product listings

3. **Inventory Operations Log**

    The logging system provides comprehensive tracking of inventory changes:

    - **Operation Recording**:
        Each inventory operation is logged with:
        - Timestamp
        - Product and specification details
        - Operation type (ADD/REMOVE/UPDATE)
        - Quantity changes
        - Associated reason

    - **Log Viewing**:
        The log view offers:
        - Chronological display of operations
        - Filtering by date range
        - Detailed operation information
        - Operation categorization

### **Non-Functional Requirements**

1. **Usability**:
    The interface prioritizes user efficiency through:
    - Clean, hierarchical data presentation
    - Intuitive navigation between views
    - Consistent form layouts
    - Responsive user interface

2. **Performance**:
    The application maintains responsiveness through:
    - Efficient database queries
    - Optimized data loading
    - Background processing where appropriate
    - Connection pooling

3. **Data Storage**:
    The system ensures reliable data management using:
    - MariaDB for robust data storage
    - Transaction management
    - Data integrity constraints
    - Proper indexing

4. **Localization**:
    The application provides full Bulgarian language support:
    - UI elements in Bulgarian
    - Error messages in Bulgarian
    - Date and number formatting
    - Language resource management

5. **Data Integrity**:
    The system maintains data accuracy through:
    - Input validation
    - Constraint checking
    - Transaction management
    - Error handling

6. **Architecture**:
    The application implements a robust architecture using:
    - Spring Boot framework
    - Service-oriented design
    - DTO pattern
    - Repository pattern

7. **Extensibility**:
    The system is designed for future enhancement:
    - Modular architecture
    - Separation of concerns
    - Interface-based design
    - Configurable components