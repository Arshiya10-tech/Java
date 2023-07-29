public class MethodOverloading{
    
    
    public int Add(int a, int b, int c){
        return a + b + c;
    }
    
    public int Add(int a , int b){
        return a + b;
    }
    
    public double Add(double a, double b){
        return a + b;
    }
    
    
    public static void main(String[] args){
        MethodOverloading Obj = new MethodOverloading();
        
        
        System.out.println("Add Method by int data type with 3 parameter: "+ Obj.Add(5,5,5));
        System.out.println("Add Method by same data type but Different parameter: "+ Obj.Add(5,5));
        System.out.println("Add Method by different data type : "+ Obj.Add(3.3,3.3));
    }
}