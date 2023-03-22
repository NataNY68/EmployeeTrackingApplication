import javax.swing.border.EmptyBorder;
import java.util.Random;

public class Employee {


    /*
    1- Create private instance variables for employee firstName, lastName, phoneNumber, email, employeeId, startDate,
    title, department)
    // Every instance variables' data type is string.

    2- Create getter and setter for instance variables
    3- Create the constructor to set the value to the instance variables
    4- Create one method to create the employeeId length of 20. This employee id must have letters as well.

       */
   private String firstName;
   private String lastName;
   private String phoneNumber;
   private String email;
   private String employeeId;
   private String startDate;
   private String title;
   private String department;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee(String firstName, String lastName, String phoneNumber, String email, String startDate, String title, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.employeeId = generateEmployeeId();
        this.startDate = startDate;
        this.title = title;
        this.department = department;
    }

    public Employee createEmployee(String firstName, String lastName, String email, String phoneNumber, String startDate, String title, String department){
    /*
    this method need to return Employee according to the parameter
    call the constructor inside this method.
     */

        return new Employee(firstName, lastName, email, phoneNumber, startDate, title, department);
    }

    public static String generateEmployeeId(){

        String str = "abcdefghijklmnopqrstuvwxyz0123456789";
        String id = "";
        for (int i = 0; i < str.length(); i++) {
            Random random = new Random(str.length());
            while (id.length() < 23){
                if(id.length()==8 || id.length()==13 || id.length() == 18)
                id+="-";
                id += "" + str.charAt(random.nextInt(str.length()));
            }
        }

        /*
        this method needs to return the employeeId Length of 20 which includes numbers as well.
        EmployeeId structure must be length of 20 UUID
        // random.nextInt();
        String str = "asdfghjkl1234567890"
        Random random = new Random ();

        Example: 61c49c2e-7dcd-11ea-bc55
        // 8 character - 4 character - 4 - 4
         */
        return id;
    }

    public static void main(String[] args) {
        System.out.println(generateEmployeeId());

    }
}
