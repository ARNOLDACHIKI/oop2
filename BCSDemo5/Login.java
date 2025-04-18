import java.awt.FlowLayout; //interface
import java.awt.event.ActionEvent;//class
import java.awt.event.ActionListener;
import javax.swing .* ;

public class  Login extends JFrame implements ActionListener{
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
        pwfpass = new JPasswordField(20);
        btnLogin=new JButton("Login");
        btnLogin.addActionListener(new Handler());
        
        btnClear=new JButton("Reset ");
         //anonymous-event handler
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                txtUser.setText("");
                pwfpass.setText("");
            }
        });
        btnExit=new JButton("Exit program");
        btnExit.addActionListener(this);
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
   

    //Action Listener  event listener
    private class Handler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String user=txtUser.getText();
            String pword=pwfpass.getText();
            //equals()-compares two strings including their case--used fr case sensitivity
            //equalsIgnoreCase();-compare strings but ignore their case-used when you wanna relax the case
            //username=student
            //password=BCS2.2
            if (user.equalsIgnoreCase("lod") && pword.equals("1234")){
                JOptionPane.showMessageDialog(null,"Welcome to Main Form");
                new Math();
                setVisible(false);
            }
            else{
                JOptionPane.showMessageDialog(null, "Authetication failed \n Try again");
                pwfpass.setText("");//resets the password fiels
            }

        }

    }
    


    public static void main(String [] S){
        new Login();
    }
    @Override
    public void actionPerformed(ActionEvent e){
        
        int x=JOptionPane.showConfirmDialog(this,"Are you sure you want to exit f");
        if(x==0){
            System.exit(0);
        
    }}
}