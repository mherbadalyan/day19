package task3;

public class FinancialAccount extends TaxAccounting{

    public FinancialAccount() {
    }

    public FinancialAccount(String companyName, String departmentName, int countOfEmployers) {
        super(companyName, departmentName, countOfEmployers);
    }

    @Override
    public void account() {
        int salary = 1000;
        System.out.println("Salary of all employers = " + salary * this.countOfEmployers);
    }
}
