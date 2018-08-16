import db.DBHelper;
import db.DBManager;
import models.Admin;
import models.Manager;

import java.util.List;

import static db.DBManager.findAllEmployeesToManager;

public class Runner {

    public static void main (String[] args){


        Manager manager1 = new Manager("Name", 3030, 2300.50, 100000.00, "Shoes");
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Name1", 2020, 3400.50, 200000.00, "Something");
        DBHelper.save(manager2);

        Admin admin1 = new Admin("Name", 2029, 2300.50, manager1);
        DBHelper.save(admin1);
        Admin admin2 = new Admin("Name1", 4040, 2500.20, manager2);
        DBHelper.save(admin2);

        List<Admin> MngrAdmins = DBManager.findAllEmployeesToManager(manager1);

    }

}
