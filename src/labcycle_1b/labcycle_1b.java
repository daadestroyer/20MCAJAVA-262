package labcycle_1b;

import java.util.Scanner;


class Student {
    String studentName, studentcollegeAddress, studentPhnNo, studentEmailId, studentBranch;
    double totalFees, additionalFees, tutionFees, fee1;
    static String collegeName, collegeAddress, collegePhnNo;
    static {
        collegeName = "RVCE";
        collegeAddress = "kengeri, bengaluru";
        collegePhnNo = "1234567890";
    }

    Student(String studentName, String studentcollegeAddress, String studentPhnNo, String studentEmailId,
            String studentBranch) {
        this.studentName = studentName;
        this.studentcollegeAddress = studentcollegeAddress;
        this.studentPhnNo = studentPhnNo;
        this.studentEmailId = studentEmailId;
        this.studentBranch = studentBranch;
    }

    Student(String studentName, String studentcollegeAddress, String studentBranch) {
        this.studentName = studentName;
        this.studentcollegeAddress = studentcollegeAddress;
        this.studentBranch = studentBranch;
    }

    public double fee(String studentBranch2) {
        this.additionalFees = 25000;
        this.tutionFees = 25000;
        this.fee1 = 10000;
        totalFees = additionalFees + tutionFees + fee1;
        if (studentBranch.equalsIgnoreCase("BE")) {
            totalFees += 30000;
        } else {
            totalFees += 25000;
        }
        return totalFees;
    }

    public void display() {
        System.out.println("**********************");
        System.out.println("Student studentName " + studentName);
        System.out.println("Student collegeAddress " + collegeAddress);
        System.out.println("Student Phone No " + collegePhnNo);
        System.out.println("Student Email " + studentEmailId);
        System.out.println("Student studentBranch " + studentBranch);
        System.out.println("**********************");

    }

    public void display(String studentBranch) {
        double feecal = this.fee(studentBranch);
        System.out.println("**********************");
        System.out.println("Total fees for the studentBranch: " + studentBranch + " total fees:" + feecal);
        System.out.println("**********************");
    }

    public void display(int no_of_fields) {
        if (no_of_fields == 3) {
            System.out.println("**********************");
            System.out.println("Student studentName : " + studentName);
            System.out.println("Student collegeAddress : " + collegeAddress);
            System.out.println("Student Phone : " + collegePhnNo);
            System.out.println("**********************");

        } else {
            System.out.println("**********************");
            System.out.println("Student studentName " + studentName);
            System.out.println("Student collegeAddress " + collegeAddress);
            System.out.println("Student Phone No " + collegePhnNo);
            System.out.println("Student Email " + studentEmailId);
            System.out.println("Student studentBranch " + studentBranch);
            System.out.println("**********************");
        }
    }
}

public class labcycle_1b {
    public static void main(String args[]) {
        Student stud;
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("**********Enter the student details**********");
            System.out.println();
            System.out.print("Enter Student studentName : ");
            String studentName = sc.next();
            sc.nextLine();
            System.out.print("Enter Student collegeAddress : ");
            String add = sc.next();
            System.out.print("Enter the studentBranch : ");
            String studentBranch = sc.next();
            System.out.println();
            System.out.print("Would you like to enter emailid and collegePhnNo [1(yes) / 0(no) ]");
            System.out.println();
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.println();
                System.out.print("Enter the collegePhnNo  ");
                String collegePhnNo = sc.next();
                sc.nextLine();
                System.out.print("Enter the emailid ");
                String emailid = sc.next();
                stud = new Student(studentName, add, collegePhnNo, emailid, studentBranch);
            } else {
                stud = new Student(studentName, add, studentBranch);
            }
            System.out.println();

            while (true) {
                System.out.println("Would you like to display");
                System.out.println("1. display all details");
                System.out.println("2. display total studentBranch fees");
                System.out.println("3. display selected fields");
                System.out.println("4. Go Back");
                choice = sc.nextInt();
                if (choice == 1) {
                    stud.display();
                } else if (choice == 2) {
                    System.out.println("Enter the studentBranch");
                    studentBranch = sc.next();
                    stud.display(studentBranch);
                } else if (choice == 3) {
                    System.out.println("Enter the no of fields(3 or 5) to display");
                    int nooffields = sc.nextInt();
                    stud.display(nooffields);
                } else if (choice == 4) {
                    break;
                } else {
                    System.out.println("Wrong Choice");
                }
            }

            System.out.println();
            System.out.println("Enter the choice : ");
            System.out.println("1. Continue ");
            System.out.println("2. Exit ");
            choice = sc.nextInt();
            if (choice == 2) {
                System.out.println("**********************************");
                System.out.println("THANK YOU FOR VISITING...");
                System.out.println("**********************************");
                break;
            }
        }
    }
}