package models;

import javax.persistence.*;

@Entity
@Table(name = "administrators")
public class Admin extends Employee {

    private Manager manager;

    public Admin(){}

    public Admin(String name, int NINumber, double salary, Manager manager) {
        super(name, NINumber, salary);
        this.manager = manager;
    }

    @ManyToOne
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager(){
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }
}
