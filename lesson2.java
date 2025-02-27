
import java.util.Scanner;
import javax.swing.JOptionPane;

/*
 * dialog boxes
************
JOptionPane class found in java.string package
which methods in that class are we interested in
showInputDialog()=>for input
overloading is where a methd receives different types of arguments
methods of the JOptionPane   are class methods
showMessageDialog()=>output
showConfirmDialog()=>input
by the use of class Byte,Short ,Integer      use parseType()  for type casting-it receives a string (parseType(string) and converts the string object into its equivalent data type


 */
public class lesson2 {
    public static void main(String[] args) {
        String name,temp;
        short yob;
        int cyear;
        /*  all variables createdd within a method are called local variables */
        name=JOptionPane.showInputDialog("Enter your name");
        temp=JOptionPane.showInputDialog(name+" When were you born?");
        yob=Short.parseShort(temp);
        cyear=Integer.parseInt(JOptionPane.showInputDialog("Enter current year"));
        JOptionPane.showMessageDialog(null/* you are telling the user i do not have an object now*/,name +" you are "+(cyear-yob)+" years old");
        System.out.println("Did i/o using dialog boxes");
        //main being static means that there is only one method of it
        
        ///you must initialize an object before you begin using it
        /// a static member can call a non statc member a non staic member canot be called by aa static member
        /// a non static member can call a  static member
        /// 
        lesson2 l2=new lesson2();
        l2.demo(); 
        l2.setinstanceVariable();
        setClassVariable();


        


    }    
    public  void demo(){
        System.out.println("Method Demo worked");
        //main(null);//it will not accept args   because   args is a local variable
        //to change an instance  method to a static method add the keyword static
        
    }
    public static void setClassVariable(){
        System.out.println("Enter the class variable");
        String insv;
        insv=input.nextline();

    }
    public String getinstanceVariable(){
        return insv;
        
    }
    public void setinstanceVariable(){
        System.out.println("Enter the instance variable")
        String instv;
        inst=input.nextline();
         
        
    }
    public String getinstanceVariable(){
        return instv;}
        
}
private static String classVariable;
private String instanceVariable;
private static Scanner input=new Scanner(System.in);//making it  static as it ca be accessed by static and non-static methods

