D287 – JAVA FRAMEWORKS
Welcome to Java Frameworks! This is an opportunity for students to implement user interfaces and learn to leverage existing frameworks, assets, and content for object-oriented programming. (Maven, JAVA)




# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS

Each note should include the prompt, file name, line number, and change.

1. C. mainscreen.html ; line 14 ;  Changed shop title;
2. C. mainscreen.html ; line 19 ;  hanged h1 to reflect shop name;
3. D. mainscreen.html ; line 20 ;  Added a button that takes user to about us page
4. D. aboutus.html ; lines 1-13 ;  Created a html page, added a header and a paragraph talking about us
5. D. AboutUsController.java ; Lines 1-15 ; created a java controller and mapped it to aboutus.html so the button would work, and a way back to main
6. E. BootStrapData.java ; lines 43-124; Added sample parts and products
7. F. mainscreen.html ; line 86-87 ; added buy now button.
8. F. BuyNowController ; lines 1-31 ; imported packages, created function that decrements stock my one when purchase is successful and returns success page, when inventory is zero, notifies customer.
9. F. purchaseconfirmation.html ; lines 1-13 ; Created html page that gets shown when purchase is successful.
10. F. outofstock.html; lines 1-13; Created html page that gets shown when product is out of stock.
11. G. Part.java ; line 32-35; added min max variables;
12. G. Part.java ; line 45 & 53; added min max variables to constructor argument list;
13. G. Part.java ; line 49,50 & 58,59; added min max variables to constructor and set their values; 
14. G. Part.java ; line 94- 109; added min max setters and getters;
15. G. InhousePartForm.html ; lines 23-27 ; added html input fields for min max for in house parts.Also added error catching 
16. G. OutsourcedPartForm.html ; lines 24-28 ; added html input fields for min max for outsourced parts.Also added error catching
17. G. BootStrapData.java ; lines 43-95; Modified sample parts 
18. G. InhousePartForm.html ; lines 31-35 ; added Validator error display div
19. G. OutsourcedPartForm.html ; lines 32-36 ; added Validator error display div
20. G. Part.java ; line 4 & 18; imported and added @ValidMinMax validator
21. G. AddInhousePartController.java ; lines 20 & 29 ; imported and added @ValidMinMax validator
22. G. AddOutsourcedPartController.java ; lines 21 & 29 ; imported and added @ValidMinMax validator
23. G. AddPartController.java ; lines 17 & 26 ; imported and added @ValidMinMax validator
24. G. productForm.html ; lines 38,39,62,63 ; added minimum and maximum inventory titles for available and associated parts for products
25. G. productForm.html ; lines 48,49,72,73 ; added minimum and maximum inventory values for available and associated parts for products
26. G. mainscreen.html ; lines 39,40 ; added minimum and maximum inventory columns for parts on main screen
27. G. mainscreen.html ; lines 49,50 ; added minimum and maximum inventory values for parts on main screen
28. G. ValidMinMax.java ; lines 1-8 ; created a java annotation class file, imported necessary connections;
29. G. ValidMinMax.java ; line 10; added a constraint and specified which class to use for validation logic
30. G. ValidMinMax.java ; line 11;  set it to annotate only class declarations
31. G. ValidMinMax.java ; line 12; set retention policy as RUNTIME
32. G. ValidMinMax.java ; lines 13-17;  Setup the error message that gets displayed when validation fails.
33. G. MinMaxValidator.lava ; lines 1-8 ; created a java annotation class file, imported necessary connections;
34. G. MinMaxValidator.lava ; lines 11-18 ; created MinMaxValidator class and initialized constraint validator class
35. G. MinMaxValidator.lava ; lines 20-32 ; created the validation logic that checks if min, max, inventory fall within guidelines.
36. H. MinMaxValidator.lava ; lines 39-42 ; created addErrorMessage method that removes the default message and displays a message based on validation
37. H. MinMaxValidator.lava ; lines 26-33 ; added inventory validations and creates custom error messages
38. H. EnufPartsValidator.java ; line 36 ; modify low inventory logic for products to trigger below min
39. H. ValidEnufParts.java ; line 20 ; modified what message said
40. I. PartTest.java ; lines 160 - 194; setup and tested 2 unit tests for max and min
41. J. Deleted DeletePartValidator.java because of no usage. uncommented BootStrapData for submission.
