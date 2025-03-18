import java.util.Scanner;
public class Val_Args {
    public static int addNumbers(int... numbers ){
        int total=0;
        for(int v :numbers){
            total+=v;
        }
        return total;
    }
   
    public static  void main(String[] args){
        Scanner input=new Scanner(System.in);
        int count;
        System.out.println("Enter the number of values you want to add ");
        count=input.nextInt();
        int[] numbers=new int[count];
        for(int i=0;i<count;i++){
            System.out.println("Enter the number "+(i+1));
            numbers[i]=input.nextInt();
        }
        int sum=addNumbers(numbers);
        System.out.println("The sum of the numbers is "+sum);
       
    }
}
