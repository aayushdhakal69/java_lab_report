import java.io.*;
import java.util.Scanner;

class q7 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        // FileReader r = new FileReader("/home/sai/hawa/./std.txt");
        FileWriter w = new FileWriter("C:\\Users\\there\\OneDrive\\Desktop\\demo.txt");
        System.out.println("Enter the no of student");
        int numOfStudents = sc.nextInt();
        sc.nextLine();

        int roll;
        String name, address, college;
        for (int i = 0; i < numOfStudents; i++) {
            System.out.printf("enter the roll no of Student %d: ", i + 1);
            roll = sc.nextInt();
            sc.nextLine();
            System.out.printf("enter the name no of Student %d: ", i + 1);
            name = sc.nextLine();
            System.out.printf("enter the address no of Student %d: ", i + 1);
            address = sc.nextLine().toLowerCase();
            System.out.printf("enter the college no of Student %d: ", i + 1);
            college = sc.nextLine();
            w.write("Roll No: " + roll + " Name: " + name + " Address: " + address + " College: " + college + "\n");

        }
        w.close();
        System.out.println("the data is written");
        BufferedReader reader;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\there\\OneDrive\\Desktop\\demo.txt"));
            String line = reader.readLine();

            while (line != null) {
                if (line.contains("Address: jhapa")) {
                    System.out.println(line);
                }
                // read next line
                line = reader.readLine();
            }

            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
