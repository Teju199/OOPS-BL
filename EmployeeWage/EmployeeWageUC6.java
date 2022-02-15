package EmployeeWage;

public class EmployeeWageUC6 {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int IS_PART_TIME = 2;
    public static final int empRatePerHour = 20;

    public static void main(String[] args) {
        int totalWorkingHrs = 0;
        int day = 1;
        int totalEmployeeWage = 0;

        while(totalWorkingHrs <= 100 && day <= 20) {
            int employeeWage = EmployeeWageUC4.calcEmployeeWage();
            int workingHrs = EmployeeWageUC4.empCheck();
            totalWorkingHrs = workingHrs + totalWorkingHrs;
            totalEmployeeWage += employeeWage;
            day++;

        }
            System.out.println("Total Employee Wage : " + totalEmployeeWage );

    }
}
