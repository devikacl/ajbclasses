package mon5date4;

class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Exampleemployee {

    public static void main(String[] args) {
        Employee e = new Employee();

        // Setting values
        e.setId(101);
        e.setName("Devika");

        // Getting values
        System.out.println(e.getId());
        System.out.println(e.getName());
    }
}