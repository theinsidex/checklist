package net.checklist.Entity;

import javax.persistence.Entity;

@Entity
public class Employee {
    private Integer id;
    private String name;
    private Employee manager;

}
