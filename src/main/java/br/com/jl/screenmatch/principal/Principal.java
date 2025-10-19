package br.com.jl.screenmatch.principal;

import java.util.Scanner;

public class Principal {
    private Scanner leitura = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private CoverteDados conversor = new CoverteDados();
    private final String ENDERECO = "https://www.omdbapi.com/?t=";
        private final String API_KEY = "&apikey=d4daf175";
    public void exibeMenu(){
       
        
        
        System.out.println("Digite o nome da série para busca");
        var nomeSerie = leitura.nextLine();
  
		var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ", "+") + API_KEY);
   
		DadosSerie dados = conversor.obterDados(json, DadosSerie.class);
        System.out.println(dados);
    }
}
