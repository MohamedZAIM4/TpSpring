package model;

public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Méthodes d'accès pour l'ID
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // Méthodes d'accès pour le nom
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
