package BCSDemo3;
import java.util.Scanner;
public class Person {
    private String name,gender;
    private static short cy;
    private short  yob;
    
    private static Scanner input =new  Scanner(System.in);
    public Person(){
        System.out.println("Enter your name");
        name=input.nextLine();
        System.out.println(name+" what is your gender");
        gender=input.nextLine();
        System.out.println(name +" When were you born");
        yob=input.nextShort();
        



    }

    public static void setYear(){
        System.out.println(" What is the current year ");
        cy=input.nextShort();
    }
    public void viewDetails(){
        System.out.println("Your name is "+ name+ " and your age is " +(cy-yob)+" and you gender is "+gender);
    }
    public void setName(){
        System.out.println("Enter your name");
        name=input.nextLine();
    }
    public void setGender(){
        System.out.println(name+" what is your gender");
        gender=input.nextLine();
    }
    public void setYearofBirth(){
        System.out.println(name+"  When were you born");
        yob=input.nextShort();
    }
    public String getname(){
        return name;
    }
    public String getgender(){
        return gender;
    }
    public Short getYearofBirth(){
        return yob;
    }
    public Char menu(){
        
    }
    


public static void main(String []  S){
    Person p;
    p=new Person();
    setYear();
    p.viewDetails();
   


  
}
}
