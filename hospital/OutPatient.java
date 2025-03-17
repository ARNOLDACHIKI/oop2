package hospital;


public class OutPatient extends Patient{

    protected float ConsultFee;
  
    public OutPatient(String n,String g,short y,String p,float c){
        super(n,g,y,p);
        ConsultFee=c;
        
        
    }
    public void setBill(){
        System.out.println("Enter the consultation fee");
        ConsultFee=input.nextFloat();
        drugs=prescription.length()*100;
        bill=drugs+ConsultFee;
    }
    
}
