import java.awt.*;
import javax.swing.*;

public class q11 extends JFrame {
    q11() {
        setSize(400, 400);
        setTitle("Border and Flow Layout");
        setVisible(true);

        // Button button1 = new Button("Button 1");
        // Button button2 = new Button("Button 2");
        // Button button3 = new Button("Button 3");
        // setLayout(new FlowLayout());
        // add(button1);
        // add(button2);
        // add(button3);

        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        setLayout(new BorderLayout());
        add(button4, BorderLayout.EAST);
        add(button5, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        q11 obj = new q11();
    }
}