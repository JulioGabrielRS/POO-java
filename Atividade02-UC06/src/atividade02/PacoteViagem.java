package atividade02;
public class PacoteViagem {
    private Transporte transporte;
    private Hospedagem hospedagem;
    private String destino;
    private int quantidadeDias;

    public PacoteViagem(Transporte transporte, Hospedagem hospedagem, String destino, int quantidadeDias) {
        this.transporte = transporte;
        this.hospedagem = hospedagem;
        this.destino = destino;
        this.quantidadeDias = quantidadeDias;
    }

    public double calcularTotalPacote(double margemLucro, double taxasAdicionais) {
        double totalTransporte = transporte.getValor();
        double totalHospedagem = hospedagem.calcularTotalHospedagem(quantidadeDias);
        double totalComMargem = totalHospedagem + totalTransporte + (totalTransporte * (margemLucro / 100)) + taxasAdicionais;
        return totalComMargem;
    }
    public String getDestino() {
        return destino;  
    }
}

