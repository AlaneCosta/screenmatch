import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMInutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(7);
        meuFilme.avalia(9.7);
        System.out.println("Total das avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie Friends = new Serie();
        Friends.setNome("Friends");
        Friends.setAnoDeLancamento(1994);
        Friends.setDuracaoEmMInutos(5000);
        Friends.setTemporadas(10);
        Friends.setEpisodiosPorTemporada(10);
    }
}
