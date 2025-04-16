
public class Main {

    public static void main(String[] args) {
        // Person p = new Person();
        // p.display();
        // Person p2 = new Teacher();
        // p2.display();
        Person p[] = new Person[3];
        for (int i = 0; i < p.length; i++) {
            p[i] = new Person();
        }
        for (int i = 0; i < p.length; i++) {
            p[i].display();
        }
    }

}