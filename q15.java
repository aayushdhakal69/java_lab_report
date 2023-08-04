import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;
import java.awt.event.*;

public class q15 extends JFrame implements MouseListener {

    private JLabel label;

    public q15() {
        label = new JLabel("This is a mouse event demo.");
        label.addMouseListener(this);

        add(label);

        setSize(400, 300);
        // setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        label.setText("You clicked the mouse!");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        label.setText("You pressed the mouse!");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setText("You released the mouse!");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        label.setText("The mouse entered the component!");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        label.setText("The mouse exited the component!");
    }

    public static void main(String[] args) {
        new q15();
    }
}
