Feature: To test the Retail application

Scenario Outline: Regsiter
Given To launch the application and navigate to url
When Enter "<username>" and "<email>" and  "<password1>" and "<password2>"
Then To click the submit button
And To close the browser and take screenshot
Examples:
|username|email|password1|password2|
|Divya|divyakrish568@gmail.com|Sruthi|Sruthi|

Scenario Outline: Login
Given To launch the application and navigate to url
When Enter "<username>" and "<password>" 
Then To click the submit button and shop button
And To close the browser and take screenshot in Login
Examples:
|username|password|
|Divya|Sruthi|

Scenario Outline: Shop
Given To launch the application and navigate to url
Then To click the shop button and category and women
And To close the browser and take screenshot in Shop
Examples:
|category|
|womenscollection|

Scenario Outline: Search
Given To launch the application and navigate to url
When To search shirt in search tab
Then To click the search button 
And To close the browser and take screenshot in Search
Examples:
|Search|
|shirt|

Scenario Outline: Select Product
Given To launch the application and navigate to url
Then To click the product 
And To close the browser and take screenshot in Select
Examples:
|Product|
|shirt|

Scenario Outline: Add to cart
Given To launch the application and navigate to url
Then To click the product to cart and view cart
And To close the browser and take screenshot in Addcart
Examples:
|Product to cart|View cart|
|shirt|shirt|

Scenario Outline: Cart
Given To launch the application and navigate to url
Then To click the proceed checkout
And To close the browser and take screenshot in Cart
Examples:
|View cart|Proceed|
|shirt|Billing|

Scenario Outline: Checkout
Given To launch the application and navigate to url
When To Enter <"Firstname"> and  <"Lastname"> and  <"Country"> and  <"Address"> and  <"City"> and  <"Postcode"> and  <"Phone"> and  <"Email">
Then To Click on Place the order 
And To close the browser and take screenshot in Checkout
Examples:
|Firstname|Lastname|Country|Address|City|Postcode|Phone|Email|
|divya|K|Uk|Sanyhill|Coimbatore|S1232376|8675656487|divya@gmail.com|

Scenario Outline: Wishlist
Given To launch the application and navigate to url
Then To add the product to wishlist
Then To click wishlist button
And To close the browser and take screenshot in Wishlist
Examples:
|Wishlist|
|shirt|

Scenario Outline: Contactus
Given To launch the application and navigate to url
When To Enter <"Name"> and  <"Email"> and  <"Subject"> and  <"Message"> 
Then To Click submit button
And To close the browser and take screenshot in contactus
Examples:
|Name|Email|Subject|Message|
|divya|divya@gamil.com|Product return|Productdamage|
