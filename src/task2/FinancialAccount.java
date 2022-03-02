package task2;

public class FinancialAccount extends TaxAccounting{
    private int countOfEmployers;
    private String departmentName;
    private static final int SALARY = 1000;

    public FinancialAccount() {
    }

    public FinancialAccount(int countOfEmployers, String departmentName) {
        this.countOfEmployers = countOfEmployers;
        this.departmentName = departmentName;
    }

    @Override
    public int getCountOfEmployers() {
        return countOfEmployers;
    }

    @Override
    public void setCountOfEmployers(int countOfEmployers) {
        this.countOfEmployers = countOfEmployers;
    }

    @Override
    public String getDepartmentName() {
        return departmentName;
    }

    @Override
    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public int account() {
        return countOfEmployers * SALARY;
    }
}
