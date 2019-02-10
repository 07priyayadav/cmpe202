

I have achieved Code Maintainability and variability by implementing Polymorphism with inheritance.


Parent class - Abstract class —>   GumballMachine

(Reason behind using abstract class  is “ If we are using Inheritance for the difference it’s best to use the abstract class with implicit method overriding”.
Again Abstract class is partial class so no-one can instantiate it).

Child Classes :

1. GMAcceptsQuarter.  —> Gumball machine who accepts a Quarter.

2. GM50centsAccepts2Q. —>  Gumball machine who accepts 2 Quarter.

3.GMAcceptsAllCoinsTo50Cents.  —> Gumball machine who accepts all coins to get 50 cents.


Child methods are getting called through the reference of super class.


