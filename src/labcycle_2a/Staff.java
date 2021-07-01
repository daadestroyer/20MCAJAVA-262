package labcycle_2a;

public class Staff extends Person implements Staff_Op {
    String company;
    String empid;
    String designation;

    Staff(String name, String address, String phoneno, String emailid, String company, String empid,
          String designation) {
        super(name, address, phoneno, emailid);
        this.company = company;
        this.empid = empid;
        this.designation = designation;
    }

    @Override
    public void calculate_salary() {
        if (this.designation.equals("faculty")) {
            System.out.println("Salary is "+"50000");
        } else if (this.designation.equalsIgnoreCase("hod")) {
            System.out.println("Salary is "+"70000");
        } else if (this.designation.equalsIgnoreCase("director")) {
            System.out.println("Salary is "+"90000");
        } else {
            System.out.println("Salary is "+"100000");
        }

    }

    public void getStaffDetails() {
        System.out.println("name : "+this.name);
        System.out.println("address : "+this.address);
        System.out.println("phoneno : "+this.phoneNo);
        System.out.println("emailid : "+this.emailId);
        System.out.println("company : "+this.company);
        System.out.println("empid : "+this.empid);
        System.out.println("designanation : "+this.designation);
    }
}