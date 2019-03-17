For the LAB6, I have implemented Strategy Pattern to achieve the desired output.

Five guys Receipt and Packing Slip have different order of printing for the toppings selected. 
Receipt gets printed in request order. Packing receipt have toppings in the order how burger gets assembled. 
Here for both receipt and packing slip, task is to print the toppings selected but they have different way of printing it. So basically, here we have 2 algorithms to print. Its where Strategy pattern comes in picture. 
Strategy Pattern encapsulates each algorithm from one another and make them interchangeable. Strategy pattern provide a way to configure a class with one of many behaviors. 
1.	Code have PrintReceiptStratergy interface with printReceipt method. 
2.	Two classes with different printing behavior – PrintPackageSlip and 			PrintPaperReceipt are implementing the PrintReceiptStratergy interface.
3.	Order class is working as context in this scenario.
4.	Client is calling the printReceipt method and respective classes are getting 		invoked based on strategy called.


Output: 

***** Printing Paper Receipt *****

**********************************


       FIVE GUYS
    BURGERS AND FRIES
     STORE # CA-1294
   5353 ALMADEN EXPY N60
    SAN JOSE, CA 95118
    (P) 408-264-9300


    12/1/2016 1:46:54 PM
       FIVE GUYS


      Order Number: 45
1   LLB                  $5.59
      {{{BACON}}}
      LETTUCE
      TOMATO
      ->|G ONION
      ->|JALA GRILLED
1   LLT CAG              $2.79

Sub. Total:		 $8.38
Tax:			 $0.75
Total:			 $9.13
Register 1:  Tran Seq No:57845 
Cashier: Sakda* S.
**********************************


***** Printing Package Slip ******

**********************************


Order Number: 45
    12/1/2016  1:46:54 PM

	FIVE GUYS

Sandwich# 1
1   LLB
        LETTUCE
        TOMATO
        ->|G ONION
        ->|JALA GRILLED
        {{{BACON}}}
1   LLT CAG
Register 1:  Tran Seq No:57845 
Cashier: Sakda* S.
**********************************
