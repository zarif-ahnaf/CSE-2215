public class Main {
    public static void problem_1() {
        Calculator t = new Calculator(1, 2);
        System.out.println(t.getMax());
        System.out.println(t.getSum());

    }

    public static void problem_2() {
        Employee t = new Employee(10000, 12, 12);
        t.show();
    }

    public static void problem_3() {
        Student t = new Student("Zarif Ahnaf", 12);
        Student t2 = new Student("Zarif Ahnaf Drubo", 100, 6);
        t.show();
        t2.show();

    }

    public static void main(String[] args) {
        problem_3();
    }
}
