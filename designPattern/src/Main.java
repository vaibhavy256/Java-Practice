public class Main {
    public static void main(String[] args) {

        Employee employee=EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee);
        int salary= employee.salary();
        System.out.println("Salary"+salary);

        Employee employee2=EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee);
        int salary2= employee2.salary();
        System.out.println("Salary"+salary2);

    }
}