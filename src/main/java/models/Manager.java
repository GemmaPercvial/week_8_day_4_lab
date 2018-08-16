package models;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "managers")
public class Manager extends Employee{

    private double budget;
    private String department;
    private Set<Admin> admins;

    public Manager(){}

    public Manager(String name,
                   int NINumber,
                   double salary,
                   double budget,
                   String department)
    {
        super(name, NINumber, salary);
        this.budget = budget;
        this.department = department;
    }

    @Column(name = "budget")
    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Column(name = "department")
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @OneToMany(mappedBy = "manager", fetch = FetchType.LAZY)
    public Set<Admin> getAdmins(){
        return admins;
    }

    public void setAdmins(Set<Admin> admins){
        this.admins = admins;
    }


}
