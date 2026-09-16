package screenmatch.src;
public class App {
    public static void main(String[] args) throws Exception {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O poderoso chefão";
        meuFilme.anoDeLancamento = 1970;
        meuFilme.duracaoEmMinutos = 180;

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
            System.out.println("Média das avaliações: " + meuFilme.pegaMedia());
            System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

        
    }

}
