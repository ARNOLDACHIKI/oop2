import javax.swing.JOptionPane;
import java.util.Arrays;
public class BubbleSort {
    private static int[] numbers = {1, 2, 3, 4, 5};
    private static int [] marks=new int[7];

    public static void main(String [] args) {
        for(int i=0;i<marks.length;i++){
            marks[i]=Integer.parseInt(JOptionPane.showInputDialog("Enter the marks " +(i+1)));
        }
        for(int b: marks){
            System.out.print(b+",");
        }
        for (int p=0;p<numbers.length;p++){
            //ascending order
            int temp;
            for (int j=0;j<(numbers.length-1-p);j++){
                if(numbers[j]>numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }
            //descending order
            for (int t=0;t<numbers.length;t++){
                for(int d=0;d<(numbers.length-1-t);d++){
                    if (numbers[d+1]>numbers[d]){
                        temp=numbers[d];
                        numbers[d]=numbers[d+1];
                        numbers[d+1]=temp;
                    }
                }
            }
        }
    }
}
