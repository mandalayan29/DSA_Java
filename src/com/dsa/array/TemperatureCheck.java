package com.dsa.array;

import java.util.Scanner;

public class TemperatureCheck {
    static Scanner sc= new Scanner(System.in);
    private double[] temperatureData;
    private double average;

    public void setTemperatureData(int days){
        double total=0;
        temperatureData= new double[days];
        for(int i=0; i<days; i++){
            System.out.print("Enter temperature of day "+(i+1)+" : ");
            temperatureData[i]= sc.nextInt();
            total= total+ temperatureData[i];
        }
        average= total/days;
    }

    public int highTemperatureDays(){
        int totalDays= 0;
        for(double temp: temperatureData){
            if(temp> average)
                totalDays++;
        }
        return totalDays;
    }

    public static void main(String[] args) {
        TemperatureCheck temperatureCheck= new TemperatureCheck();

        System.out.print("Enter the number of days : ");
        int days= sc.nextInt();

        temperatureCheck.setTemperatureData(days);

        System.out.println("Average temp : "+ temperatureCheck.average);
        System.out.println("Days with high temperature : "+ temperatureCheck.highTemperatureDays());

    }
}
