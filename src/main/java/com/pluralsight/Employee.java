package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private int hoursWorked;

    //just creating this for use when I punch out
    private int punchInTime;

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

    public void punchIn(int time){
        this.punchInTime = time;
    }

    //figure out the difference between the punch out time
    //and the punch in time and then add to the employees hours worked
    public void punchOut(int time){
        //this gets us the hours worked based on the punch in and punch out times
        int currentHoursWorked = time - this.punchInTime;

        //make sure the employee gets credit for the days work
        this.hoursWorked += currentHoursWorked;
    }

    public void punchTimeCard(int time, String action){
        if(action.equalsIgnoreCase("in")){
           this.punchIn(time);
        }

        if(action.equalsIgnoreCase("out")){
            this.punchOut(time);
        }
    }

    public void punchTimeCard(int start, int endTime){
        this.punchIn(start);
        this.punchOut(endTime);
    }

    public void punchIn() {
        //get the current time
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        //punch in with the hour
        this.punchIn(currentHour);
    }

    public void punchOut() {
        //get the current time
        LocalTime currentTime = LocalTime.now();
        int currentHour = currentTime.getHour();
        //punch in with the hour
        this.punchOut(currentHour);
    }
}
