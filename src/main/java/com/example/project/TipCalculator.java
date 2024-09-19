package com.example.project;

public class TipCalculator {
    //WRITE YOUR PROGRAM IN calculateTip
    public static String calculateTip(int people, int percent, double cost) { //You must use these  variable in your calculations
        //DO NOT DELETE ANY OF THE CODE BELOW      
        StringBuilder result = new StringBuilder();
        //your code here

        double costEach=Math.round(cost/people * Math.pow(10, 2))
        / Math.pow(10, 2);
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
        //try different values for people, percent, and cost to test your program before running test cases
        int people = 12;
        int percent = 15;
        double cost = 566.97;
        System.out.println(calculateTip(people,percent,cost));
    }
}