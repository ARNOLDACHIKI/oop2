package hospital;

public class Admin {
    
    public static void main(String[] args) {
        Patient p = new Patient();
        Patient p1 = new OutPatient("John","M", (short) 23, "1234", 200);
        p1.setPrescription();
        p1.setBill();
        Patient p2 = new InsidePatient("Jane","F", (short) 25, "1235", "Ward 1", (short) 5);
        p2.setBill();
        p.getPatientDetails();
        p1.getPatientDetails();
        p2.getPatientDetails(); 
}
}