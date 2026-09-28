package br.edu.operacoes;

public class DivisaoPorZeroException extends Exception {

    public DivisaoPorZeroException() {
        super("Não é possível dividir por zero.");
    }
}
