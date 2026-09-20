package Model;

import Interface.IAnimal;

import java.util.Objects;

public abstract class Animal implements IAnimal {

    private static int contadorId = 1;

    private String nombre;
    private int edad;
    private String id;

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = String.valueOf(contadorId);
        contadorId++;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return
                "edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", id='" + id + '\'';

    }
}
