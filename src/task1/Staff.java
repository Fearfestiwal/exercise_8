package task1;

import java.util.Scanner;

public class Staff extends Person implements Salary {
    private String educationAksoy66886;
    private String positionAksoy66886;

    public Staff() {
        super();
        this.educationAksoy66886 = "Computer Engineering (B.Sc.)";
        this.positionAksoy66886 = "Software Developer";
    }

    public void initialize1Aksoy66886() {
        super.initializeAksoy66886();
        Scanner scannerAksoy66886 = new Scanner(System.in);
        System.out.print("Enter education: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.educationAksoy66886 = scannerAksoy66886.nextLine();
        }
        System.out.print("Enter position: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.positionAksoy66886 = scannerAksoy66886.nextLine();
        }
    }

    public void print1Aksoy66886() {
        super.printAksoy66886();
        System.out.println("Education  : " + educationAksoy66886);
        System.out.println("Position   : " + positionAksoy66886);
    }

    // MUST override: "normal" abstract interface method salaryToPay
    @Override
    public double salaryToPayAksoy66886(double hoursAksoy66886, double rateAksoy66886) {
        return hoursAksoy66886 * rateAksoy66886;
    }

    // CAN override (optional, not required): default method salaryForOvertime
    @Override
    public double salaryForOvertimeAksoy66886(double overtimeHoursAksoy66886, double rateAksoy66886) {
        // Calling default behavior from Salary interface (or providing custom logic)
        return Salary.super.salaryForOvertimeAksoy66886(overtimeHoursAksoy66886, rateAksoy66886);
    }
}
