package task1;

public class MainTask1 {
    public static void main(String[] args) {
        Staff employeeAksoy66886 = new Staff();

        // Optional: uncomment below to enter data interactively from console:
        // employeeAksoy66886.initialize1Aksoy66886();

        employeeAksoy66886.print1Aksoy66886();

        double workedHoursAksoy66886 = 160.0;
        double hourlyRateAksoy66886 = 45.0;
        double overtimeHoursAksoy66886 = 12.0;
        int yearsOfExperienceAksoy66886 = 6;

        double baseSalaryAksoy66886 = employeeAksoy66886.salaryToPayAksoy66886(workedHoursAksoy66886, hourlyRateAksoy66886);
        double overtimePayAksoy66886 = employeeAksoy66886.salaryForOvertimeAksoy66886(overtimeHoursAksoy66886, hourlyRateAksoy66886);

        // Calling static method directly on the Salary interface: Salary.shouldReceiveBonusAksoy66886(...)
        boolean bonusEligibleAksoy66886 = Salary.shouldReceiveBonusAksoy66886(yearsOfExperienceAksoy66886);

        System.out.println("\n=== Salary Calculation ===");
        System.out.println("Base Salary (" + workedHoursAksoy66886 + "h @ " + hourlyRateAksoy66886 + ")      : " + baseSalaryAksoy66886);
        System.out.println("Overtime Salary (" + overtimeHoursAksoy66886 + "h @ 1.5x) : " + overtimePayAksoy66886);
        System.out.println("Years of Experience          : " + yearsOfExperienceAksoy66886);
        System.out.println("Receive Bonus?               : " + bonusEligibleAksoy66886);
        System.out.println("Total Compensation           : " + (baseSalaryAksoy66886 + overtimePayAksoy66886));

        /*
         * ANSWERS TO EXERCISE 8 TASK 1 QUESTIONS:
         * 1. Which method we have to override?
         *    -> We MUST override the "normal" abstract method: salaryToPayAksoy66886(hours, rate).
         * 2. Which method we can NOT override?
         *    -> We CANNOT override the static method: shouldReceiveBonusAksoy66886(yearsOfExperience),
         *       because static methods belong to the interface itself, not to implementing instances.
         * 3. Which method we can override, but don't have to?
         *    -> The default method: salaryForOvertimeAksoy66886(overtimeHours, rate). It already has a default body.
         * 4. How to call the static method?
         *    -> Directly using the interface name: Salary.shouldReceiveBonusAksoy66886(yearsOfExperience).
         * 5. How does our default method behave?
         *    -> It is inherited automatically by implementing classes (like Staff) and can be called on an object
         *       instance. IfStaff does not override it, the default implementation in Salary executes; if Staff
         *       overrides it, the overridden version in Staff executes.
         */
    }
}
