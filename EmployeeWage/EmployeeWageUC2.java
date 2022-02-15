package EmployeeWage;

public class EmployeeWageUC2 {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int empRatePerHour = 20;

    /*Calculating empHours by using random function.*/
    public static int empCheck() {
        int empCheck = (int) Math.floor(Math.random() * 10 % 2);
        int empHrs = 0;

        switch (empCheck) {
            case IS_PRESENT:
                empHrs = 8;
                break;

            case IS_ABSENT:
                break;

        }
        System.out.println("Total employee hours : " + empHrs);
        return empHrs;
    }

    /*Calculating Emp Wage Per day*/

    public static int calcEmployeeWage() {
        int empHrs = empCheck();
        int employeeWage = empHrs * empRatePerHour;
        System.out.println("Employee wage for the Day is " + " " + employeeWage);
        return employeeWage;
    }

    public static void main(String[] args) {
        calcEmployeeWage();
    }
}
