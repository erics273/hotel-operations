package com.pluralsight;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    public Employee(int employeeId, String name, String department, double payRate, int hoursWorked) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getTotalPay(){
        double regularPay = this.payRate * this.getRegularHours();
        double overTimePay = this.payRate * this.getOvertimeHours() * 1.5;

        return regularPay + overTimePay;
    }

    public int getRegularHours(){
        if(this.hoursWorked <= 40){
            return this.hoursWorked;
        }

        return 40;
    }

    public int getOvertimeHours(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }
}
