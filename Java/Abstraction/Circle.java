// Concrete subclass implementing the abstract class
//allow different classes (Circle, Rectangle, etc.) to provide their own implementations. 
/*Despite Shape being abstract, we can still use its concrete method setColor() in both subclasses. 
The abstract method area() is implemented in each subclass,
providing specific behavior for calculating the area of the circle and rectangle.*/

public class Circle extends Shape{
   
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }
    
    // Implementing the abstract method
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}