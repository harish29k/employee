/**
 * 
 * 
 *  Calculate Wages tilla condition of total working hours ordays is reached for
                     a month - Assume 100 hours
 */
  class Wagelimituc6 {
 
        static final int IS_PART_TIME = 1;
        static final int IS_FULL_TIME = 2;
        static final int EMP_RATE_PER_HOUR = 20;
        static final int TOTAL_WORKING_DAYS = 20;
        static final int TOTAL_WORKING_HRS = 100;

        public static void main(String[] args) {

                // Initializing variables
                int totalEmpWage = 0, workingDays = 0, totalEmpHrs = 0;

                // Computations
                int empHrs = 0;
                while (totalEmpHrs <= TOTAL_WORKING_HRS && workingDays < TOTAL_WORKING_DAYS) {
                int empCheck = (int)Math.floor(Math.random() * 10) % 3;
                workingDays++;

                switch (empCheck) {
                case IS_FULL_TIME:
                        empHrs = 8;
                        break;
                case IS_PART_TIME:
                        empHrs = 4;
                        break;
                default:
                        empHrs = 0;
                }

                totalEmpHrs += empHrs;
                System.out.println(" Day: " + workingDays);
                System.out.println(" Dailly Employee Hour: " + empHrs);
                System.out.println(" Total Employee hour: " + totalEmpHrs);
                System.out.println(" ");
        }
        totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
        System.out.println(" Calculate Employee Wages For a Month: " + totalEmpWage);
}
}




