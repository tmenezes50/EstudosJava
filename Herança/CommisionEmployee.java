package Herança;

public class CommisionEmployee extends Object {

    private final String firstName;
    private final String lastName;
    private final String socialSecuryNumber;
    private double grossSale;
    private double commissionRate;

    /* Construtor de cinco elementos */
    public CommisionEmployee(String firstName, String lastName, String socialSecuryNumber, double grossSale, double commissionRate) {
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecuryNumber = socialSecuryNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecuryNumber() {
        return socialSecuryNumber;
    }

    public void setGrossSale(double grossSale) {
        if(grossSale < 0.0) {
            throw new IllegalArgumentException("Gross sale must be > 0.0");
        }
        this.grossSale = grossSale;
    }

    public double getGrossSale() {
        return grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        this.commissionRate = commissionRate;
        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }
    }
    
    public double getCommissionRate() {
        return commissionRate;
    }

    public double earnings() {
        return commissionRate * grossSale;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
         "social security number", socialSecuryNumber, "gross sale", grossSale, "commission rate", commissionRate);
    }
}