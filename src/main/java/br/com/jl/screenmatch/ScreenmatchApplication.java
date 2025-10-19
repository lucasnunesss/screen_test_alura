package br.com.jl.screenmatch;

import br.com.jl.screenmatch.model.DadosSerie;
import br.com.jl.screenmatch.model.DadosEpisodio;
import br.com.jl.screenmatch.model.DadosTemporada;
import br.com.jl.screenmatch.service.ConsumoApi;
import br.com.jl.screenmatch.service.CoverteDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.util.List;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		var consumoApi = new ConsumoApi();
		var json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&apikey=d4daf175");
	//	System.out.println(json);
	//	json = consumoApi.obterDados("https://coffee.alexflipnote.dev/random.json");
		//System.out.println(json);
		CoverteDados conversor = new CoverteDados();
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
		//System.out.println(dados);

		json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&Season=1&episode=2&apikey=d4daf175");
		DadosEpisodio dadosEpisodio = conversor.obterDados(json, DadosEpisodio.class);
		// System.out.println(dadosEpisodio);

		List<DadosTemporada> temporadas = new ArrayList<>();

		for (int i = 1; i<=dados.totalTemporadas; i++){
			json = consumoApi.obterDados("https://www.omdbapi.com/?t=gilmore+girls&season=" + i + "&apikey=d4daf175");
			DadosTemporada dadosTemporada = conversor.obterDados(json, DadosTemporada.class);
			temporadas.add(dadosTemporada);
		}
		temporadas.forEach(System.out::println);
	}
}
