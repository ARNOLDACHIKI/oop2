public class Rectangle extends Shape {
    public Rectangle(){
        super();
    }
    public void setName(){
        System.out.println("Enter the name of the shape: ");
        name=input.nextLine();
    }
    
    
    public void getArea(){
        System.out.println("The area of the rectangle is "+dimension1*dimension2);
    }
    public   void sample(int x){
        System.out.println(x+"This came from the subclass");
    };
    
    
}
