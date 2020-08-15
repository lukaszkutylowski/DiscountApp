# **DiscountApp**

This is an application which calculate discount for standard client and premium client.

## Used technologies:
* Java SE
* Java Beans
* Encapsulation
* Resuing methods
* JUnit 4
* OOP
* Maven

## Description

*Client* class is a data model class. It contains fields: firstName, lastName and clientPremium; constructor; getters and setters.

*Image shows Client which is Java Beans class*
![alt text](/.readmeimages/image1.jpg)

*DiscountService* class contains *calculateDiscountPrice* API method and some private methods.
*calculateDiscountPrice* method choose way to calculate discount: for standard client or premium client.
*calculateStandardDiscount* is executed when clientPremium variable is false, *calculatePremuimDiscount* when is true.
Discount is calculate when price is bigger than 1000. In this situation standard client get 10% discount, but in other situation 0%.
Premium client always get 5% discount, but when price is bigger than 1000 then discount is 15%.
*applyDiscount* is reused method for all ways to calculate discount.

*Image shows DiscountApp class which realized calculations*
![alt text](/.readmeimages/image2.jpg)

*PrintService* class API id *printSummary* method. This method use private methods to realized duties.
*printDiscount* private method shows summary about discount.

*Image shows PrintService class with API method*
![alt text](/.readmeimages/image3.jpg)

*printWelcome* it is a private method, which shows special welcome message according to client data.
If *client* object contains name and surname, prints message *Witaj /name/ /surname/*. When contains name only: *Witaj /name/*; surname only: *Dzień dobry Panie/Pani /surname/*.
In case when client object not contais name and surname, application shows *Witaj nieznajomy*.

*Image shows private methods which is used by API method of PrintService class*
![alt text](/.readmeimages/image4.jpg)

*Image shows example result of application execution
![alt text](/.readmeimages/image5.jpg)

