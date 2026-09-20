package Model;
import Enum.Especies;
import Interface.IAnimal;

public final class Reptil extends Animal {

    private Especies reptiles;
    private boolean venenoso;

    public Reptil(String nombre, int edad, boolean venenoso, Especies reptiles) {
        super(nombre, edad);
        this.venenoso = venenoso;
        this.reptiles = reptiles;
    }

    public Especies getReptiles() {
        return reptiles;
    }

    public void setReptiles(Especies reptiles) {
        this.reptiles = reptiles;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "venenoso=" + venenoso +
                ", tipo de reptil=" + reptiles;

    }

    @Override
    public String alimentarse() {
        return "El reptil " + getNombre() + "se alimento.";
    }

    @Override
    public String revisado() {
        return "El reptil: " + getNombre() + "fue revisado.";
    }
}
