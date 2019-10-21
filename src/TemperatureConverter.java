import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu: ");
        System.out.println("1.Fahrenheit to Celsius.");
        System.out.println("2.Celsius to Fahrenheit.");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        System.out.println();
       if(choice != 1 && choice != 2){
           System.out.println("Invald Choice!!!");
       }else{
           System.out.print("Enter Temperature value to convert: ");
           double input = sc.nextDouble();
           switch (choice){
               case 1:
                   System.out.println(input+ " Fahrenheit = "+fToC(input)+" Celsius");
                   break;
               case 2:
                   System.out.println(input+ " Celsius = "+cToF(input)+" Fahrenheit");
                   break;
           }
       }
    }

    private static double cToF(double in){
        return (9.0/5)*in +32;
    }

    private static double fToC(double in){
        return (5.0/9)*(in-32);
    }
}
