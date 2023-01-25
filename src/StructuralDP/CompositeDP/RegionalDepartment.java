package StructuralDP.CompositeDP;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RegionalDepartment extends Department{

    //Ana islem bunun üyerinden ve const. üzerinden dönüyor.
    List<Department> departments;

    //RegionalDepartman kisminin Runner class'in da cagirildigi zaman Departmana bagli ksimlar gelebilsin.
    public RegionalDepartment(List<Department> departments) {
        this.departments = departments;
    }

    @Override
    String getName() {
        return departments.stream(). //Finance objesi ve Sales objesi
                map(Department::getName). //"Finance" ve "Sales"
                collect(Collectors.joining(", ")); //"Finance, Sales"
    }

    @Override
    List<String> getEmployees() {
        return departments.stream().
                flatMap(d-> d.getEmployees().stream()).
                collect(Collectors.toList());
    }
}
