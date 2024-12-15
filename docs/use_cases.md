### Use Case: Add New Glass Product
**Primary Actor**: Warehouse Manager
**Precondition**: User has necessary product information
**Main Flow**:
1. User navigates to product entry form
2. User enters product name and optional description
3. System presents dynamic form for product variations
4. User adds attribute sections (thickness or glass type)
5. For each section, user:
   - Specifies attribute value (e.g., thickness measurement)
   - Optionally adds glassmaker and type
   - Adds dimensions with corresponding quantities
   - Can add multiple quantity entries per dimension
6. System validates all entries
7. System saves product with all variations
**Alternative Flows**:
- Validation failures prompt user correction
- User can cancel at any point
- Duplicate product names are prevented

### Use Case: Edit Existing Product
**Primary Actor**: Warehouse Manager
**Precondition**: Product exists in system
**Main Flow**:
1. User selects product from hierarchical view
2. System loads product with all variations
3. User modifies desired attributes:
   - Basic product information
   - Variation attributes
   - Dimensions
   - Quantities
4. System validates changes
5. System updates all modified elements
**Alternative Flows**:
- Changes can be discarded
- Partial updates are supported
- System prevents invalid modifications

## Inventory Management Use Cases

### Use Case: Adjust Inventory Levels
**Primary Actor**: Warehouse Manager
**Precondition**: Product variation exists
**Main Flow**:
1. User selects specific product variation
2. System displays current inventory levels
3. User can:
   - Modify pack quantities
   - Adjust items per pack
   - Update standalone items
4. User provides reason for adjustment
5. System validates to prevent negative inventory
6. System records change in log
**Alternative Flows**:
- Multiple quantity adjustments in single operation
- Validation failures prevent invalid states
- Changes can be cancelled

### Use Case: Search and Filter Products
**Primary Actor**: Warehouse Manager
**Precondition**: Products exist in system
**Main Flow**:
1. User enters search term
2. System filters hierarchical view
3. Results show:
   - Matching products
   - Related variations
   - Current quantities
4. User can interact with filtered results
**Alternative Flows**:
- No results handling
- Clear search option
- Advanced filtering options

## Inventory Tracking Use Cases

### Use Case: View Inventory Operations Log
**Primary Actor**: Warehouse Manager
**Precondition**: Operations have been performed
**Main Flow**:
1. User accesses log view
2. System displays chronological operations
3. User can:
   - Filter by date range
   - View operation details
   - See affected products
   - Track quantity changes
**Alternative Flows**:
- Export log data
- Filter by operation type
- Sort by different criteria

### Use Case: Monitor Product Quantities
**Primary Actor**: Warehouse Manager
**Precondition**: Products exist with quantities
**Main Flow**:
1. User views product tree structure
2. System displays:
   - Hierarchical organization
   - Aggregated quantities
   - Individual variation details
3. User can expand/collapse sections
**Alternative Flows**:
- Quick quantity adjustments
- Detail view access
- Refresh functionality

## Administrative Use Cases

### Use Case: Delete Product
**Primary Actor**: Warehouse Manager
**Precondition**: Product exists
**Main Flow**:
1. User selects product for deletion
2. System requests confirmation
3. System checks for dependencies
4. System:
   - Removes product record
   - Deletes variations
   - Maintains operation history
**Alternative Flows**:
- Cancellation option
- Partial deletion handling
- Error recovery
