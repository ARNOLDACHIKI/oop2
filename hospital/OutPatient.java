package hospital;

public class Patient{};
public class OutPatient extends Patient{
public class OutPatient {
    protected float ConsultFee;
    protected long drugs;
    
    
  
    public OutPatient(String n,String g,short y,String p,float c,String p){
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
}