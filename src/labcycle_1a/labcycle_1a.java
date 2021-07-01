package labcycle_1a;


import java.util.Scanner;

class Education {
    String name, usn, email, branch, mobile_num;

    void acceptStudentDetails(String name, String usn, String email, String branch, String mobile_num) {
        this.name = name;
        this.usn = usn;
        this.email = email;
        this.branch = branch;
        this.mobile_num = mobile_num;
    }

    void displayStudentDetails() {
        System.out.println("name: " + name);
        System.out.println("usn: " + usn);
        System.out.println("email: " + email);
        System.out.println("branch: " + branch);
        System.out.println("mobile number: " + mobile_num);

    }

    int calculateStudentFees() {
        int tution_fee, branch_fee, total;

        if (branch.equalsIgnoreCase("mca")) {
            branch_fee = 40000;
            tution_fee = 25000;
            total = tution_fee + branch_fee;
            return (total);

        } else if (branch.equalsIgnoreCase("mtech")) {
            branch_fee = 20000;
            tution_fee = 25000;
            total = tution_fee + branch_fee;
            return (total);
        } else if (branch.equalsIgnoreCase("btech")) {
            branch_fee = 50000;
            tution_fee = 25000;
            total = tution_fee + branch_fee;
            return (total);
        } else {
            System.out.println("branch not valid");
            return 0;
        }
    }
}

public class labcycle_1a {
    public static void main(String[] args) {
        String choice = "yes";
        while (choice.equals("yes")) {
            System.out.println("********Education Detail Program********");
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter name:");

            String studentname = sc.nextLine();
            System.out.print("Enter student usn:");
            String studentusn = sc.nextLine();
            System.out.print("Enter student email id:");
            String studentemail = sc.nextLine();
            System.out.print("Enter student mobile number:");
            String studentmobile_num = sc.nextLine();
            System.out.print("Enter PG branch [mca/mtech/btech]");
            String student_branch = sc.nextLine();

            Education e1 = new Education();
            e1.acceptStudentDetails(studentname, studentusn, studentemail, student_branch, studentmobile_num);

            System.out.println("********Total fees of "+studentname+"********");
            int total = e1.calculateStudentFees();
            System.out.println("total fees: " + total);

            System.out.println("\n Displaying student details");
            e1.displayStudentDetails();

            System.out.println("total fees: " + total);
            System.out.println("-----------------------------------------------");
            System.out.println();
            System.out.println("Want to enter more data [yes/no]");
            choice = sc.next();


        }

        System.out.println("********THANK YOU********");
    }

}
