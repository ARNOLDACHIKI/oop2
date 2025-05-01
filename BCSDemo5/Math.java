// Removed package declaration
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;//class
import javax.swing.JTextField;

public class Math  extends JFrame{   /// the function  of this code is to make it a window with a title bar and  a boarder
    
    JLabel lbl1,lbl2,lblResult,lblOperation,lblGender;
    JLabel lblSelectList=new JLabel("Select List");
    JTextField txt1,txt2,txtresult;
    JRadioButton rbtnAdd=new JRadioButton("Add");
    

    JRadioButton rbtnProduct=new JRadioButton("product");
    
    
    JRadioButton rbtnDiff=new JRadioButton("-");
    

    JRadioButton rbtnFemale=new JRadioButton("Female");
    JRadioButton rbtnMale=new JRadioButton("Male");
    JButton btnSysLock,btnExit;
    ButtonGroup bgOperation = new ButtonGroup();
    ButtonGroup bgGender= new ButtonGroup();
    JComboBox games;
    
    public Math() {
        super("Math Operation");
        setLayout(new FlowLayout()); // Use FlowLayout for simplicity
        setSize(300,200);
        // Initialize components
        lbl1 = new JLabel("Input 1");
        lbl2 = new JLabel("Input 2");
        lblGender = new JLabel("Gender");
        lblResult = new JLabel("Result");
        lblOperation = new JLabel("Operation");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txtresult = new JTextField(20);
        txtresult.setEditable(false);
        btnSysLock = new JButton("System Lock");
        btnExit = new JButton("Exit Program");
        btnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int x=JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?");
                if(x==0){
                    System.exit(0);
                }
            }
        });
        String[] gamesList = {"Select List", "Football", "Basketballs", "Handball", "Tennis", "Baseballs"};
        games = new JComboBox<>(gamesList);

        // Add components to the frame
        add(lbl1);
        add(txt1);
        add(lbl2);
        add(txt2);
        add(lblResult);
        add(txtresult);
        add(lblOperation);
        add(rbtnAdd);
        add(rbtnProduct);
        add(rbtnDiff);
        add(lblGender);
        add(rbtnFemale);
        add(rbtnMale);
        add(lblSelectList);
        add(games);
        add(btnSysLock);
        add(btnExit);

        // Group radio buttons
        bgOperation.add(rbtnAdd);
        bgOperation.add(rbtnProduct);
        bgOperation.add(rbtnDiff);
        bgGender.add(rbtnFemale);
        bgGender.add(rbtnMale);
        ActionPerformed handler=new ActionPerformed();
        rbtnAdd.addActionListener(handler);
        rbtnProduct.addActionListener(handler);
        rbtnDiff.addActionListener(handler);

        // Adjust frame size and make it visible
        //pack(); // Automatically sizes the frame to fit components
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // Set visibility after packing
        
        
    }
    private class ActionPerformed implements java.awt.event.ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            int val1 = Integer.parseInt(txt1.getText());
            int val2 = Integer.parseInt(txt2.getText());
            int result;
            // getSource-returns the name of the object eg rbtnAdd
            // getActionCommand-returns the caption eg sum 
            if (e.getSource() == rbtnAdd) {
                result = val1 + val2;
                txtresult.setText(Integer.toString(result));
            }
            if (e.getSource() == rbtnProduct) {
                result = val1 * val2;
                txtresult.setText(Integer.toString(result));
            }
            if (e.getSource() == rbtnDiff) {
                result = val1 - val2;
                txtresult.setText(Integer.toString(result));
            }
        }
    }  
    
    public static void main(String[] S) {
        new Math();
    }

    /*label,text field /password field,button,Radio button/checkbox,combobox */
}



















































/*
 * Absolutely! Let’s dive deep into Java Event Handling, covering all key approaches like anonymous classes, inner classes, lambda expressions, and separate listener classes—with clear explanations, syntax, pros/cons, and examples.

🧩 What is Event Handling in Java?
Event Handling is the mechanism that controls the interaction between user actions (events) and application responses.

🔹 Events can be: button clicks, key presses, mouse moves, etc.
🔹 Listeners are objects that "listen" for those events and react accordingly.

🎯 Core Interfaces in Java AWT/Swing:
ActionListener: For actions like button clicks.

MouseListener, MouseMotionListener: Mouse events.

KeyListener: Keyboard events.

WindowListener: Window events.

✅ Components of Event Handling:

Component	Description
Event Source	The GUI component (e.g., button)
Event Object	Encapsulates event details (e.g., ActionEvent)
Event Listener	Interface with methods to handle the event
🛠️ Ways to Implement Event Handling
Let’s explore 5 different methods for implementing event handling:

1. Using a Separate Class
🔹 A dedicated class that implements the listener interface.

✅ Pros:
Clear separation of concerns

Reusable and testable.

❌ Cons:
Verbose.h

Not ideal for single-use listeners.

🧪 Example:
java
Copy
Edit
import java.awt.*;
import java.awt.event.*;

class MyListener implements ActionListener {
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button clicked!");
    }
}

public class SeparateClassExample {
    public static void main(String[] args) {
        Frame f = new Frame("Separate Class");
        Button b = new Button("Click Me");

        b.setBounds(50, 100, 80, 30);
        b.addActionListener(new MyListener());

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
2. Using Inner Class
🔹 Define a class inside the main class to handle events.

✅ Pros:
Better encapsulation.

Can access outer class members.

❌ Cons:
Still a bit verbose for small tasks.

🧪 Example:
java
Copy
Edit
import java.awt.*;
import java.awt.event.*;

public class InnerClassExample {
    Frame f;
    Button b;

    InnerClassExample() {
        f = new Frame("Inner Class");
        b = new Button("Click");

        b.setBounds(100, 100, 80, 30);
        b.addActionListener(new MyActionListener());

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    class MyActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Clicked via Inner Class");
        }
    }

    public static void main(String[] args) {
        new InnerClassExample();
    }
}
3. Using Anonymous Class
🔹 Directly define the listener when attaching it to the component.

✅ Pros:
Short, convenient.

Great for one-time-use handlers.

❌ Cons:
Not reusable.

Harder to debug.

🧪 Example:
java
Copy
Edit
import java.awt.*;
import java.awt.event.*;

public class AnonymousClassExample {
    public static void main(String[] args) {
        Frame f = new Frame("Anonymous Class");
        Button b = new Button("Click Me");

        b.setBounds(100, 100, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Anonymous Class Clicked!");
            }
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
4. Using Lambda Expressions (Java 8+)
🔹 A cleaner, functional style for functional interfaces like ActionListener.

✅ Pros:
Most concise.

Readable and elegant.

Best for small logic handlers.

❌ Cons:
Only works for functional interfaces (interfaces with one abstract method).

🧪 Example:
java
Copy
Edit
import java.awt.*;
import java.awt.event.*;

public class LambdaExample {
    public static void main(String[] args) {
        Frame f = new Frame("Lambda");
        Button b = new Button("Click");

        b.setBounds(100, 100, 80, 30);

        b.addActionListener(e -> {
            System.out.println("Lambda Clicked!");
        });

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}
5. Using the Main Class Itself
🔹 Let the main class implement the listener interface.

✅ Pros:
Simple for small apps.

Direct access to UI components.

❌ Cons:
Can lead to large, messy classes.

🧪 Example:
java
Copy
Edit
import java.awt.*;
import java.awt.event.*;

public class MainClassListener implements ActionListener {
    Frame f;
    Button b;

    MainClassListener() {
        f = new Frame("Main Class Listener");
        b = new Button("Click");

        b.setBounds(100, 100, 80, 30);
        b.addActionListener(this);

        f.add(b);
        f.setSize(300, 200);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Handled in main class!");
    }

    public static void main(String[] args) {
        new MainClassListener();
    }
}
🧠 Summary Table

Method	Reusable	Concise	Good For
Separate Class	✅	❌	Clean, large apps
Inner Class	✅	➖	Medium apps
Anonymous Class	❌	✅	One-time listeners
Lambda Expression	❌	✅✅	Java 8+, quick logic
Main Class Itself	❌	➖	Small or demo apps
Would you like a visual chart/diagram showing the structure of these methods for better understanding?









 */
