public class BasePlusCommisionEmployeeTest {
    public static void main(String[] args) {
        
        BasePlusCommisionEmployee employee = new BasePlusCommisionEmployee("Bob", "Lawis", "333-33-333",
        5000, 0.04, 300);

        System.out.println("Employee information obtained by get mathods:\n");
        System.out.printf("%s %s\n", "First name is", employee.getFirstName());
        System.out.printf("%s %s\n", "Last name is", employee.getLastName());
        System.out.printf("%s %s\n", "Social security number is", employee.getSocialSecuryNumber());
        System.out.printf("%s %.2f\n", "Gross sale is", employee.getGrossSale());
        System.out.printf("%s %.2f\n", "Commission rate is", employee.getCommissionRate());
        System.out.printf("%s %.2f\n", "Base salary is", employee.getBaseSalary());

        employee.setBaseSalary(1000);

        System.out.printf("\n%s:\n\n%s\n", "Updated employee information obtained by toString", employee.toString());
    }
}
