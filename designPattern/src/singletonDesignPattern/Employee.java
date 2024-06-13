package singletonDesignPattern;

public class Employee {
    private static Employee employee;
    public Employee() {
    }

    public static Employee getEmployee() {
        synchronized (Employee.class){
            if (employee == null) {
                employee=new Employee();
            }
        }

        return employee;
    }
}


/*
*       1. constructor private
*
*       2.object create with help of method.
*
*       3.create field to store object is private.
*
*
*
*
*
 */