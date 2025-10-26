package br.com.jl.screenmatch.exx;

import br.com.jl.screenmatch.ScreenmatchApplication;

import java.util.List;

@FunctionalInterface
interface Multiplicar{
    int multiplicacao(int a, int b);
}

@FunctionalInterface
interface Primos{
    boolean verificar(int a);
}

@FunctionalInterface
interface Letra{
    String letra(String a);
}

@FunctionalInterface
interface VerificarPalindromo{
    boolean verificarPalindromo(String str);
}

@FunctionalInterface
interface MultiplicarPor3{
    void multi(List<Integer> lista);
}

@FunctionalInterface
interface Ordenar{
    void ms(List<String> listaPalavras);
}

@FunctionalInterface
interface Dividir{
    int dividir(int a, int b);
}
public class Exx02 {
    public void Main(){
        Multiplicar multiplicar = (int a, int b) -> a * b;

        int resultado = multiplicar.multiplicacao(2, 2);

    /*
    Primos primo = (int a) -> {
        if (a <= 1) return false;
        for (int i = 2; i < a; i++){
            if (a % i == 0) return false;
        }
        return true;
    };

    boolean resultado2 = primo.verificar(15);
    System.out.println(resultado2);

    Letra letra = String::toUpperCase;

    String resultado3 = letra.letra("Teste");
    System.out.println(resultado3);



    VerificarPalindromo verificar = (String s) -> {
        String n = new StringBuilder(s).reverse().toString();
        return s.equals(n);

    };

    boolean verificarPal = verificar.verificarPalindromo("banana");

    System.out.println(verificarPal);


    MultiplicarPor3 mult = (lista) -> {
        lista.replaceAll(n -> n * 3);
    };

    List<Integer> numb = new ArrayList<>(List.of(1,2,3,4,5));
    mult.multi(numb);
    System.out.println(numb);



    Ordenar ord = (lista) -> {
        lista.sort(String::compareToIgnoreCase);

    };

    List<String> palavras = new ArrayList<>(List.of("Churros", "Banana", "Bacon"));
    ord.ms(palavras);
    System.out.println(palavras);

     */
        Dividir div = (a, b) -> {
            if(b == 0){
                throw new ArithmeticException();
            }

            return a/b;
        };

        int divir = div.dividir(1,0);
        System.out.println(divir);
    }

}
