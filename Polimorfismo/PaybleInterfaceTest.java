package Polimorfismo;

public class PaybleInterfaceTest {
    public static void main(String[] args) {
        Payble[] paybleObject = new Payble[4];

        paybleObject[0] = new Invoice("01234", "seat", 2, 375.00);
        paybleObject[1] = new Invoice("56789", "tire", 4, 79.95);
        paybleObject[2] = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        paybleObject[3] = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);

        System.out.println("Invoice and Employee processed polymorphically");

        for(Payble currentPayable: paybleObject){
            System.out.printf("\n%s \n%s: $%,.2f\n", currentPayable.toString(), "payment due", currentPayable.getPaymentAmount());
        }
    }
}

