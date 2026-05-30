package com.day03;

import java.util.Scanner;

public class EmployeeWageComputation {

    static final int IS_PRESENT = 1;
    static final int PART_TIME = 1;
    static final int FULL_TIME = 2;

    static final int EMP_RATE_PER_HOUR = 20;
    static final int PART_TIME_HOURS = 4;
    static final int FULL_TIME_HOURS = 8;

    static int check;

    public static int empCheck() {

        return (int)(Math.random() * 2);
    }

    public static int calculateDailySalary(int hours) {

        return hours * EMP_RATE_PER_HOUR;
    }

    public static int calculateMonthlySalary(int hours) {

        return calculateDailySalary(hours) * 20;
    }

    // UC1
    public static void welcomeToEmployeeWage() {

        System.out.println("Welcome To Employee Wage Computation");

        check = empCheck();

        if(check == IS_PRESENT) {

            System.out.println("Employee Present");

        } else {

            System.out.println("Employee Absent");
        }
    }

    // UC2
    public static void calculateEmployeeWage() {

        int hours = (check == IS_PRESENT) ? FULL_TIME_HOURS : 0;

        System.out.println(
                "Daily Wage : " +
                calculateDailySalary(hours));
    }

    // UC3 + UC4
    public static void addEmployeeWage(Scanner sc) {

        System.out.println("1 -> Part Time");
        System.out.println("2 -> Full Time");

        int status = sc.nextInt();

        int hours = 0;

        switch(status) {

            case PART_TIME:

                hours = PART_TIME_HOURS;

                System.out.println(
                        "Monthly Salary : "
                        + calculateMonthlySalary(hours));

                break;

            case FULL_TIME:

                hours = FULL_TIME_HOURS;

                System.out.println(
                        "Monthly Salary : "
                        + calculateMonthlySalary(hours));

                break;

            default:

                System.out.println("Invalid Choice");
        }
    }

    // UC5
    public static void calculateWage20Days(Scanner sc) {

        System.out.println("1 -> Part Time");
        System.out.println("2 -> Full Time");

        int status = sc.nextInt();

        int hours =
                (status == PART_TIME)
                ? PART_TIME_HOURS
                : FULL_TIME_HOURS;

        int totalSalary = 0;

        for(int day = 1; day <= 20; day++) {

            if(empCheck() == IS_PRESENT) {

                totalSalary += calculateDailySalary(hours);
            }
        }

        System.out.println(
                "Total Salary For 20 Days : "
                + totalSalary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        welcomeToEmployeeWage();

        calculateEmployeeWage();

        addEmployeeWage(sc);

        calculateWage20Days(sc);
    }
}