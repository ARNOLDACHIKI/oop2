package hospital;


public class InsidePatient extends Patient{

    
    
    protected  static String ward;
    protected short days;
    protected float bedCharge;
    protected float ConsultFee;
    public InsidePatient(String n,String g,short y,String p,String w,short d){
        super(n,g,y,p);
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
     
}
