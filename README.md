# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

C.	Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.

> 1. mainscreen.html, line 14: changed title to "American PC Distributors"
> 2. mainscreen.html, line 19: changed header to "American PC Distributors"
> 3. demo.css, line 1-3: added code to change background color
> 4. mainscreen.html, line 13: added reference to demo.css stylesheet

D.	Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

> 1. mainscreen.html, line 22 added button that links to about page
> 2. about.html, Created about.html page, lines 1 - 36, implemented code to display the about page
> 3. AboutController.java, Created AboutController.java file, lines 8 - 15, implemented code to direct to the about.html page

E.	Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

> Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.
> 1. BootStrapData.java, lines 42- 83, I added logic that checks if the part list is empty and if so it adds 5 parts
> 2. BootStrapData.java, lines 106 - 122, Added logic that checks if the product list is empty and if so it add 5 products

F.	Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:

- The “Buy Now” button must be next to the buttons that update and delete products.
- The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
- Display a message that indicates the success or failure of a purchase.

> 1. mainscreen.html, line 86, added buy now button
> 2. BuyProductController.java, Created BuyProductController.java file, lines 18-34, Implemented logic to decrease product inventory by 1 on purchase
> 3. ConfirmPurchase.html, created ConfirmPurchase.html file, lines 1-17, implemented code to display the confirm page
> 4. ProductDeleteError.html, Created ProductDeleteError.html file, lines 1-17, implemented code to display the error message when deleted items that have 0 inventory

G.	Modify the parts to track maximum and minimum inventory by doing the following:

- Add additional fields to the part entity for maximum and minimum inventory.
- Modify the sample inventory to include the maximum and minimum fields.
- Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
- Rename the file the persistent storage is saved to.
- Modify the code to enforce that the inventory is between or at the minimum and maximum value.

> 1. Part.java, line 32-35, added fields for min and max inventory values
> 2. Part.java, line 58-65, added constructor with new min and max fields
> 3. Part.java, line 67-78, created getter and setter methods for max and min inventory
> 4. InhousePartForm.html, line 23-26, added input fields for max and min inventory
> 5. OutsourcedPartForm.html, line 24-27, added input fields for max and min inventory
> 6. mainscreen.html, line 41-42, added min and max inventory fields to show on table
> 7. mainscreen.html, line 51-52, added code for min and max values to show in cells
> 8. Part.java, line 119-126, implemented a method to determine if the part inventory is within the max and min range
> 9. AddInhousePartController.java, line 42-45, added logic to check if part is invalid due to incorrect inventory range
> 10. invalidinventory.html, created invalidinventory.html page, lines 1-17 created code for error page
> 11. AddOutsourcedPartController.java, line 45-46, added logic to check if part is invalid due to incorrect inventory range
> 12. application.properties, line 6, updated code to point to new database name AmericanPCdata

H.	Add validation for between or at the maximum and minimum fields. The validation must include the following:

- Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
- Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
- Display error messages when adding and updating parts if the inventory is greater than the maximum.

I.	Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

J.	Remove the class files for any unused validators in order to clean your code.