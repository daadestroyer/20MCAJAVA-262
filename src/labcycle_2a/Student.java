package labcycle_2a;

public class Student extends Person implements Student_Op {
    String usn;
    String branch;

    Student(String name, String address, String phoneno, String emailid, String usn, String branch) {
        super(name, address, phoneno, emailid);
        this.usn = usn;
        this.branch = branch;
    }

    @Override
    public void calculateFees() {
        if (this.branch.equalsIgnoreCase("mca")) {
            System.out.println("Fees is " + "600000");
        } else if (this.branch.equalsIgnoreCase("be")) {
            System.out.println("Fees is " + "50000");
        }
    }

    public void getStudentDetails() {
        System.out.println("name : " + this.name);
        System.out.println("address : " + this.address);
        System.out.println("phoneno : " + this.phoneNo);
        System.out.println("emailid : " + this.emailId);
        System.out.println("usn : " + this.usn);
        System.out.println("branch : " + this.branch);

    }
}