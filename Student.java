package mo4date23;

public class Student {
    // non-static variables
    int age = 20;
    String name = "Devika";

    public static void main(String[] args) {
        Student S = new Student(); // object creation
        System.out.println(S.age);
        System.out.println(S.name);
    }
}
