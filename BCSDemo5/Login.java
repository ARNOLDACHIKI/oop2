
import java.awt.FlowLayout;
import javax.swing .* ;

public class  Login extends JFrame{
    private JLabel lblUser,lblpword;
    private JTextField txtUser=new JTextField(20);
    private JPasswordField pwfpass;
    private JButton btnLogin,btnClear,btnExit;
    public Login(){
        super("Login Form");
        
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       setLayout(new FlowLayout());
       // setLayout(newGridLayout(4,2));
        lblUser = new JLabel("UserName");
        lblpword = new JLabel("Password");
        pwfpass = new JPasswordField(15);
        btnLogin=new JButton("Login");
        btnClear=new JButton("Clear ");
        btnExit=new JButton("Exit program");
        setVisible(true);
        setSize(300,200);
        add(lblUser);
        add(txtUser);
        add(lblpword);
        add(pwfpass);
        add(btnLogin);
        add(btnClear);
        add(btnExit);
        

    }
    public static void main(String [] S){
        new Login();
    }
}