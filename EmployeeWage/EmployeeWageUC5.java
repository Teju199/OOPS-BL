package EmployeeWage;

public class EmployeeWageUC5 {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;
    public static final int IS_PART_TIME = 2;
    public static final int empRatePerHour = 20;

    public static void main(String[] args) {
        int workingDays = 20;
        int totalEmployeeWage = 0;

        for(int day = 1; day <= workingDays; day++){

            int employeeWage = EmployeeWageUC4.calcEmployeeWage();
            totalEmployeeWage = totalEmployeeWage + employeeWage;

        }

        System.out.println("Total employee Wage for 20 days : " + totalEmployeeWage);

    }
}
