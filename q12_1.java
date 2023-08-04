class Person {
    void display(String name, int id) {
        System.out.println(name + " " + id);
    }

    void display(String name, int id, int salary) {
        System.out.println(name + " " + id + " " + salary);
    }
}

public class q12_1 {
    public static void main(String[] args) {
        Person p = new Person();
        p.display("Aayush", 1, 87000);
        p.display("Aayush", 1);
    }
}
