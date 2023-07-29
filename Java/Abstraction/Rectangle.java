// Concrete subclass implementing the abstract class
//allow different classes (Circle, Rectangle, etc.) to provide their own implementations. 
/*Despite Shape being abstract, we can still use its concrete method setColor() in both subclasses. 
The abstract method area() is implemented in each subclass,
providing specific behavior for calculating the area of the circle and rectangle.*/

public class Rectangle extends Shape{
   
    private double length;
    private double width;
    
    
    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    
    // Implementing the abstract method
    @Override
    double area() {
        return length * width;
    }
}