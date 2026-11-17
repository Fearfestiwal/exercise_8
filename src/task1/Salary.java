package task1;

public interface Salary {
    // 1. "normal" interface method (without body) that takes two parameters (hours and rate) and computes salary
    double salaryToPayAksoy66886(double hoursAksoy66886, double rateAksoy66886);

    // 2. default method that also takes two parameters and computes salary for overtime (1.5x rate)
    default double salaryForOvertimeAksoy66886(double overtimeHoursAksoy66886, double rateAksoy66886) {
        double overtimeMultiplierAksoy66886 = 1.5;
        return overtimeHoursAksoy66886 * rateAksoy66886 * overtimeMultiplierAksoy66886;
    }

    // 3. static method that checks if employee should receive bonus (using parameter yearsOfExperience)
    static boolean shouldReceiveBonusAksoy66886(int yearsOfExperienceAksoy66886) {
        int minimumYearsForBonusAksoy66886 = 5;
        return yearsOfExperienceAksoy66886 >= minimumYearsForBonusAksoy66886;
    }
}
