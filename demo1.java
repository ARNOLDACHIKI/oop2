
import java.util.Scanner;
public class demo1{
   public static void main(String[] args) {
       System.out.println("Welcome to java ");
       System.out.println("5+3");
       System.out.println(5+3);
       System.out.println("Sum of 3 & 4 is "+(3+4));
       Scanner input=new Scanner(System.in);// new is used when calling a constructor
       String  name;
       int yob;
       System.out.println("Enter your name ");
       name=input.nextLine();
       System.out.println(name +" Enter your year of birth ");
       yob=input.nextInt();
      System.out.println(name +" you are "+(2025-yob)+ " years old ");

   }//classes do not end wuith semi colon.
   //system is a class
   //out is an object
   //print()-outputs then remains on the same line 
   //println()-it outputs then moves to the next line
   //"" -delimeter -output dont process

}
//JAVA INPUT SING SCANNER CLASS
/* is found under the util package  hence it has to be imported explicitly */
//class scanner methods
/*1.Next() -reads single word
  2.netline()=>Reads multiple lines
  3.nextInt()=>Reads integers
  4nextFloat()
  5.nextDouble()
  6.nextShort()
  7.nextlong()
  8.nextByte()
*/

/*inbuilt classes
 ->methods
 1.name
 2.arguements
 3.class/instance
 4.return/void

 */
