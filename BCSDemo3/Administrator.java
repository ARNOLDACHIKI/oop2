package BCSDemo3;

import javax.swing.JOptionPane;
public class Administrator{
    private String  name;


    public Administrator(){
        name=JOptionPane.showInputDialog("Enter the Administrator's name");
      
        Person p=new Person();

    }
    public static void main(String [] S){
        Administrator A=new Administrator();

    }

}
//constructor to allow user to key in the name of the admistrator 
//class administrator to use joption pane to do input and output
