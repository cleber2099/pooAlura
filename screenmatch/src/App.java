package screenmatch.src;
public class App {
    public static void main(String[] args) throws Exception {
 Filme meuFilme = new Filme();
 meuFilme.nome = "O poderoso chefão";
 meuFilme.anoDeLancamento = 1970;
 meuFilme.duracaoEmMinutos = 180;
 
 System.out.println("Nome do filme: " + meuFilme.nome);
 System.out.println("Ano de lançamento: " + meuFilme.anoDeLancamento);
 System.out.println("Duração em minutos: " + meuFilme.duracaoEmMinutos);
    }

}
