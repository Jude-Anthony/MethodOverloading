package com.judelew;

public class Main {

    public static void main(String[] args) {
        double centimeters = calcFeetAndInchestoCentimeters(6, 0);
        if(centimeters < 0.0){
            System.out.println("Invalid parameters");
        }
        calcFeetAndInchestoCentimeters(-10);

    }

    public static double calcFeetAndInchestoCentimeters(double feet, double inches)
    {
        if((feet < 0) || ((inches < 0 || inches > 12))) {
            System.out.println("Invalid feet or inches");
            return -1;
        }
            double convertFeettoCM = feet * 30.48;
            double convertInchestoCM = inches * 2.54;
            double centimeters = convertFeettoCM + convertInchestoCM;
            System.out.println(feet + " feet " + inches + " inches = " + centimeters + "cm");

            return centimeters;
    }
     public static double calcFeetAndInchestoCentimeters(double inches)
     {
         if(inches < 0){

             return -1;
         }

         double feet = (int) inches / 12;
         double remainingInches = (int) inches % 12;
         System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
         return calcFeetAndInchestoCentimeters(feet, remainingInches);

     }

}
