package tn.composite.company;

public class Employee implements OrganizationUnit {

    private final String name;
    private final double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getTotalSalary() {
        return salary;
    }

    public String getName() {
        return name;
    }
}
