package Classes;

/**
"cod": 201
"nome": "Toto",
  "especie": "Cachorro",
  "raca": "Golden Retriever",
  "idade": 3,
  "peso": 30
*/
public class Animal {
    private String cod;
    private String nome;
    private String raca;
    private String especie;
    private int idade;
    private double peso;
    
    //Metodos
    
    public Animal() {
        this.cod = "";
        this.nome = "";
        this.raca = "";
        this.especie = "";
        this.idade = 0;
        this.peso = 0.0;
    }
    
    public Animal(String cod, String nome, String raca, String especie, int idade, double peso) {
        this.cod = cod;
        this.nome = nome;
        this.raca = raca;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }
    
    public void copia(Animal copia) {
        this.cod = copia.cod;
        this.nome = copia.nome;
        this.raca = copia.raca;
        this.especie = copia.especie;
        this.idade = copia.idade;
        this.peso = copia.peso;
    }

    @Override
    public String toString() {
        return "Animal{ cod: " + cod 
                + ", nome: " + nome 
                + ", raca: " + raca 
                + ", especie: " + especie
                + ", idade: " + idade 
                + ", peso: " + peso + '}';
    }
    
    //Getters and Setters

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
