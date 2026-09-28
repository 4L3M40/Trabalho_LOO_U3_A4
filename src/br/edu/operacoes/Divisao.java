package br.edu.operacoes;

public class Divisao extends OperacaoMatematica {

    @Override
    public double calcular(double a, double b) throws Exception {
        if (b == 0) {
            throw new DivisaoPorZeroException();
        }
        return a / b;
    }
}
