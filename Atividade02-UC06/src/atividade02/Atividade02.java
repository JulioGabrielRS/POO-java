package atividade02;
    import java.util.Scanner;
public class Atividade02 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

        System.out.println("-------Cadastro de Venda-------");
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();

        System.out.print("Forma de pagamento: ");
        String formaPagamento = scanner.nextLine();

        System.out.println("-------Cadastro de Pacote de Viagem-------");
        System.out.print("Destino: ");
        String destino = scanner.nextLine();

        System.out.print("Quantidade de dias: ");
        int quantidadeDias = scanner.nextInt();

        System.out.print("Valor do transporte em dólar: ");
        double valorTransporte = scanner.nextDouble();

        System.out.print("Valor da diária da hospedagem em dólar: ");
        double valorDiariaHospedagem = scanner.nextDouble();

        System.out.print("Margem de lucro (%): ");
        double margemLucro = scanner.nextDouble();

        System.out.print("Taxas adicionais em dólar: ");
        double taxasAdicionais = scanner.nextDouble();

        System.out.print("Cotação do dólar: ");
        double cotacaoDolar = scanner.nextDouble();

        Transporte transporte = new Transporte("Aéreo", valorTransporte);
        Hospedagem hospedagem = new Hospedagem("Hotel", valorDiariaHospedagem);
        PacoteViagem pacoteViagem = new PacoteViagem(transporte, hospedagem, destino, quantidadeDias);
        double valorTotalPacote = pacoteViagem.calcularTotalPacote(margemLucro, taxasAdicionais);

        Venda venda = new Venda(nomeCliente, formaPagamento, pacoteViagem);

        System.out.println("\nInformações do Pacote de Viagem:");
        System.out.println("Destino: " + pacoteViagem.getDestino());
        System.out.println("Valor Total do Pacote em Dólar: " + valorTotalPacote);

        System.out.print("\nInforme a margem de lucro (%) para a venda: ");
        double margemLucroVenda = scanner.nextDouble();

        System.out.println("\n-------Informações da Venda-------");
        System.out.println("Cliente: " + venda.getNomeCliente());
        System.out.println("Forma de Pagamento: " + venda.getFormaPagamento());
        System.out.println("Destino do Pacote: " + venda.getPacoteViagem().getDestino());
        System.out.println("Valor Total do Pacote em Dólar: " + valorTotalPacote);
        System.out.println("Valor Total do Pacote em Reais: " + venda.converterDolarParaReal(valorTotalPacote, cotacaoDolar));
    }
}