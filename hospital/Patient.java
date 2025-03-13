package hospital;
import java.util.Scanner;
public class Patient {
    protected String name;
    protected short yob;
    protected String gender;
    protected float bill;
    protected  String prescription;
    protected static Scanner input=new Scanner(System.in);

    public Patient(){};

public Patient(String n,String g,short y,String p){
    name=n;
    gender=g;
    yob=y;
    prescription=p;

}

   public void setBill(){
      
   }
   public void setPrescription(){
       System.out.println("Enter the prescription");
         prescription=input.nextLine();
         
   }
   public void setName(){
       System.out.println("Enter the name");
         name=input.nextLine();
   }
   public void setYob(){
         System.out.println("Enter the year of birth");
            yob=input.nextShort();
   }
   public void getPatientDetails(){
       System.out.println("Name: "+name);
       System.out.println("Year of birth: "+yob);
       System.out.println("The patient "+name+"s  bill is "+bill+" and the prescription is "+prescription);
      

}
public static void main(String[] args) {
    Patient p;
    p=new Patient("Jane","female",1990,"panadol");
    p.setBill();
    p.getPatientDetails();
}
}