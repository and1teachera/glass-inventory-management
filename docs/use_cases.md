### Use Case: Add New Glass Product

**Use Case Description**: Create a new glass product entry in the system with multiple specifications, dimensions, and quantities.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Manager

**Stakeholders and Interests**:
- Warehouse Manager: Needs to accurately record new products and their specifications
- Inventory Staff: Requires clear product information for stock management
- System Administrator: Ensures data integrity and system performance
- Management: Requires accurate inventory records for business decisions

**Preconditions**:
- User is authenticated in the system
- Product information is available (name, specifications, dimensions)
- Required measurement units and specifications are known

**Postconditions**:
- New product is saved in the database
- Initial inventory quantities are recorded
- Product is available for inventory management
- System log records the addition

**Main Success Scenario**:
1. User selects "Add Product" from the main menu
2. System presents the product entry form
3. User enters product name and optional description
4. User adds attribute section (defaults to thickness)
5. User specifies attribute value (e.g., "4 MM" for thickness)
6. User enters dimension information (e.g., "3210/2250")
7. User specifies quantities:
   - Number of packs
   - Sheets per pack
   - Standalone items
8. User adds additional dimensions as needed
9. User adds additional attribute sections as needed
10. System validates all entries
11. System saves the product and its specifications
12. System confirms successful creation

**Extensions/Alternative Scenarios**:
1. Duplicate Product Name:
   - System detects duplicate name
   - Displays error message in Bulgarian
   - Returns to step 3
2. Invalid Quantities:
   - System detects negative or invalid numbers
   - Highlights erroneous fields
   - User corrects values
3. Cancellation:
   - User can cancel at any point
   - System discards unsaved changes
4. Validation Failures:
   - System displays specific error messages
   - Maintains entered data
   - Allows correction

**Special Requirements**:
- Form must support dynamic addition of sections
- All text in Bulgarian language
- Response time under 2 seconds for validation
- Support for decimal thickness values

**Data Variations List**:
- Product name: Text (max 50 characters)
- Description: Optional text (max 200 characters)
- Thickness: Numeric with unit (MM)
- Dimensions: Width/Height format
- Quantities: Positive integers only

**Trigger**:
User selects "Add Product" option from main menu

**Actors**:
- Primary: Warehouse Manager
- Secondary: System Database
- Supporting: Validation System

**Goals**:
- Create accurate product records
- Establish initial inventory levels
- Enable immediate inventory management
- Maintain data integrity

**Failed Endings**:
- Database connection failure
- Validation errors not resolved
- User cancellation
- System timeout

**Miscellaneous**:
- Future enhancement: Support for bulk product import
- Consider adding product templates
- Potential for barcode integration
- Possible automation of dimension entry through data import

### Use Case: Adjust Inventory Levels

**Use Case Description**: Modify inventory quantities for existing product specifications while maintaining accurate stock records.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Manager

**Stakeholders and Interests**:
- Warehouse Manager: Needs to accurately adjust stock levels
- Sales Department: Requires accurate inventory information for sales operations
- Management: Needs reliable stock reporting
- Accounting: Requires accurate inventory valuations
- System: Must maintain data integrity and transaction history

**Preconditions**:
- Product specification exists in the system
- User has access to inventory management functions
- Current inventory levels are available

**Postconditions**:
- Inventory levels are updated accurately
- System log records the adjustment with reason
- All views reflect updated quantities
- No negative inventory conditions exist

**Main Success Scenario**:
1. User locates specific product specification in hierarchical view
2. User selects specification for adjustment
3. System displays current inventory details
4. User enters adjustment reason
5. User modifies quantities:
   - Updates number of packs
   - Adjusts items per pack
   - Changes standalone items count
6. System validates new quantities
7. System records the adjustment
8. System updates inventory log
9. System confirms successful adjustment

**Extensions/Alternative Scenarios**:
1. Negative Inventory Prevention:
   - System detects potential negative result
   - Displays warning message
   - Prevents adjustment completion
2. Multiple Quantity Adjustments:
   - User adjusts multiple specification quantities
   - System validates each adjustment
   - Processes all changes as single transaction
3. Validation Failures:
   - System highlights invalid entries
   - Maintains current quantities
   - Allows correction

**Special Requirements**:
- Real-time validation
- Transaction logging
- Bulgarian language interface
- Sub-second response time

**Data Variations List**:
- Pack quantities: Positive integers
- Items per pack: Positive integers
- Standalone items: Non-negative integers
- Adjustment reason: Required text
- Operation type: Add/Remove/Update

**Trigger**:
- User initiates inventory adjustment
- Scheduled inventory reconciliation

**Actors**:
- Primary: Warehouse Manager
- Secondary: Inventory System
- Supporting: Logging System

**Goals**:
- Maintain accurate inventory records
- Track inventory changes
- Prevent invalid adjustments
- Document adjustment reasons

**Failed Endings**:
- Validation failures
- System connectivity issues
- Concurrent update conflicts
- User abandons adjustment

**Miscellaneous**:
- Future enhancement: Batch adjustments
- Integration with barcode scanners
- Automated adjustment notifications
- Historical trend analysis

### Use Case: Search and Browse Products

**Use Case Description**: Locate and view products using search criteria and hierarchical navigation.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Staff

**Stakeholders and Interests**:
- Warehouse Staff: Needs quick access to product information
- Sales Team: Requires product availability information
- Management: Needs inventory overview
- System: Must maintain responsive search functionality

**Preconditions**:
- Products exist in the system
- Search indexes are maintained
- User has access to product view

**Postconditions**:
- Relevant products are displayed
- Hierarchical view reflects search results
- System maintains search performance

**Main Success Scenario**:
1. User accesses product view
2. User enters search criteria
3. System filters product tree
4. System displays matching products with:
   - Product specifications
   - Current quantities
   - Hierarchical organization
5. User navigates filtered results
6. User can expand/collapse sections
7. User selects specific product for details

**Extensions/Alternative Scenarios**:
1. No Results Found:
   - System displays "No matches" message
   - Offers search suggestions
   - Allows search criteria modification
2. Partial Matches:
   - System displays partial matches
   - Highlights matching criteria
   - Suggests related products
3. Search Reset:
   - User clears search
   - System restores full product list
   - Maintains previous view state

**Special Requirements**:
- Sub-second search response
- Dynamic tree updates
- Memory-efficient operation
- Bulgarian language interface

**Data Variations List**:
- Product name: Text search
- Thickness values: Numeric search
- Glass type: Pattern matching
- Dimensions: Numeric ranges

**Trigger**:
- User enters search term
- User requests product information

**Actors**:
- Primary: Warehouse Staff
- Secondary: Search System
- Supporting: Data Access Layer

**Goals**:
- Quick product location
- Accurate search results
- Efficient navigation
- Responsive user interface

**Failed Endings**:
- Search timeout
- Invalid search criteria
- System performance issues
- Data access errors

**Miscellaneous**:
- Future: Advanced search filters
- Product categorization improvements
- Search history tracking
- Performance optimization

### Use Case: Monitor Inventory Operations Log

**Use Case Description**: View, filter, and analyze the history of inventory operations and changes.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Manager

**Stakeholders and Interests**:
- Warehouse Manager: Needs to track inventory changes and audit operations
- Management: Requires oversight of inventory movements
- Auditors: Need access to historical operations
- System Administrator: Must ensure log integrity and performance
- Accounting: Requires transaction history for reconciliation

**Preconditions**:
- User has appropriate access permissions
- System has recorded operations
- Log data is available and accessible

**Postconditions**:
- Operation history is displayed accurately
- Filtered results reflect search criteria
- Log data remains unmodified
- Any exported data is complete and accurate

**Main Success Scenario**:
1. User navigates to Operations Log view
2. System displays chronological list of operations
3. User selects date range for filtering
4. System presents filtered operations showing:
   - Operation timestamp
   - Product information
   - specification details
   - Quantity changes
   - Operation type
   - Reason for change
5. User reviews operation details
6. User can apply additional filters
7. System maintains responsive display
8. User locates specific operations of interest

**Extensions/Alternative Scenarios**:
1. Date Range Selection:
   - User specifies custom date range
   - System validates range
   - Updates display accordingly
2. No Operations Found:
   - System shows empty result message
   - Suggests broadening search criteria
   - Maintains current filter settings
3. Filter Combinations:
   - User applies multiple filters
   - System combines filter criteria
   - Updates results dynamically

**Special Requirements**:
- Fast log retrieval
- Efficient date filtering
- Bulgarian language interface
- Sortable columns
- Maintained log integrity

**Data Variations List**:
- Date ranges: Past to present
- Operation types: Add/Remove/Update
- Product specifications: All recorded types
- Quantity changes: Positive and negative
- Reasons: Text descriptions

**Trigger**:
- User requests operation history
- Audit requirements
- Reconciliation needs

**Actors**:
- Primary: Warehouse Manager
- Secondary: Log System
- Supporting: Filtering System

**Goals**:
- Track inventory changes
- Identify operation patterns
- Support audit requirements
- Enable operation analysis

**Failed Endings**:
- Log data unavailable
- Filter application failure
- Performance degradation
- Access permission issues

**Miscellaneous**:
- Future: Advanced analytics capabilities
- Export functionality enhancement
- Real-time log updates
- Performance optimization for large datasets

### Use Case: Delete Product

**Use Case Description**: Remove a product and its specifications from the system while maintaining data integrity.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Manager

**Stakeholders and Interests**:
- Warehouse Manager: Needs to remove obsolete products
- System Administrator: Must ensure data integrity
- Management: Requires accurate inventory records
- Auditors: Need operation traceability

**Preconditions**:
- Product exists in system
- User has deletion permissions
- No pending operations for product

**Postconditions**:
- Product and specifications removed
- Operation logs maintained
- Related records properly handled
- System integrity preserved

**Main Success Scenario**:
1. User locates product in hierarchical view
2. User initiates deletion process
3. System displays confirmation dialog with:
   - Product details
   - Associated specifications
   - Current inventory levels
4. User confirms deletion
5. System performs deletion:
   - Removes product record
   - Deletes specifications
   - Updates inventory records
   - Maintains operation history
6. System confirms successful deletion
7. View updates to reflect changes

**Extensions/Alternative Scenarios**:
1. Deletion Confirmation:
   - User must explicitly confirm
   - System shows impact summary
   - Option to cancel available
2. Related Records:
   - System identifies dependencies
   - Handles related records appropriately
   - Maintains referential integrity
3. Concurrent Access:
   - System handles simultaneous users
   - Prevents conflicting operations
   - Maintains data consistency

**Special Requirements**:
- Transaction integrity
- Operation logging
- Performance optimization
- User confirmation requirements

**Data Variations List**:
- Product types
- specification combinations
- Inventory quantities
- Historical records

**Trigger**:
- User initiates product deletion
- Product obsolescence
- Data cleanup requirements

**Actors**:
- Primary: Warehouse Manager
- Secondary: Database System
- Supporting: Logging System

**Goals**:
- Remove obsolete products
- Maintain data integrity
- Preserve operation history
- Update system state

**Failed Endings**:
- Deletion constraint violations
- Transaction failures
- System errors
- User cancellation

**Miscellaneous**:
- Future: Batch deletion capabilities
- Product archiving options
- Enhanced dependency handling
- Automated cleanup processes

### Use Case: Edit Existing Product

**Use Case Description**: Modify an existing product's information, specifications, and quantities while maintaining data integrity and operation history.

**Scope**: Glass Inventory Management System

**Level**: User Goal

**Primary Actor**: Warehouse Manager

**Stakeholders and Interests**:
- Warehouse Manager: Needs to modify product details and structures accurately
- Quality Control: Requires accurate specification updates
- Sales Team: Needs current product information
- Management: Requires accurate product catalog
- System: Must maintain data consistency and operation history

**Preconditions**:
- Product exists in the system
- User has edit permissions
- Product is not being edited by another user
- Current product data is accessible

**Postconditions**:
- Product information is updated correctly
- specification structure maintains integrity
- Quantity records remain accurate
- System logs modification history
- All views reflect current product state
- Related data remains consistent

**Main Success Scenario**:
1. User selects product from hierarchical view
2. System loads complete product information
3. System displays product entry form with current data
4. User modifies basic product information:
   - Updates product name if needed
   - Adjusts product description
5. User modifies specification sections:
   - Updates existing specifications
   - Adds new specifications as needed
   - Removes obsolete specifications
6. For each specification, user can modify:
   - Attribute values (thickness, type)
   - Glassmaker information
   - Dimension specifications
   - Quantity configurations
7. System performs ongoing validation
8. User reviews all changes
9. User submits modifications
10. System validates complete product structure
11. System saves all changes
12. System logs modification details
13. System confirms successful update

**Extensions/Alternative Scenarios**:
1. Name Change Validation:
   - System checks for duplicate names
   - Warns if name exists
   - Allows user to provide different name
2. specification Removal:
   - System checks for related data
   - Warns about impact
   - Preserves historical records
3. Quantity Modifications:
   - System validates new quantities
   - Prevents negative inventory
   - Updates related records
4. Concurrent Edit Detection:
   - System detects simultaneous edits
   - Prevents conflicting changes
   - Notifies users

**Special Requirements**:
- Form maintains state during editing
- Real-time validation
- Data consistency checks
- Change tracking
- Bulgarian language interface

**Data Variations List**:
- Product attributes
- specification configurations
- Dimension specifications
- Quantity records
- Historical data

**Trigger**:
- Product specification changes
- Error corrections
- Structure reorganization
- Business requirement changes

**Actors**:
- Primary: Warehouse Manager
- Secondary: Product Management System
- Supporting: Validation and Logging Systems

**Goals**:
- Maintain accurate product information
- Preserve data integrity
- Track modification history
- Enable flexible product updates
- Ensure system consistency

**Failed Endings**:
- Validation failures
- Concurrent edit conflicts
- System constraints violations
- User cancellation
- Data consistency errors

**Miscellaneous**:
- Future: Change preview capability
- Modification templates
- Bulk update features
- Enhanced validation rules
- Improved change tracking
