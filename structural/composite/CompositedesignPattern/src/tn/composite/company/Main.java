package tn.composite.company;

public class Main {

    public static void main(String[] args) {

        // Employees
        Employee mohamed =
                new Employee("Mohamed", 3000);

        Employee ahmed =
                new Employee("Ahmed", 3500);

        Employee sara =
                new Employee("Sara", 2500);

        Employee ali =
                new Employee("Ali", 4000);

        Employee lina =
                new Employee("Lina", 2800);

        // IT Department
        Department it = new Department("IT");
        it.add(mohamed);
        it.add(ahmed);
        it.add(sara);

        // HR Department
        Department hr = new Department("HR");
        hr.add(ali);
        hr.add(lina);

        // Company
        Department company = new Department("Company");
        company.add(it);
        company.add(hr);

        // Results
        System.out.println("IT salary: "
                + it.getTotalSalary());

        System.out.println("HR salary: "
                + hr.getTotalSalary());

        System.out.println("Company salary: "
                + company.getTotalSalary());
    }
}