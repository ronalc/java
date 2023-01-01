package testes;

import dia1.Converter;

public class TesteDia1 {
    public static void main(String[] args) {

        // Desafio dia 01

        Converter c  = new Converter();

        int resposta = 0;

        resposta = c.converterIdadeEmDias(25,2023);

        System.out.printf("A idade em dias é: %d dias" , resposta);

        // --------------------------------------------------


    }

}