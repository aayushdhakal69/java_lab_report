import java.util.*;

class Area {
    int length, breadth;

    Area(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    void returnArea() {
        int result = length * breadth;
        System.out.println("The area is: " + result);
    }
}

public class q2 {
    public static void main(String[] args) {
        int l, b;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        l = sc.nextInt();
        System.out.print("Enter breadth: ");
        b = sc.nextInt();
        Area a = new Area(l, b);
        a.returnArea();
    }
}