package EmployeeWageDiffCompanies;

public class EmployeeWageUC8 {
        public static final int IS_PRESENT = 1;
        public static final int IS_ABSENT = 0;
        public static final int IS_PART_TIME = 2;


        public static int CalcEmpWageForCom(String Company, int maxHrs, int empRatePerHr, int numOfDays) {
            int empHrs = 0;
            int totalWorkingHrs = 0;
            int totalWage = 0;
            int day = 1;

            while (totalWorkingHrs <= maxHrs && day <= numOfDays) {

                int empCheck = (int) Math.floor(Math.random() * 10 % 3);

                switch (empCheck) {
                    case IS_PRESENT:
                        empHrs = 8;
                        break;

                    case IS_PART_TIME:
                        empHrs = 4;
                        break;

                    case IS_ABSENT:
                        break;

                }
                int employeeWage = empHrs * empRatePerHr;
                totalWorkingHrs = totalWorkingHrs + empHrs;
                totalWage = totalWage + employeeWage;
                day++;
            }
            System.out.println("Total");
            return totalWage;
        }

            public static void main(String[] args) {
            int totalWage1 = CalcEmpWageForCom("Dell", 100, 20, 20);
            int totalWage2 = CalcEmpWageForCom("HP", 80, 30, 20);
            System.out.println("Total Employee Wage for Dell : " + totalWage1 );
            System.out.println("Total Employee Wage for HP : " + totalWage2);

        }
}
