import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class q14 extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public q14() {
        label = new JLabel("This is a Swing component.");
        button = new JButton("Click me!");

        button.addActionListener(this);

        add(label);
        add(button);

        setSize(400, 300);
        setLayout(new FlowLayout());
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("You clicked the button!");
        }
    }

    public static void main(String[] args) {
        new q14();
    }
}