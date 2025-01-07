import java.util.HashMap;
import java.util.Objects;

public class HashCodeAndEqualsMethodJava {
    public static void main(String[] args) {
        HashMap<Person,String>map=new HashMap<>();
        Person p1=new Person(1,"vaibhav");
        Person p2=new Person(2,"Yeotikar");
        Person p3=new Person(1,"vaibhav");
        map.put(p1,"Engineer");
        map.put(p2,"Tester");
        map.put(p3,"Manager");

        System.out.println("value for p1 "+map.get(p1));
        System.out.println("value for p3 "+map.get(p3));
    }
}

class Person{
    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return id == person.id && Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
