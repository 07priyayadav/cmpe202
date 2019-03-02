CRC model that manage the Wait list is implemented using two patterns - Observer and Chain of responsibility pattern.

1. Observer Pattern:

•  In CRC model TableManager is an Observer and Table is an observable. 
•  Here Table maintains its state (available or Occupied).
•  TableManager keeps track of tables which are in available state.
•  When table state changes, Table notifies the TableManager, so that TableManager can update respective state accordingly.

2. Chain Of Responsibility Pattern:
•  In CRC model, all the customers sign up themselves along with their party size to a waitlist. 
•  Here waitlist has the customers in order (according to the signup sequences). 
•  When TableManager notifies the WaitlistManager about availability of table, WaitlistManager starts sending messages to the customers in the sequence of waitlist order. It will also check, if the available table size is less than or equal to Customer in order first in the waitlist else it will skip to the next customer in the waitlist.
•  As WaitlistManager don’t know which customer will “Confirm” the table, it will send message to all Customers in sequence as per waitlist order. 
•  This process will continue until WaitlistManager gets Confirm message from the Customer.

