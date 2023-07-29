public class MainClassInheritance{
    public static void main(String[] args){
        Car mycar = new Car();
        Cycle myCycle = new Cycle();
        
        mycar.model = "Audi 5";
        mycar.colour = "Royal Blue";
        System.out.println("Car model output :" + mycar.model);
        System.out.println("Car colour output :" + mycar.colour);
        mycar.start();
        mycar.speed();
        mycar.stop();
        
        
        
        myCycle.model = "Being Human";
        myCycle.colour = "Red";
        System.out.println("Cycle model output :" + myCycle.model);
        System.out.println("Cycle colour output :" + myCycle.colour);
        myCycle.start();
        myCycle.price();
        myCycle.stop();
        
       
        
    }
}