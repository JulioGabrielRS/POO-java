package atividade02;
public class Venda {
    private String nomeCliente;
    private String formaPagamento;
    private PacoteViagem pacoteViagem;

    public Venda(String nomeCliente, String formaPagamento, PacoteViagem pacoteViagem) {
        this.nomeCliente = nomeCliente;
        this.formaPagamento = formaPagamento;
        this.pacoteViagem = pacoteViagem;
    }

    public double converterDolarParaReal(double valorEmDolar, double cotacaoDolar) {
        return valorEmDolar * cotacaoDolar;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public PacoteViagem getPacoteViagem() {
        return pacoteViagem;
    }
}
