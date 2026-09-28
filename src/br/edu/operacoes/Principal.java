package br.edu.operacoes;

import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class Principal {

    public static void main(String[] args) {

        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));

        OperacaoMatematica soma = new Soma();
        OperacaoMatematica divisao = new Divisao();

        try {
            double resultadoSoma = soma.calcular(10, 5);
            System.out.println("Resultado da soma: " + resultadoSoma);

            double resultadoDivisao = divisao.calcular(10, 2);
            System.out.println("Resultado da divisão: " + resultadoDivisao);

            // Tentativa de divisão por zero, para forçar a exceção personalizada
            double resultadoDivisaoZero = divisao.calcular(10, 0);
            System.out.println("Resultado da divisão: " + resultadoDivisaoZero);

        } catch (DivisaoPorZeroException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
    }
}
