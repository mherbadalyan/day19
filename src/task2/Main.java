package task2;

public class Main {
    public static void main(String[] args) {
        TaxAccounting tax = new TaxAccounting(10,"TaxDep");
        System.out.println("Sum of employers tax = " + tax.account());

        FinancialAccount fin = new FinancialAccount(15,"FinDep");
        System.out.println("Sum of employers salary = " + fin.account());
    }
}
