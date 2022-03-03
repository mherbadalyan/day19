package task3;

public class SMM extends Marketing{

    public SMM() {
    }

    public SMM(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("Method from SMM class");
    }
}
