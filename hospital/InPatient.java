package hospital;
import java.util.Scanner;
public class Patient{};
public class Inpatient extends Patient{
public class InPatient {
    super();
    private static Scanner input=new Scanner(System.in);
    private  static String ward;
    private short days;
    private float bedCharge;
    public InPatient(String n,String g,short y,String w,short d){
        super(n,g,y);
         ward=w;
         days=d;
     }
     public void setBill(){
            System.out.println("Enter the ward");
            ward=input.nextLine();
            System.out.println("Enter the days");
            days=input.nextShort();
            System.out.println("Enter the consultation fee");
            ConsultFee=input.nextFloat();
            bill=days*1000;
            bedCharge=days*500;
            bill=bedCharge+ConsultFee;
     }
     public static void main(String[] args) {
        
        
        Inpatient I=new InPatient("kiambui","Male",3031,"ward",3);
        I.setBill();
        I.setBill();
    
}
}
}