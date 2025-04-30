import java.util.Scanner;
public abstract  class Shape {
    protected String name;
    protected float dimension1;
    protected int dimension2;
    protected static Scanner input=new Scanner(System.in);
    public Shape(){
    System.out.println("Enter the name of the shape: ");
        name=input.nextLine();
        System.out.println("Enter the first dimension of the  " +name);
        dimension1=input.nextFloat();
        System.out.println("Enter the second dimension of the  "+name);    
        dimension2=input.nextInt(); 

    }
    public final void sample(){
        System.out.println("This is a final method");
    };
    public String getName(){
        return name;
    }
    public   void   setName(){
        System.out.println("Enter the name of the shape: ");
        name=input.nextLine();

    }
    public void setDimension1(){
        System.out.println("Enter the first dimension of the : " +name);
        dimension1=input.nextFloat();
    }
    public void setDimension2(){
        System.out.println("Enter the second dimension of the : " +name);
        dimension2=input.nextInt();
    }
       
     
    public  void getArea(){};

    
}