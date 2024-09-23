package com.example;

import java.util.Scanner;

public class ExtraCredit {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations



        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        double costEach=Math.round(cost/people * Math.pow(10, 2))                // I learned how to round from here: 
        / Math.pow(10, 2);                                                      //https://www.geeksforgeeks.org/java-program-to-round-a-number-to-n-decimal-places/
        double totalTip=Math.round(cost*(percent/100.0) * Math.pow(10, 2))
        / Math.pow(10, 2);
        double tipEach=Math.round(cost*(percent/100.0)/people * Math.pow(10, 2))
        / Math.pow(10, 2);
        double total=cost+totalTip;
        double totalEach=Math.round((cost+(cost*(percent/100.0)))/people * Math.pow(10, 2))
        / Math.pow(10, 2);


        result.append("-------------------------------\n");
        result.append("Total bill before tip: $"+cost+"\n"); //concatenate to this string. DO NOT ERASE AND REWRITE
        result.append("Total percentage: "+percent+"%\n");
        result.append("Total tip: $"+totalTip+"\n");
        result.append("Total Bill with tip: $"+total+"\n");
        result.append("Per person cost before tip: $"+costEach+"\n");
        result.append("Tip per person: $"+tipEach+"\n");
        result.append("Total cost per person: $"+totalEach+"\n");
        result.append("-------------------------------\n");
        

        return result.toString();
    }
     //TEST YOUR PROGRAM IN main
     public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        System.out.println(calculateTip(people,percent,cost));

        String input = "a";
        String items = "";
    
        // the while loop condition is checked,
        // and if TRUE, runs the code inside.
        // when the code inside is done running, the condition is rechecked,
        // and the loop repeats as long as the condition remains TRUE.
        // when the condition becomes FALSE, it stops
        while (!input.equals("-1")) {
            System.out.print("Enter an item name or type '-1' to finish: ");
            input = scan.nextLine();
            items += input + "\n";
        }

        System.out.println("Items ordered:\n" + items);

        scan.close();
    }
}