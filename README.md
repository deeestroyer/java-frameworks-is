
# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

Each note should include the prompt, file name, line number, and change.

1. mainscreen.html ; line 14 ;  Changed shop title;
2. mainscreen.html ; line 19 ;  hanged h1 to reflect shop name;
3. mainscreen.html ; line 20 ;  Added a button that takes user to about us page
4. aboutus.html ; lines 1-13 ;  Created a html page, added a header and a paragraph talking about us
5. AboutUsController.java ; Lines 1-15 ; created a java controller and mapped it to aboutus.html so the button would work, and a way back to main
6. mainscreen.html ; line 86-87 ; added buy now button.
7. BuyNowController ; lines 1-31 ; imported packages, created function that decrements stock my one when purchase is successful and returns success page, when inventory is zero, notifies customer.
8. purchaseconfirmation.html ; lines 1-13 ; Created html page that gets shown when purchase is successful.
9. outofstock.html; lines 1-13; Created html page that gets shown when product is out of stock.
10. Part.java ; line 32-35; added min max variables;
11. Part.java ; line 45 & 53; added min max variables to constructor argument list;
12. Part.java ; line 49,50 & 58,59; added min max variables to constructor and set their values; 
13. Part.java ; line 94- 109; added min max setters and getters;
14. InhousePartForm.html ; lines 23-27 ; added html input fields for min max for in house parts.Also added error catching 
15. OutsourcedPartForm.html ; lines 24-28 ; added html input fields for min max for outsourced parts.Also added error catching
16. BootStrapData.java ; lines 43-95; Added and modified sample parts
17. BootStrapData.java ; lines 115-124; Added sample products
18. InhousePartForm.html ; lines 31-35 ; added Validator error display div
19. OutsourcedPartForm.html ; lines 32-36 ; added Validator error display div
20. Part.java ; line 4 & 18; imported and added @ValidMinMax validator
21. AddInhousePartController.java ; lines 20 & 29 ; imported and added @ValidMinMax validator
22. AddOutsourcedPartController.java ; lines 21 & 29 ; imported and added @ValidMinMax validator
23. AddPartController.java ; lines 17 & 26 ; imported and added @ValidMinMax validator
24. productForm.html ; lines 38,39,62,63 ; added minimum and maximum inventory titles for available and associated parts for products
25. productForm.html ; lines 48,49,72,73 ; added minimum and maximum inventory values for available and associated parts for products
26. mainscreen.html ; lines 39,40 ; added minimum and maximum inventory columns for parts on main screen
27. mainscreen.html ; lines 49,50 ; added minimum and maximum inventory values for parts on main screen
28. ValidMinMax.java ; lines 1-8 ; created a java annotation class file, imported necessary connections;
29. ValidMinMax.java ; line 10; added a constraint and specified which class to use for validation logic
30. ValidMinMax.java ; line 11;  set it to annotate only class declarations
31. ValidMinMax.java ; line 12; set retention policy as RUNTIME
32. ValidMinMax.java ; lines 13-17;  Setup the error message that gets displayed when validation fails.
33. MinMaxValidator.lava ; lines 1-8 ; created a java annotation class file, imported necessary connections;
34. MinMaxValidator.lava ; lines 11-18 ; created MinMaxValidator class and initialized constraint validator class
35. MinMaxValidator.lava ; lines 20-32 ; created the validation logic that checks if min, max, inventory fall within guidelines.
36. MinMaxValidator.lava ; lines 39-42 ; created addErrorMessage method that removes the default message and displays a message based on validation
37. MinMaxValidator.lava ; lines 26-33 ; added inventory validations and creates custom error messages
38. EnufPartsValidator.java ; line 36 ; modify low inventory logic for products to trigger below min
39. ValidEnufParts.java ; line 20 ; modified what message said
40. PartTest.java ; lines 160 - 194; setup and tested 2 unit tests for max and min