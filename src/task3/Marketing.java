package task3;

public class Marketing extends ItCompany{

    protected String departmentName;

    public Marketing() {
    }

    public Marketing(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers);
        this.departmentName = departmentName;
    }

    public void marketing(){
    }
}
