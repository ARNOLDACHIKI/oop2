import javax.swing.JOptionPane;
public class Converter {
    private double fahrenheit;
    private double celsius;
    public Converter(){
        fahrenheit=Double.parseDouble(null,JOptionPane.showInputDialog("Enter the temperature in fahrenheit"));
        celsius=Double.parseDouble(null,JOptionPane.showInputDialog("Enter the temperature in celsius"));
    }
    public Converter(double fahrenheit,double celsius){
        this.fahrenheit=fahrenheit;
        this.celsius=celsius;
    }
    public void setFahrenheit(){
        fahrenheit=Double.parseDouble(null,JOptionPane.showInputDialog("Enter the temperature in fahrenheits"));
    }
    public void setCelsius(){
        celsius=Double.parseDouble(null,JOptionPane.showInputDialog("Enter the temperatures in celsiu"));
    }
    public double getFahrenheit(){
        return fahrenheit;
    }
    public double getCelsius(){
        return celsius;
    }
    public double convertToCelsius(){
        celsius=(fahrenheit-32)*5/9;
        return celsius;
    }
    public double convertToFahrenheit(){
        fahrenheit=(celsius*9/5)+32;
        return fahrenheit;
    }
    public static void main(String[] args) {
        Converter c=new Converter();
        
        JOptionPane.showMessageDialog(null,"The temperature in celsius is "+c.convertToCelsius());
        JOptionPane.showMessageDialog(null,"The temperature in fahrenheit is "+c.convertToFahrenheit());
    }
}
