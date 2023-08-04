import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class q13 extends JFrame implements ActionListener {

    private JTextField firstNumberField, secondNumberField, answerField;
    private JButton addButton, subtractButton, divideButton, multiplyButton, cancelButton;

    public q13() {
        super("Calculator");
        setLayout(new FlowLayout());

        firstNumberField = new JTextField(10);
        add(firstNumberField);

        secondNumberField = new JTextField(10);
        add(secondNumberField);

        answerField = new JTextField(10);
        answerField.setEditable(false);
        add(answerField);

        addButton = new JButton("Add");
        addButton.addActionListener(this);
        add(addButton);

        subtractButton = new JButton("Subtract");
        subtractButton.addActionListener(this);
        add(subtractButton);

        divideButton = new JButton("Divide");
        divideButton.addActionListener(this);
        add(divideButton);

        multiplyButton = new JButton("Multiply");
        multiplyButton.addActionListener(this);
        add(multiplyButton);

        cancelButton = new JButton("Cancel");
        cancelButton.addActionListener(this);
        add(cancelButton);

        setSize(300, 200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        int firstNumber, secondNumber, answer;

        firstNumber = Integer.parseInt(firstNumberField.getText());
        secondNumber = Integer.parseInt(secondNumberField.getText());

        if (e.getSource() == addButton) {
            answer = firstNumber + secondNumber;
        } else if (e.getSource() == subtractButton) {
            answer = firstNumber - secondNumber;
        } else if (e.getSource() == divideButton) {
            answer = firstNumber / secondNumber;
        } else if (e.getSource() == multiplyButton) {
            answer = firstNumber * secondNumber;
        } else {
            answer = 0;
        }

        answerField.setText(String.valueOf(answer));
    }

    public static void main(String[] args) {
        q13 calculator = new q13();
    }
}