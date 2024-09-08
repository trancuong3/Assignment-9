public class Student_1 {
    int ID;
    String name;
    public Student_1(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }
    void displayInformation(){
        System.out.println("ID: " + ID + ", Name: " + name);
    }
    public static void main(String[] args) {
        Student_1 student1 = new Student_1(1,"Nam");
        Student_1 student2 = new Student_1(2,"Lan");
        student1.displayInformation();
        student2.displayInformation();
    }
}