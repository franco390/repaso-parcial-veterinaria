import Model.*;
import Enum.Especies;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Veterinaria clinica = new Veterinaria();

        Perro p1 = new Perro("felipe", 2, false);
        Perro p2 = new Perro("Roco", 5, true);
        Gato g1 = new Gato("Lopez", 1, false);
        Reptil r1 =new Reptil("Joaco", 4, true, Especies.serpiente);

        p1.cargarVisita("El perro vino por una pata rota");
        System.out.println(p1);

        g1.cargarVisita("El gato vino por un vomito");
        System.out.println(g1);

        clinica.agregarAnimal(p1);
        clinica.agregarAnimal(p2);
        clinica.agregarAnimal(g1);
        clinica.agregarAnimal(r1);

        int totalPerros = clinica.cantPerros();
        System.out.println("La cantidad de perros total es: " + totalPerros);

        clinica.eliminarAnimal(p1.getId());

        System.out.println("La cantidad de perros total despues de eliminar es: " + clinica.cantPerros());

        System.out.println(clinica.mostrarAnimales());
















    }

}
