package models;

public class Empleado {

    // Atributos
    private int id;
    private String name;
    private String position;

    // Constructor
    public Empleado(int id, String name, String position) {
        this.id = id;
        this.name = name;
        this.position = position;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    // toString
    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Position: " + position;
    }
}