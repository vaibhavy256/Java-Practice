import java.util.ArrayList;
import java.util.List;

public class ComparableDemo {
    public static void main(String[] args) {
        List<Student>studentList=new ArrayList<>();
        studentList.add(new Student("vaibhav",7.8));
        studentList.add(new Student("vaibhefwefav",7.2));
        studentList.add(new Student("vaibhghgav",8.9));
        studentList.add(new Student("vaibhav",6.8));
        studentList.sort(null);
        System.out.println(studentList);
    }
}

class Student implements Comparable<Student>{
    public String name;
    public double gpa;

    public String getName() {
        return name;
    }

    public double getGpa() {
        return gpa;
    }

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        return Double.compare(this.getGpa(),o.getGpa());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", gpa=" + gpa +
                '}';
    }
}
