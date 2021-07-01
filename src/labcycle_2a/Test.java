package labcycle_2a;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("******Enter staff details******");
        System.out.println("Enter name : ");
        String name = sc.next();
        sc.nextLine();
        System.out.println("Enter address : ");
        String address = sc.next();

        System.out.println("Enter phoneNo : ");
        String phoneNo = sc.next();

        System.out.println("Enter emailId : ");
        String emailId = sc.next();

        System.out.println("Enter company : ");
        String company = sc.next();

        System.out.println("Enter empid : ");
        String empid = sc.next();

        System.out.println("Enter designation : ");
        String designation = sc.next();

        Staff staff = new Staff(name, address, phoneNo, emailId, company, empid, designation);
        System.out.println("EMPLOYEE DETAILS");


        staff.getStaffDetails();
        staff.calculate_salary();
        System.out.println("************************************************");
        System.out.println("******Enter student details******");
        System.out.println("Enter name : ");
        String name1 = sc.next();
        sc.nextLine();
        System.out.println("Enter address : ");
        String address1 = sc.next();

        System.out.println("Enter phoneNo : ");
        String phoneNo1 = sc.next();

        System.out.println("Enter emailId : ");
        String emailId1 = sc.next();

        System.out.println("Enter company : ");
        String company1 = sc.next();

        System.out.println("Enter usn : ");
        String usn = sc.next();

        System.out.println("Enter branch : ");
        String branch = sc.next();

        Student student = new Student(name1, address1, phoneNo1, emailId1, usn, branch);

        student.calculateFees();
        student.getStudentDetails();
    }
}