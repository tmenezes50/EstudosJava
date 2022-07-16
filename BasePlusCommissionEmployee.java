public class BasePlusCommissionEmployee extends CommisionEmployee {
    private double baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, String socialSecuryNumber, 
    double grossSale, double commissionRate, double baseSalary) {
        super(firstName, lastName, socialSecuryNumber, grossSale, commissionRate);
        
        if(baseSalary < 0) {
            throw new IllegalArgumentException("Base salary must be >= 0");
        }
        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if(baseSalary < 0) {
            throw new IllegalArgumentException("Base salary must be >= 0");
        }
        this.baseSalary = baseSalary;
    }

    @Override
    public double earnings() {
        return baseSalary + (commissionRate * grossSale);
    }

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s%n%s: %.2f%n%s: %.2f%n%s: %.2f", "commission employee", firstName, lastName,
        "social security number", socialSecuryNumber, "gross sale", grossSale, "commission rate", commissionRate, "base salary", baseSalary);
    }
}