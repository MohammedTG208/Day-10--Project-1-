import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculator {
    public static void main(String[] args) {
       calculator();
    }
   
    static void calculator(){
        Scanner input=new Scanner(System.in);
        int userAction;
        ArrayList<Double> allValueUserEnter=new ArrayList<>();
        boolean stop=true;
        do {
            System.out.println("Enter 1 to addition the numbers\n" +
                    "\n" +
                    "Enter 2 to subtraction the numbers\n" +
                    "\n" +
                    "Enter 3 to multiplication the numbers\n" +
                    "\n" +
                    "Enter 4 to division the numbers\n" +
                    "\n" +
                    "Enter 5 to modulus the numbers\n" +
                    "\n" +
                    "Enter 6 to find minimum number\n" +
                    "\n" +
                    "Enter 7 to find maximum number\n" +
                    "\n" +
                    "Enter 8 to find the average of numbers\n" +
                    "\n" +
                    "Enter 9 to print the last result in calculator\n" +
                    "\n" +
                    "Enter 10 to print the list of all results in calculator\n"+
                    "Enter 11 to stop");
            userAction=input.nextInt();
            switch (userAction){
                case 1:
                    allValueUserEnter.add(addition(input));
                    break;
                case 2:
                    allValueUserEnter.add(subtraction(input));
                    break;
                case 3:
                    allValueUserEnter.add(multiplication(input));
                    break;
                case 4:
                    allValueUserEnter.add(division(input));
                case 5:
                    allValueUserEnter.add(modulus(input));
                    break;
                case 6:
                   allValueUserEnter.add(minimum(input));
                   break;
                case 7:
                    allValueUserEnter.add(maximum(input));
                    break;
                case 8:
                    allValueUserEnter.add(average(input));
                    break;
                case 9:
                    lastResult(allValueUserEnter);
                    break;
                case 10:
                    allResults(allValueUserEnter);
                    break;
                case 11:
                    stop=false;
                    break;

            }
        }while (stop);
    }

    //Enter 1
    static double addition (Scanner input) {
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();
        return num1 + num2;

    }

    //Enter 2
    static double subtraction (Scanner input) {
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();
        return num1 - num2;
    }

    //enter 3
    static double multiplication(Scanner input) {
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();
        return num1 * num2;
    }

    //Enter 4
    static double division(Scanner input) {
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();
        return num1 / num2;
    }

    //Enter 5
    static double modulus(Scanner input) {
        System.out.println("Enter 1st number");
        double num1 = input.nextDouble();
        System.out.println("Enter 2nd number");
        double num2 = input.nextDouble();
        return num1 % num2;
    }

    //Enter 6
    static double minimum(Scanner input) {
        String stope="N";
        ArrayList<Double> insertValue=new ArrayList<Double>();
        do{
            System.out.println("Enter Number");
            insertValue.add(input.nextDouble());
            System.out.println("Do you want Complete?? Y/n");
            stope=input.next();
        }while (stope.equalsIgnoreCase("Y"));

        double minValue=insertValue.get(0);
        for (double getmin:insertValue){
            if (minValue>getmin){
                minValue=getmin;
            }
        }
        System.out.println("The minimum value: "+minValue);
        return minValue;

    }

    //Enter 7
    static double maximum(Scanner input) {
        String stope="Y";
        ArrayList<Double> insertValue=new ArrayList<Double>();
        do{
            System.out.println("Enter Number");
            insertValue.add(input.nextDouble());
            System.out.println("Do you want Complete?? Y/n");
            stope=input.next();
        }while (stope.equalsIgnoreCase("y"));

        double maxValue=insertValue.get(0);
        for (double getmax:insertValue){
            if (maxValue>getmax){
                maxValue=getmax;
            }
        }
        System.out.println("The minimum value: "+maxValue);
        return maxValue;
    }
        //Enter 8
    static double average(Scanner input){
        int counter=0;
        ArrayList<Double> arr=new ArrayList<>();
        String stop="y";
        do {
            counter++;
            System.out.print(counter+"-Enter Number: ");
            arr.add(input.nextDouble());
            System.out.println("System.out.println(\"Do you want Complete?? Y/n");
            stop=input.next();
        }while (stop.equalsIgnoreCase("y"));
       double value=0;
        for (double getMax:arr){
            value+=getMax;
        }
        return  value/arr.size();
    }
    //enter 9
    static void lastResult(ArrayList<Double> last){
        if (last.isEmpty()){
            System.out.println("there are not number to display.");
        }else {

            System.out.println("The last result " + last.get(0));
        }
    }
    //enter 10
    static void allResults(ArrayList<Double> all){
        System.out.println("That's all the results");
        System.out.println(all);
    }
}
