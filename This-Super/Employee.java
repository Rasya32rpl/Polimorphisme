package superclass;

public class Employee extends Person {
    float salary = 4000f;
    String name = "Dian";
    int age = 23;
      
    public Employee(String a, int b, float c){
    
    }
    
    public void showInfo(){
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
}
