package Model;

import java.util.HashMap;
import java.util.Map;

public class Veterinaria {

    private Map<String, Animal> mapaAnimales;

    public Veterinaria() {
        this.mapaAnimales = new HashMap<>();
    }

    public boolean agregarAnimal(Animal nuevoAnimal){

        if (mapaAnimales.containsKey(nuevoAnimal.getId())){
            return false;
        }

        mapaAnimales.put(nuevoAnimal.getId(), nuevoAnimal);
        return true;
    }

    public boolean eliminarAnimal(String id){

        if(!mapaAnimales.containsKey(id)){
            return false;
        }
        mapaAnimales.remove(id);
        return true;
    }

    public boolean esterilizarGato(String id){

        Animal animal = mapaAnimales.get(id);

        if (animal instanceof Gato gato){

            gato.setEsterelizado(true);
            return true;
        }

        return false;
    }

    public boolean aplicarVacuna(String id){

        Animal animal = mapaAnimales.get(id);

        if(animal instanceof Perro perro){

            perro.setVacunado(true);
            return true;
        }
        return false;
    }

    public boolean marcarVenenoso(String id){

        Animal animal = mapaAnimales.get(id);

        if (animal instanceof Reptil reptil){

            reptil.setVenenoso(true);
            return true;
        }
        return false;

    }

    public boolean cargarVisita(String id, String detalle){

        Animal animal = mapaAnimales.get(id);

        if(animal instanceof Perro perro){
            perro.cargarVisita(detalle);
            return true;
        }
        else {
            if(animal instanceof Gato gato){
                gato.cargarVisita(detalle);
                return true;
            }
        }
        return false;
    }

    public int cantPerros(){
        int contador = 0;

        for (Animal a : mapaAnimales.values()){

            if(a instanceof Perro){
                contador++;
            }

        }
        return contador;
    }

    public String mostrarAnimales(){

        StringBuilder sb = new StringBuilder();

        for (Animal a : mapaAnimales.values()){

            sb.append(a.toString()).append("\n");

        }
        return sb.toString();

    }
}
