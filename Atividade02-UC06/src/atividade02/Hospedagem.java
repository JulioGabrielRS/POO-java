package atividade02;
public class Hospedagem {
    private String descricao;
    private double valorDiaria;

    public Hospedagem(String descricao, double valorDiaria) {
        this.descricao = descricao;
        this.valorDiaria = valorDiaria;
    }

    public double calcularTotalHospedagem(int numeroDias) {
        return valorDiaria * numeroDias;
    }
}

