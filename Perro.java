package Model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class Perro extends Animal  {

    private boolean vacunado;
    private List<String> registroVeterinaria;

    public Perro(String nombre, int edad, boolean vacunado) {
        super(nombre, edad);
        this.vacunado = vacunado;
        this.registroVeterinaria = new ArrayList<>();
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public List<String> getRegistroVeterinaria() {
        return registroVeterinaria;
    }

    public void setRegistroVeterinaria(List<String> registroVeterinaria) {
        this.registroVeterinaria = registroVeterinaria;
    }

    public void cargarVisita(String visita){

        this.registroVeterinaria.add(visita);
    }

    @Override
    public String toString() {
        return
                "registroVeterinaria=" + registroVeterinaria +
                ", vacunado=" + vacunado + super.toString();
    }

    @Override
    public String alimentarse() {
        return "El perro: " + getNombre() + "se alimento.";
    }

    @Override
    public String revisado() {
        return "El perro: " + getNombre() + "fue revisado.";
    }
}
