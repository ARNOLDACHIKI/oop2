import javax.swing.JOptionPane;
public  class Employee{
    protected String name;
    protected String empID;
    protected static  float salary;

    public Employee(){
        
        name=JOptionPane.showInputDialog("Enter the name of the employee");
        empID=JOptionPane.showInputDialog("Enter the employee ID");

    }
    public void calculateSalary(){
        System.out.println("Calculating salary.........");
    }
    public void displayDetails(){
        JOptionPane.showMessageDialog(null,"Employee Name: "+name+"\nEmployee ID: "+empID+"\nSalary: "+salary);
    }
    
}