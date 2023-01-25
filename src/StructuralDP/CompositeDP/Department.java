package StructuralDP.CompositeDP;

import java.util.List;

public abstract class Department {

    //interface te farkli 2 sekilde implement edilebilirken
    //abstract class sadece bir kere extends imkani veriyor.

    abstract String getName();

    abstract List<String> getEmployees();
}
