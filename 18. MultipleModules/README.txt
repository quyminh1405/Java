- This is a 2-module-exercise.
+ The first module is bookingsystem, which contains 2 classes, Hairdresser and Scheduler (each has its own package)
+ The second module is customer, contains Customer class (this is the client side)

- We cannot be in the second module (customer) and calls objects and methods of the other module. We need to create a module-info.java
inside the bookingsystem module and exports the package that the client side will use (which is scheduling, contains Scheduler class).

- Now the Customer can use the Scheduler class.

- We don't 'exports' the employees package because we don't want the client side to know about the Hairdresser class.