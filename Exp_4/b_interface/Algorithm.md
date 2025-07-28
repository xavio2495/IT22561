1.  Define the `Shape` interface with a single abstract method named `draw()`.
2.  Define the `Circle` class, which implements the `Shape` interface, and include a constructor that sets its `radius`.
3.  Implement the `draw()` method in the `Circle` class to print a message about drawing a circle with its specific radius.
4.  Define the `Rectangle` class, which implements the `Shape` interface, and include a constructor that sets its `length` and `width`.
5.  Implement the `draw()` method in the `Rectangle` class to print a message about drawing a rectangle with its specific length and width.
6.  In the `Main` class's `main` method, print an introductory message about demonstrating interfaces.
7.  Create an instance of `Circle` with a radius of 10.0 and assign it to `myCircle`.
8.  Create an instance of `Rectangle` with a length of 5.0 and a width of 8.0 and assign it to `myRectangle`.
9.  Declare a `Shape` type variable `shape1` and assign `myCircle` to it.
10. Print "Using shape1 (a Circle): " and then call `shape1.draw()`.
11. Declare a `Shape` type variable `shape2` and assign `myRectangle` to it.
12. Print "Using shape2 (a Rectangle): " and then call `shape2.draw()`.
13. Print "Directly calling draw() on objects:".
14. Call `myCircle.draw()` and `myRectangle.draw()`.