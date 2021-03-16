import java.util.List;

public class CompanyManagement {
    public static void main(String[] args) {

        //Create instance

        EmployeeDAOImpl dao = EmployeeDAOImpl.getInstance();

        //dispaly all employee data
        displayAllEmp(dao);
        //add new





    }

    private static void displayAllEmp(EmployeeDAOImpl dao) {
         List<Employee> emp = dao.getAllEmp();
         System.out.println("Employee Data:");
         for (Employee e:emp){
             System.out.println(e.toString());
         }
    }
}
