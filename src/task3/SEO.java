package task3;

public class SEO extends Marketing{

    public SEO() {
    }

    public SEO(String companyName, int countOfEmployers, String departmentName) {
        super(companyName, countOfEmployers, departmentName);
    }

    @Override
    public void marketing() {
        System.out.println("Method from SEO class");
    }
}
