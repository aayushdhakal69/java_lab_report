// Create a class name 'shape' with method to print "this is shape". Then create 
// two other classes named 'Rectangle', 'circle' inheriting the shape class, both
// having a method to print "this is rectangular shape "and "this is circular 
// shape" respectively. Create a sub class 'square' of rectangle having a 
// method to print "square is a rectangle". Now call the method of 'shape' and 
// 'rectangle 'class by the object of 'square' class.

class Shape {
    void display() {
        System.out.println("This is Shape");
    }
}

class Rectangle extends Shape {
    void display1() {
        System.out.println("This is rectangular shape");
    }
}

class Circle extends Shape {
    void display2() {
        System.out.println("This is circular shape");
    }
}

class Square extends Rectangle {
    void display3() {
        System.out.println("square is a rectangle");
    }
}

public class q3 {
    public static void main(String[] args) {
        Square s = new Square();
        s.display();
        s.display1();
    }
}