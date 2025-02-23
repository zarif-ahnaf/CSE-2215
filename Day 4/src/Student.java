public class Student {
    private String name;
    private int age;
    private Integer semester = null;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int semester) {
        this.name = name;
        this.age = age;
        this.semester = semester;
    }

    void show() {
        System.out.println("Name:" + this.name);
        System.out.println("Age:" + this.age);
        if (this.semester != null) {
            System.out.println("Semester:" + this.semester);
        }
        System.out.println();
    }
}
