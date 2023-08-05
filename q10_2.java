import java.util.*;

public class q10_2 {

    public static void main(String[] args) {
        // Create a list of employees
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aayush", 20));
        employees.add(new Employee("BabaAayush", 28));

        // Create a comparator to sort employees by age
        Comparator<Employee> ageComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getAge() - e2.getAge();
            }
        };

        // Sort the employees by age
        Collections.sort(employees, ageComparator);

        // Print the employees
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}

class Employee {

    private String name;
    private int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
