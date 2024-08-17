import java.util.Scanner;

class student {
    private String name;
    private String rollno;
    private String branch;

    public student(String name, String rollno, String branch) {
        this.name = name;
        this.rollno = rollno;
        this.branch = branch;
    }

    public void name(String name) {
        System.out.println("name of student is" + this.name);
    }

    public void details() {
        System.out.println("name of student is " + this.name);
        System.out.println("roll no of student is " + this.rollno);
        System.out.println("branch of student is " + this.branch);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        System.out.println("displaying student class using classes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the student");
        String name = sc.nextLine();
        System.out.println("Enter the roll number of the student");
        String rollno = sc.nextLine();
        System.out.println("Enter the branch of the student");
        String branch = sc.nextLine();
        student s = new student(name, rollno, branch);
        System.out.println("name of studnet is");
        s.name(name);
        System.out.println("details of student are");
        s.details();
        sc.close();

    }
}
