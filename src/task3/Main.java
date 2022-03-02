package task3;

public class Main {
    public static void main(String[] args) {
        TaxAccounting tax = new TaxAccounting("Picsart","TaxDep",17);
        tax.account();

        FinancialAccount fin = new FinancialAccount("WebbFontain","FinDep",45);
        fin.account();
    }
}
