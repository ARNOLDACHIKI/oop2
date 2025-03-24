import java.util.Scanner;
public class Part_TimeEmployee  extends Employee {
    private static final int hourlyRate=500;
    private static Scanner input=new Scanner(System.in);

    public Part_TimeEmployee(){
        super();
        System.out.println("How many hours has the employee "+name +"worked");
        int hours_worked=input.nextInt();
 
    }
    public  void calculateSalary(int hours_worked){
        salary=+(hourlyRate*hours_worked);
       
    }
}
