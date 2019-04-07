## LAB 8 - Input Mask Design Patterns

### Used Pattern: Decorator Pattern

#### In given problem scenario--> To set up a credit card on Mobile App, requirements are
1.	when user enters the credit card number, a space should get automatically added after each 4-digit blocks of entered number.
2.	Also, a "/" needs to get automatically added between two-digit month and year.

```Decorator pattern``` is a right choice to achieve these reuirements as decorator pattern extends the functionality of an object at runtime without affecting the behavior of an object. Decorator objects acts as a wrapper for the object to whom additional functionality is required.

In the solution Space decorator for Card number and Slash decorator for Expiry date have been implemented.
