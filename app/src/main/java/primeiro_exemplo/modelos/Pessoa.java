package primeiro_exemplo.modelos;

public class Pessoa {
    //Atributos
    public String nome;
    public int idade;

    //Métodos
    public boolean verificarMarioridade(){
        return this.idade >= 18;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade(){
        return this.idade;
    }
}
