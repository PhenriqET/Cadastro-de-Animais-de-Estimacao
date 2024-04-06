package Classes;
import java.util.List;
import java.util.ArrayList;

public class GerenciadorDeAnimal {
    List<Animal> listaAnimais;
    
    //Metodos

    public GerenciadorDeAnimal() {
        this.listaAnimais = new ArrayList<>();
    }
    
    public void addAnimal(Animal animal){
        listaAnimais.add(animal);
    }
    
    public boolean removeAnimal(String cod){
        for(Animal a : listaAnimais){
            if(a.getCod().equalsIgnoreCase(cod)){
                listaAnimais.remove(a);
                System.out.println("Animal removido da lista!");
                return true;
            }
        }
        System.out.println("Animal nao encontrado!");
        return false;
    }
    
    public Animal buscarAnimal(String cod){
        for(Animal a : listaAnimais){
            if(a.getCod().equals(cod)){
                System.out.println("Animal econtrado!");
                return a;
            }
        }
        System.out.println("Animal nao encontrado");
        return null;
    }
    
    public void atualizaAnimal(String codAntigo, Animal animalNovo){
        for(Animal a : listaAnimais){
            if(a.getCod().equals(codAntigo)){
                a.copia(animalNovo);
            }
        }
    }
    
    @Override
    public String toString() {
        StringBuilder saida = new StringBuilder();
        for(Animal animal : listaAnimais){
            saida.append(animal.toString()).append("\n");
        }
        return saida.toString();
    }
    
    
    
    
    
}
