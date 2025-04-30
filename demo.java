import javax.swing.JOptionPane;
public class demo {
    private String user;
    private int year;
    public demo(){
        user=JOptionPane.showInputDialog("Enter the user ");
        year=Integer.parseInt(JOptionPane.showInputDialog("Enter the year"));

    }
    public static  void myArray1(){
        String[] name=new String[3];
        byte[] marks={25,40,55,82,64};
        for (byte x=0;x<name.length;x++){
            name[x]=JOptionPane.showInputDialog("Enter the name"+(x+1));
        }
        System.out.println("Below are the scores for the students");
        for (byte b :marks){
            System.out.print(b+",");
        }
        System.out.println("\n  now sorted ascending");
        byte temp;
            for (byte x=0;x<marks.length;x++){
                for (byte y=0;y<4;y++){
                    if (marks[y]>marks[y+1]){
                        temp=marks[y];
                        marks[y]=marks[y+1];
                        marks[y+1]=temp;
                       
                    }
                }
            }
            for (byte b :marks){
                System.out.print(b+",");
        }


       
    }
    public static int compute(int...values){
        int sum=0;
        for (int x:values){
            sum+=x;
        }
        return sum;
    }
    public demo(String user,int year){
        this.user=user;
        this.year=year;   ///this can only be used if the local variable has the same name as the instance variable to differenctiate between the year that is class and the local year
    }   
    public void setUser(){
        user=JOptionPane.showInputDialog("Enter the user ");
    }
    public void setYear(){
        year=Integer.parseInt(JOptionPane.showInputDialog("Enter the year"));
    }
    public String getUser(){
        return user;
    }
    public int getYear(){
        return year;
    }
    public static void main(String [] args){
        demo d=new demo();
        d.setUser();
        d.setYear();
        JOptionPane.showMessageDialog(null,d.getUser()+" was created in the year  "+d.getYear());
        demo d1=new demo("John",2020);
        //asking info from the user
        String name=JOptionPane.showInputDialog("Enter your name");
        int yob=Integer.parseInt(JOptionPane.showInputDialog(name+" what is the year"));
        demo d2=new demo(name,yob);
        JOptionPane.showMessageDialog(null,d2.getUser()+" was created in the year "+d2.getYear());
        System.out.println("Sum of the first 3 numbers is " +compute(1,2,3));
        System.out.println("Sum of the first 5 numbers is " +compute(10,20,30,40));
    }

}
