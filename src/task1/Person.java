package task1;

import java.util.Scanner;

public class Person {
    protected String surnameAksoy66886;
    protected String firstNameAksoy66886;
    protected String streetAksoy66886;
    protected String zipCodeAksoy66886;
    protected String cityAksoy66886;

    public Person() {
        this.surnameAksoy66886 = "Aksoy";
        this.firstNameAksoy66886 = "Muhammed Enes";
        this.streetAksoy66886 = "Stoklosy 3";
        this.zipCodeAksoy66886 = "02-787";
        this.cityAksoy66886 = "Warszawa";
    }

    public void initializeAksoy66886() {
        Scanner scannerAksoy66886 = new Scanner(System.in);
        System.out.print("Enter surname: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.surnameAksoy66886 = scannerAksoy66886.nextLine();
        }
        System.out.print("Enter first name: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.firstNameAksoy66886 = scannerAksoy66886.nextLine();
        }
        System.out.print("Enter street: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.streetAksoy66886 = scannerAksoy66886.nextLine();
        }
        System.out.print("Enter zipCode: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.zipCodeAksoy66886 = scannerAksoy66886.nextLine();
        }
        System.out.print("Enter city: ");
        if (scannerAksoy66886.hasNextLine()) {
            this.cityAksoy66886 = scannerAksoy66886.nextLine();
        }
    }

    public void printAksoy66886() {
        System.out.println("=== Person Information ===");
        System.out.println("Surname    : " + surnameAksoy66886);
        System.out.println("First Name : " + firstNameAksoy66886);
        System.out.println("Street     : " + streetAksoy66886);
        System.out.println("Zip Code   : " + zipCodeAksoy66886);
        System.out.println("City       : " + cityAksoy66886);
    }
}
