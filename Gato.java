package Model;

import Interface.IAnimal;

import java.util.ArrayList;
import java.util.List;

public final class Gato extends Animal {

    private boolean esterelizado;
    private List<String> registrosVeterinaria;

    public Gato(String nombre, int edad, boolean esterelizado) {
        super(nombre, edad);
        this.esterelizado = esterelizado;
        this.registrosVeterinaria = new ArrayList<>();
    }

    public boolean isEsterelizado() {
        return esterelizado;
    }

    public void setEsterelizado(boolean esterelizado) {
        this.esterelizado = esterelizado;
    }

    public List<String> getRegistrosVeterinaria() {
        return registrosVeterinaria;
    }

    public void setRegistrosVeterinaria(List<String> registrosVeterinaria) {
        this.registrosVeterinaria = registrosVeterinaria;
    }

    public void cargarVisita(String visita){

        this.registrosVeterinaria.add(visita);
    }

    @Override
    public String toString() {
        return super.toString() +
                "esterelizado=" + esterelizado +
                "registrosVeterinaria=" + registrosVeterinaria;

    }

    @Override
    public String alimentarse() {
        return "El gato: " + getNombre() + "se alimento.";
    }

    @Override
    public String revisado() {
        return "El gato: " + getNombre() + "fue revisado.";
    }
}
