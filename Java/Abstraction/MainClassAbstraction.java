//we create objects of both Circle and Rectangle
/*Despite Shape being abstract, we can still use its concrete method setColor() in both subclasses. 
The abstract method area() is implemented in each subclass,
providing specific behavior for calculating the area of the circle and rectangle.*/


public class MainClassAbstraction{
    public static void main(String[] args){
      
        Circle circle = new Circle(5.0);
        circle.setColor("Red");
        System.out.println("Circle Area: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        rectangle.setColor("Blue");
        System.out.println("Rectangle Area: " + rectangle.area());
        
        
    }
}