## Algorithm
1.  Define an interface `Shape` with a single abstract method `draw()`.
2.  Create a `Circle` class that implements the `Shape` interface and contains a `radius` attribute.
3.  Implement the `Circle` constructor to initialize its `radius`.
4.  Override the `draw()` method in `Circle` to print details specific to a circle.
5.  Create a `Rectangle` class that implements the `Shape` interface and contains `length` and `width` attributes.
6.  Implement the `Rectangle` constructor to initialize its `length` and `width`.
7.  Override the `draw()` method in `Rectangle` to print details specific to a rectangle.
8.  In the main program, create instances of `Circle` and `Rectangle` objects.
9.  Demonstrate polymorphism by assigning the `Circle` and `Rectangle` objects to `Shape` interface references and calling their `draw()` methods.
10. Call the `draw()` method directly on the original `Circle` and `Rectangle` objects to show consistent behavior.

## Output:
```
Demonstrating Interface Implementation (Shape, Circle, Rectangle):

Using shape1 (a Circle): Drawing a Circle with radius: 10.0
Using shape2 (a Rectangle): Drawing a Rectangle with length: 5.0 and width: 8.0

Directly calling draw() on objects:
Drawing a Circle with radius: 10.0
Drawing a Rectangle with length: 5.0 and width: 8.0
```