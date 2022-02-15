package EmployeeWage;

public class EmployeeWageUC1 {
    public static final int IS_PRESENT = 1;
    public static final int IS_ABSENT = 0;

    public static int empCheck() {
        int empCheck = (int) Math.floor(Math.random() * 10 % 2);

        if (empCheck == IS_PRESENT) {
            System.out.println("Employee is Present.");
        }

        else {
            System.out.println("Employee is Absent.");
        }
        return empCheck;
    }

    public static void main(String[] args) {
        empCheck();
    }
}