package accessModifier;

public class Employee {
//defult access modifier package protected(within package only)
    // public (any class)
    // private (within class only)
    //protected (child only)
public String email = "abc@gmail.com";
}
public class TestOne {
    public int age = 23;
}

   public class Main{
    public static void main(String[] args) {
        Employee employee = new Employee();
        TestOne testOne = new TestOne();
        System.out.println("Email = "+employee.email);
        System.out.println("Age = "+testOne.age);
    }
}
