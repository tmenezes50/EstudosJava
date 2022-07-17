package Herança;

public class CommisionEmployeeTest {
    public static void main(String[] args) {
        CommisionEmployee employee = new CommisionEmployee("Sue", "Jones", "222-222-222", 10000, 0.6);

        System.out.println("Employee information obtained by get methods:");
        System.out.printf("%n%s %s%n", "First name is:", employee.getFirstName());
        System.out.printf("%s %s%n", "Last name is:", employee.getLastName());
        System.out.printf("%s %s%n", "Social security number is:", employee.getSocialSecuryNumber());
        System.out.printf("%s %.2f%n", "Gross sale is:", employee.getGrossSale());
        System.out.printf("%s %.2f%n", "Commission rate is:", employee.getCommissionRate());

        employee.setGrossSale(5000);
        employee.setCommissionRate(0.1);

        System.out.printf("%n%s:%n%n%s%n", "Updated employee information obtained by toString", employee);
    }
}