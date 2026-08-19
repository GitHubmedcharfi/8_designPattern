package tn.composite.company;

import java.util.ArrayList;
import java.util.List;

public class Department implements OrganizationUnit {

    private final String name;
    private final List<OrganizationUnit> children = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }

    public void add(OrganizationUnit unit) {
        children.add(unit);
    }

    public void remove(OrganizationUnit unit) {
        children.remove(unit);
    }

    @Override
    public double getTotalSalary() {
        return children.stream()
                .mapToDouble(OrganizationUnit::getTotalSalary)
                .sum();
    }

    public String getName() {
        return name;
    }
}