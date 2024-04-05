package Classes;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeAnimal {
    List<Animal> listaAnimais;
    
    //Metodos

    public GerenciadorDeAnimal(List<Animal> listaAnimais) {
        this.listaAnimais = listaAnimais;
    }
    
    public void addAnimal(Animal animal){
        listaAnimais.add(animal);
    }
    
    public boolean removeAnimal(String nome){
        for(Animal a : listaAnimais){
            if(a.getNome().equalsIgnoreCase(nome)){
                listaAnimais.remove(a);
                System.out.println("Animal removido da lista!");
                return true;
            }
        }
        System.out.println("Animal nao encontrado!");
        return false;
    }
    
    public Animal buscarAnimal(Animal animal){
        for(Animal a : listaAnimais){
            if(a.getNome().equals(animal)){
                System.out.println("Animal econtrado!");
                return a;
            }
        }
        System.out.println("Animal nao encontrado");
        return null;
    }
    
    public void printAnimais(){
        String write;
        int i = 0;
        for(Animal a : listaAnimais){
            write = a.toString();
            System.out.println("[" + i + "]");
            System.out.println(write);
            i++;
        }
    }
    
    
    
}
