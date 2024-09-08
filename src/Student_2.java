public class Student_2 {
    private String id;
    private String name;

    public Student_2(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student_2 student = new Student_2("111", "Karan");
        Student_2 student2 = new Student_2("222", "Aryan");
        student.display();
        student2.display();
    }
}