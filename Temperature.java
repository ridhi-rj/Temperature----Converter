import java.util.Scanner;

public class Temperature {
    private double temp;
    private char from, target;

    //Function for user to call
    public void conversion(){
        try {
            greeting();
            input();

            if ((from == 'c' || from == 'C') && (target == 'f' || target == 'F')) {
                System.out.println("\nTemperature in Fahrenheit: " + celsiusToFahrenheit(temp));
            }
            else if ((from == 'f' || from == 'F') && (target == 'c' || target == 'C')) {
                System.out.println("\nTemperature in Celsius: " + fahrenheitToCelsius(temp));
            }
            else if ((from == 'f' || from == 'F') && (target == 'k' || target == 'K')) {
                double c = fahrenheitToCelsius(temp);
                System.out.println("\nTemperature in Kelvin: " + (c + 273.15));
            }
            else if ((from == 'c' || from == 'C') && (target == 'k' || target == 'K')) {
                System.out.println("\nTemperature in Kelvin: " + (temp + 273.15));
            }
            else if ((from == 'k' || from == 'K') && (target == 'c' || target == 'C')) {
                System.out.println("\nTemperature in Celsius: " + (temp - 273.15));
            }
            else if ((from == 'k' || from == 'K') && (target == 'f' || target == 'F')) {
                double c = temp - 273.15;
                System.out.println("\nTemperature in Fahrenheit: " + celsiusToFahrenheit(c));
            }
            else {
                System.out.println("\nIncorrect Unit Entered. Try Again");
            }
        }
        catch(Exception e){
            System.out.println("\nINPUT MISMATCH, PLEASE TRY AGAIN");
        }
        finally {
            System.out.println("\nThank You for using the temperature convertor");
        }
    }

    //Displays messages at the beginning of the program
    private void greeting() {
        System.out.println("THIS IS A TEMPERATURE CONVERTER PROGRAM");
        System.out.println("Use the following keywords for different temperature units:");
        System.out.println("Celsius:        C OR c");
        System.out.println("Fahrenheit:     F OR f");
        System.out.println("Kelvin:         K OR k");
        System.out.println();
    }

    //Converts temperature from Celsius to Fahrenheit
    private double celsiusToFahrenheit(double c){
        return ((9 * c) / 5) + 32;
    }

    //Converts temperature from Fahrenheit to Celsius
    private double fahrenheitToCelsius(double f){
        return (5.0 / 9.0) * (f-32);
    }

    //Takes input from the user
    private void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Temperature Value: ");
        temp = sc.nextDouble();
        System.out.print("Enter current temperature unit: ");
        from = sc.next().charAt(0);
        System.out.print("Enter target temperature unit: ");
        target = sc.next().charAt(0);
    }

}