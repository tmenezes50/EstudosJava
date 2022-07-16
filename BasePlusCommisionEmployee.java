public class BasePlusCommisionEmployee {
    private final String firstName;
    private final String lastName;
    private final String socialSecuryNumber;
    private double grossSale;
    private double commissionRate;
    private double baseSalary;

    /* Construtor de cinco elementos */
    public BasePlusCommisionEmployee(String firstName, String lastName, String socialSecuryNumber, double grossSale, double commissionRate, double baseSalary) {
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
        }

        if (commissionRate < 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException("Commission rate must be > 0.0 and < 1.0");
        }

        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecuryNumber = socialSecuryNumber;
        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
        this.baseSalary = baseSalary;
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
        return baseSalary + (commissionRate * grossSale);
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
        "social security number", socialSecuryNumber, "gross sale", grossSale, "commission rate", commissionRate, "base salary", baseSalary);
    }
}
