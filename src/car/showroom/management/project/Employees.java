package car.showroom.management.project;
import java.util.*;
//import java.util.UUID;

public class Employees extends Showroom implements utility{
    String emp_id;
    String emp_name;
    String emp_department;
    int emp_age;
    
    @Override
    public void get_details(){
        System.out.println("ID: " + emp_id);
        System.out.println("Name: " + emp_name);
        System.out.println("Department: " + emp_department);
        System.out.println("Age: " + emp_age);
        System.out.println("Showroom Name: " + showroom_name);
    }
    
    public void set_details(){
        Scanner sc = new Scanner(System.in);
        
        UUID uuid = UUID.randomUUID(); //generates random unique id auto increment
        emp_id = String.valueOf(uuid);
        
        System.out.println("====================== *** Enter Employee Details *** ==================");
        System.out.print("Enter Name: ");
        emp_name = sc.nextLine();
        System.out.print("Enter Department: ");
        emp_department = sc.nextLine();
        System.out.print("Enter Age: ");
        emp_age = sc.nextInt();
        System.out.print("Enter Showroom Name: ");
        System.out.println();
        System.out.println();
    }
}
