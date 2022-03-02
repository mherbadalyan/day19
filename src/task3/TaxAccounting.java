package task3;

public class TaxAccounting extends Accounting{

    public TaxAccounting() {
    }

    public TaxAccounting(String companyName, String departmentName, int countOfEmployers) {
        super(companyName, departmentName, countOfEmployers);
    }

    @Override
    public void account() {
        int taxOfOneEmployer = 10;
        System.out.println("Sum of tax all employers from "+ companyName + " company " + departmentName + " department = " + taxOfOneEmployer * this.countOfEmployers);
    }
}
