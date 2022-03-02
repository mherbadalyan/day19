package task2;

public class TaxAccounting extends Accounting{
    private int countOfEmployers;
    private String departmentName;
    private static final int TAX_OF_ONE_EMPLOYER = 21;
    public TaxAccounting() {
    }

    public TaxAccounting(int countOfEmployers, String departmentName) {
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
        return this.countOfEmployers * TAX_OF_ONE_EMPLOYER;
    }
}
