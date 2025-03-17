import java.util.Scanner;
public class gradingSystem{
       
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("please enter the student's marks");
        int marks=scanner.nextInt();

        switch(marks){
            case marks>=70:
                System.out.println("A");
                break;

            case marks>=60:
                System.out.println("B");
                break;

            case marks>=50:
                System.out.println("C");
                break;

            case marks>=40:
                System.out.println("D");
                break;

            case marks<40:
                System.out.println("Fail");
                break;

            default:
                System.out.println("Error!");
        }
       
}}
