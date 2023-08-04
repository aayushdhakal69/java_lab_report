// import java.awt.*;
// import javax.swing.*;

// public class practice extends JFrame {
//     public JButton b1, b2, b3, b4, b5;

//     practice() {
//         setTitle("Hello");
//         setVisible(true);
//         setSize(300, 300);

//         setLayout(new GridLayout(2,2));

//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");

//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//     }

//     public static void main(String[] args) {
//         practice obj = new practice();
//     }
// }

// import java.awt.*;
// import javax.swing.*;

// public class practice extends JFrame {
//     public JButton b1, b2, b3, b4, b5;

//     practice() {
//         setTitle("Hello");
//         setVisible(true);
//         setSize(300, 300);

//         setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));

//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");

//         add(b1);
//         add(b2);
//         add(b3);
//         add(b4);
//     }

//     public static void main(String[] args) {
//         practice obj = new practice();
//     }
// }

import java.awt.*;
import javax.swing.*;

class practice extends JFrame {
    public JButton b1, b2, b3, b4, b5;

    practice() {
        setTitle("Border layout");
        setVisible(true);
        setSize(300, 300);

        setLayout(new BorderLayout(20,22));

        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        b4 = new JButton("Button 4");
        b5 = new JButton("Button 5");

        add(b1, BorderLayout.CENTER);
        add(b2, BorderLayout.SOUTH);
        add(b3, BorderLayout.WEST);
        add(b4, BorderLayout.EAST);
        add(b5, BorderLayout.NORTH);
    }

    public static void main(String[] args) {
        practice obj = new practice();
    }
}