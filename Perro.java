package Model;

import java.util.ArrayList;
import java.util.List;

public final class Perro extends  Animal {

    private List<String> listaVisitas;
    private boolean vacunado;

    public Perro(String nombre, String idVeterinaria, int edad, String listaVisitas, boolean vacunado) {
        super(nombre, idVeterinaria, edad);
        this.listaVisitas = new ArrayList<>();
        this.vacunado = vacunado;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "Edad: " + getEdad() + "Numero de registro: " + getIdVeterinaria() + "Lista de visitas: " + listaVisitas + "Vacuna perro: " + vacunado;
    }

    public List<String> getListaVisitas() {
        return listaVisitas;
    }

    public void setListaVisitas(List<String> listaVisitas) {
        this.listaVisitas = listaVisitas;
    }

    public boolean isVacunado() {
        return vacunado;
    }

    public void setVacunado(boolean vacunado) {
        this.vacunado = vacunado;
    }

    public boolean vacunado(){

        return vacunado;
    }
}
