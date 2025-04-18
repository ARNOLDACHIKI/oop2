// Removed package declaration
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;//class

public class Math  extends JFrame{   /// the function  of this code is to make it a window with a title bar and  a boarder
    
    JLabel lbl1,lbl2,lblResult,lblOperation,lblGender;
    JLabel lblSelectList=new JLabel("Select List");
    JTextField txt1,txt2,txtresult;
    JRadioButton rbtnAdd=new JRadioButton("Add");
    

    JRadioButton rbtnProduct=new JRadioButton("product");
    
    
    JRadioButton rbtnDiff=new JRadioButton("Difference");
    

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
        rbtnAdd.addActionListener(new ActionListener());
        rbtnProduct.addActionListener(new ActionListener());
        rbtnDiff.addActionListener((ActionListener)this);

        // Adjust frame size and make it visible
        //pack(); // Automatically sizes the frame to fit components
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true); // Set visibility after packing
        
        
    }
        public void actionPerformed(ActionEvent e){
            int val1=Integer.parseInt(txt1.getText());
            int val2=Integer.parseInt(txt1.getText());
            int result;
            //getSource-returns the name of the object eg rbtnAdd
            //getActionCommand-returns the caption eg sum 
            if (e.getActionCommand().equals("sum")){
                result=val1+val2;
                txtresult.setText(Integer.toString(result));

            }
            if(e.getSource()==rbtnProduct){
                result=val1*val2;
                txtresult.setText(Integer.toString(result));
            }
            
        }
    
    public static void main(String[] S) {
        new Math();
    }

    /*label,text field /password field,button,Radio button/checkbox,combobox */
}
