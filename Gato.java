package Model;

import java.util.ArrayList;
import java.util.List;

public final class Gato extends Animal{

    private List<String> visitasVeterinaria;
    private Boolean esterelizado;

    public Gato(String nombre, String idVeterinaria, int edad, String visitasVeterinaria, boolean esterelizado) {
        super(nombre, idVeterinaria, edad);
        this.visitasVeterinaria = new ArrayList<>();
        this.esterelizado = esterelizado;
    }

    public List<String> getVisitasVeterinaria() {
        return visitasVeterinaria;
    }

    public void setVisitasVeterinaria(List<String> visitasVeterinaria) {
        this.visitasVeterinaria = visitasVeterinaria;
    }

    public Boolean getEsterelizado() {
        return esterelizado;
    }

    public void setEsterelizado(Boolean esterelizado) {
        this.esterelizado = esterelizado;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "Edad" + getEdad() + "NUmero veterinaria: " + getIdVeterinaria() + "Visatas al gato: " + visitasVeterinaria + "Esterilzado: " + esterelizado;
    }

    public boolean esterilizar(){

        if(esterelizado){
            return true;
        }
        else return false;
    }
}
