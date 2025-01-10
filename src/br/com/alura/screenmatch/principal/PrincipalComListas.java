package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 1978);
        meuFilme.avalia(7);
        Serie Friends = new Serie("Friends", 1994);
        meuFilme.avalia(5);
        Filme outroFilme = new Filme("Avatar", 2012);
        meuFilme.avalia(8);
        var filmeDaAlane = new Filme("Divertidamente", 2014);
        meuFilme.avalia(9);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDaAlane);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(Friends);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação" + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Silva");
        buscaPorArtista.add("Jacqueline Silva");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
    }
}
