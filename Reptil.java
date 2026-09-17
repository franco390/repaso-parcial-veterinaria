package Model;

public final class Reptil extends Animal {

    private String especie;
    private boolean venenoso;

    public Reptil(String nombre, String idVeterinaria, int edad, String especie, boolean venenoso) {
        super(nombre, idVeterinaria, edad);
        this.especie = especie;
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return "Nombre: " + getNombre() + "Edad: " + getEdad() + "Numero de registro: " + getIdVeterinaria() + "Especie: " + especie + "Es venenoso: " + venenoso;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    public boolean venenoso(){

        return venenoso;
    }


}
