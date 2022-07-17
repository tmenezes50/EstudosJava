package Polimorfismo;

public class CommissionEmployee extends Employee {
    private double grossSale;
    private double commissionRate;

    public CommissionEmployee(String firstName, String lastName,
    String socialSecurityNumber, double grossSale, double commissionRate) {
        super(firstName, lastName, socialSecurityNumber);

        if (grossSale < 0.0) {
            throw new IllegalArgumentException("gross sale must be >= 0");
        }

        if (commissionRate <= 0) {
            throw new IllegalArgumentException("commission rate must be > 0");
        }

        this.grossSale = grossSale;
        this.commissionRate = commissionRate;
    }

    public double getGrossSale(){
        return grossSale;
    }

    public double getCommissionRate() {
        return commissionRate;
    }

    public void setGrossSale(double grossSale) {
        if (grossSale < 0.0) {
            throw new IllegalArgumentException("gross sale must be >= 0");
        }
        this.grossSale = grossSale;
    }

    public void setCommissionRate(double commissionRate) {
        if (commissionRate <= 0) {
            throw new IllegalArgumentException("commission rate must be > 0");
        }
        this.commissionRate = commissionRate;
    }

    @Override
    public double earnings() {
        return getCommissionRate() * getGrossSale();
    }

    @Override
    public String toString() {
        return String.format("%s: %s\n%s: $%,.2f; %s: %.2f", "commission employee", super.toString(), 
        "gross sale", getCommissionRate(), "commission rate", getCommissionRate());
    }


}
