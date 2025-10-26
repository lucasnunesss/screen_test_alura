package br.com.jl.screenmatch.principal;

import br.com.jl.screenmatch.model.DadosEpisodio;
import br.com.jl.screenmatch.model.DadosSerie;
import br.com.jl.screenmatch.model.DadosTemporada;
import br.com.jl.screenmatch.service.ConsumoApi;
import br.com.jl.screenmatch.service.CoverteDados;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private CoverteDados conversor = new CoverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
        private final String API_KEY = "&apikey=d4daf175";
    public void exibeMenu(){
       
        
        /*
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
  
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
   
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);

        List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i<=dados.totalTemporadas(); i++){
			json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + "&season=" + i + API_KEY);
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);

     

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

         */

        List<String> nomes = Arrays.asList("Ana", "Leticia", "Lucas", "Paulo", "Roberto"); /* fluxo de dados */
        nomes.stream()
                .sorted()
                .forEach(System.out::println);

        /*
        (parametro) -> expressao (o que vai acontecer dado a esse parametro)
        Temporada((parametro é cada uma das temporadas))
        Episodios((parametro é cada episodio))
         */
    }
}
