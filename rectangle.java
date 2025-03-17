import javax.swing.JOptionPane;
public class rectangle {
    public static void main(String [] args){
        int shape=Integer.parseInt(JOptionPane.showInputDialog("What shape do you want to print  1.Rectangle 2.Triangle   3.Inverted triangle 4.square"));
        switch(shape){
            case 1:
                int rows=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows "));
                int columns=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of columns "));
                for(int a=1;a<=rows;a++){
                    for(int b=1;b<=columns;b++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                //triangle
                int triangle_rows=Integer.parseInt(JOptionPane.showInputDialog("Enter the number of rows for your triangle"));
                for(int c=1;c<=triangle_rows;c++){
                    for(int d=1;d<triangle_rows;d++){
                        System.out.print(" ");
                    }
                        for(int e=1; e<=(2*c-1);e++){
                            System.out.print("*");
                        }
                    
                    System.out.println();
                }
                break;
            case 3:
                int height=Integer.parseInt(JOptionPane.showInputDialog("Enter the size of your Inverted triangle"));
                for(int f=height;f>=1;f--){
                    for(int g=height;g>f;g--){
                        System.out.print(" ");
                    }
                    for(int h=1;h<=(2*f-1);h++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;

            case 4:
                int size=Integer.parseInt(JOptionPane.showInputDialog("Enter the size of the square"));
                for(int s=1;s<=size;s++){
                    for(int v=1;v<=size;v++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }
        
    }
}
