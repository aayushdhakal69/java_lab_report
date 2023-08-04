import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q8 extends JFrame implements MouseListener {

    private JLabel label;
    private JTextField textField;
    private JButton button;

    public q8() {
        label = new JLabel("Enter a number: ");
        textField = new JTextField();
        button = new JButton("Result");

        button.addMouseListener(this);

        add(label);
        add(textField);
        add(button);

        setSize(400, 600);
        setLayout(new GridLayout(20, 20));
        setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {
        int number = Integer.parseInt(textField.getText());
        label.setText("Factorial of " + number + " is: " + factorial(number));
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int number = Integer.parseInt(textField.getText());
        label.setText("Cube of " + number + " is: " + cube(number));
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    private int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    private int cube(int number) {
        return number * number * number;
    }

    public static void main(String[] args) {
        new q8();
    }
}
