package singletonDesignPattern;

public class Example {
    public static void main(String args[]){
    Employee employee=Employee.getEmployee();
    System.out.println(employee.hashCode());
    Employee employee1=Employee.getEmployee();
    System.out.println(employee.hashCode());

    }
}
