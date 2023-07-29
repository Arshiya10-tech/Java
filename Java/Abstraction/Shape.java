//abstract class
// define a common interface as Shape
/*Despite Shape being abstract, we can still use its concrete method setColor() in both subclasses. 
The abstract method area() is implemented in each subclass,
providing specific behavior for calculating the area of the circle and rectangle.*/

public abstract class Shape{
   
   protected String color;
   
  // Abstract method (no implementation)
    abstract double area();
    
    // Concrete method
    void setColor(String color) {
        this.color = color;
    }
}