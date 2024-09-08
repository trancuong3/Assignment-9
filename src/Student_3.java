public class Student_3 {
    private String id;
    private String name;
    public Student_3(){
        System.out.println("Default constructor is involked");
    }
    public Student_3(String id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student_3 student = new Student_3("111", "Karan");
        Student_3 student2 = new Student_3("222", "Aryan");
        student.display();
        student2.display();
    }
}