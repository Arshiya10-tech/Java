public class EncapsulationExample{
    private String name;
    private int age;
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age){
        this.age = age;
    }
    
    public static void main(String[] args){
        EncapsulationExample  obj = new EncapsulationExample();
        obj.setName("Arshiya");
        obj.setAge(24);
        
        System.out.println("Get Name : " + obj.getName());
        System.out.println("Get Age : " + obj.getAge());
        
    }
    
    
}