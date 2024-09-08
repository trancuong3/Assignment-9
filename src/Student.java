import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student {
    private String id;
    private String fullName;
    private float GPA;
    private Date dateOfBirth;
    private String major;

    public Student(String id, String fullName, float GPA, Date dateOfBirth, String major) {
        this.id = id;
        this.fullName = fullName;
        this.GPA = GPA;
        this.dateOfBirth = dateOfBirth;
        this.major = major;
    }

    public Student() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setGPA(float GPA) {
        this.GPA = GPA;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }


    public void setMajor(String major) {
        this.major = major;
    }
    Student enterStudentInfo(Student student)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter student ID:");
        student.setId(scanner.nextLine());
        System.out.println("Enter student full name:");
        student.setFullName(scanner.nextLine());
        System.out.println("Enter GPA:");
        student.setGPA(scanner.nextFloat());
        scanner.nextLine();
        System.out.println("Enter date of birth (yyyy-mm-dd):");
        String dateOfBirthStr = scanner.nextLine();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date dateOfBirth = dateFormat.parse(dateOfBirthStr);
            student.setDateOfBirth(dateOfBirth);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("enter major");
        student.setMajor(scanner.nextLine());
        return student;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", GPA=" + GPA +
                ", dateOfBirth=" + dateOfBirth +
                ", major='" + major + '\'' +
                '}';
    }
    public static void main(String[] args) {
        Student student = new Student();
        student.enterStudentInfo(student);
        System.out.println(student);
    }

}
