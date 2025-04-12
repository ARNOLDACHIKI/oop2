// Removed package declaration
import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;


public class Math  extends JFrame{
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
        super("Math Operation ");
        setVisible(true);
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        lbl1 = new JLabel("Input 2");
        lbl2 = new JLabel("Input 2");
        lblGender=new JLabel("Gender");
        lblResult = new JLabel("Result");
        txtresult.setEditable(false);
        lblOperation = new JLabel("Operation");
        txt1 = new JTextField(20);
        txt2 = new JTextField(20);
        txtresult = new JTextField(20);
        btnSysLock = new JButton("System Lock");
        btnExit = new JButton("Exit Program");
        String [] gamesList = {"Select List", "Football", "Basketballs","Handballs", "Tennis"};
        games = new JComboBox(gamesList);
        
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

        bgOperation.add(rbtnAdd);
        bgOperation.add(rbtnProduct);
        bgOperation.add(rbtnDiff);
        
        bgGender.add(rbtnFemale);
        bgGender.add(rbtnMale);

        add(btnSysLock);
        add(btnExit);
        add(lblGender);
        add(rbtnFemale);
        add(rbtnMale);
        add(lblSelectList);
        add(games);
    }
    
    public static void main(String[] S) {
        new Math();
    }

    /*label,text field /password field,button,Radio button/checkbox,combobox */
}
