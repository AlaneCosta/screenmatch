import br.com.alura.screenmatch.calculo.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculo.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1978);
        meuFilme.setDuracaoEmMInutos(180);
        System.out.println("Duração do filme: " + meuFilme.getDuracaoEmMInutos());

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
        Friends.setMinutosPorEpisodio(50);
        System.out.println("Tempo para maratonar Friends: " + Friends.getDuracaoEmMInutos() + " minutos");

        Filme outroFilme = new Filme();
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2012);
        outroFilme.setDuracaoEmMInutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(Friends);
        System.out.println("Tempo para maratonar minha lista de filmes e séries: " + calculadora.getTempoTotal() + " minutos");

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(Friends);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
    }
}
