package primeiro_exemplo;
 
import primeiro_exemplo.modelos.Pessoa;
 
public class Hello {
    public static void main(String[] args) {
        int cont = 10;
        String nome = "Marco";
        System.out.println("Olá Mundo!!!");
 
        System.out.println(cont + " : " + nome);
 
        Pessoa p1 = new Pessoa();
 
        p1.setNome = ("Gabriel");
        p1.setIdade = (17);
 
        System.out.println(p1.getNome() + " : " + p1.getIdade());
 
        Pessoa p2 = p1;
 
        p2.nome = "Munhoz";
       
        System.out.println(p2.nome);
        System.out.println(p1.nome);
 
        Pessoa p3 = new Pessoa();
        p3.nome = "Clodoaldo";
        p3.idade = 30;
 
        System.out.println(p1.verificarMarioridade());
        System.out.println(p3.verificarMarioridade());
 
    }
}