package day10;

class Bike {
    String brand;
    int mileage;

    Bike(String brand, int mileage) {
        this.brand = brand;
        this.mileage = mileage;
    }

    void displayBike() {
        System.out.println("Bike Brand: " + brand);
        System.out.println("Mileage: " + mileage);
    }
}

class Book {
    String name;
    String author;

    Book(String name, String author) {
        this.name = name;
        this.author = author;
    }

    void displayBook() {
        System.out.println("Book Name: " + name);
        System.out.println("Author: " + author);
    }
}

class Heart {
    int weight;
    int bpm;

    Heart(int weight, int bpm) {
        this.weight = weight;
        this.bpm = bpm;
    }

    void displayHeart() {
        System.out.println("Heart Weight: " + weight);
        System.out.println("BPM: " + bpm);
    }
}

class Brain {
    int weight;
    String colour;

    Brain(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    void displayBrain() {
        System.out.println("Brain Weight: " + weight);
        System.out.println("Colour: " + colour);
    }
}

class Student {

    Bike bike;
    Book book;

    Heart heart = new Heart(300, 72);
    Brain brain = new Brain(1400, "Grey");

    String studentName;

    Student(String studentName, Bike bike, Book book) {
        this.studentName = studentName;
        this.bike = bike;
        this.book = book;
    }

    void displayStudent() {

        System.out.println("Student Name: " + studentName);

        bike.displayBike();
        book.displayBook();

        heart.displayHeart();
        brain.displayBrain();
    }
}

public class Main {

    public static void main(String[] args) {

        Bike b = new Bike("Honda", 45);
        Book bk = new Book("Java Basics", "James Gosling");

        Student s = new Student("Rahul", b, bk);

        s.displayStudent();
    }
}
