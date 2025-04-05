package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import br.com.bars_register.DAOClasses.VendaDAO;

import java.time.format.DateTimeFormatter;

@Getter
@Setter
public class Relatorio {

    private int id;
    private static final LocalDateTime dataGeracao = LocalDateTime.now();
    private Usuario gerador;
    private double totalVendas;
    private int quantidadeVendas;
    private Map<String, Double> vendasPorTipo;

    public double getTicketMedio() {
        return quantidadeVendas > 0 ? totalVendas / quantidadeVendas : 0;
    }

    public String gerarRelatorioFormatado(LocalDateTime dataInicial, LocalDateTime dataFinal) {
        calcularDados(dataInicial, dataFinal);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        StringBuilder sb = new StringBuilder();
        sb.append("BAR'S REGISTER - RELATÓRIO FINANCEIRO\n");
        sb.append(String.format("Período: %s - %s\n\n",
                dataInicial.format(formatter),
                dataFinal.format(formatter)));

        sb.append(String.format("Total de Vendas: R$ %.2f\n", totalVendas));
        sb.append(String.format("Quantidade de Vendas: %d\n", quantidadeVendas));
        sb.append(String.format("Ticket Médio: R$ %.2f\n\n", getTicketMedio()));

        sb.append("VENDAS POR TIPO DE PAGAMENTO\n");
        if (vendasPorTipo != null) {
            vendasPorTipo.forEach((tipo, valor)
                    -> sb.append(String.format("%s: R$ %.2f\n", tipo, valor))
            );
        } else {
            sb.append("Nenhuma venda registrada\n");
        }

        sb.append("----------------------------------------\n");
        sb.append(String.format("Gerado por: %s\n", gerador != null ? gerador.getNome() : "Sistema"));
        java.time.format.DateTimeFormatter formatterExit = java.time.format.DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        sb.append(String.format("Data: %s", dataGeracao.format(formatterExit)));

        return sb.toString();
    }

    public void calcularDados(LocalDateTime dataInicial, LocalDateTime dataFinal) {
        VendaDAO vendaDAO = new VendaDAO();
        List<Venda> vendas = vendaDAO.buscarPorPeriodo(dataInicial, dataFinal);

        if (vendas != null && !vendas.isEmpty()) {
            this.totalVendas = vendas.stream()
                    .mapToDouble(Venda::getTotal)
                    .sum();

            this.quantidadeVendas = vendas.size();

            this.vendasPorTipo = vendas.stream()
                    .collect(Collectors.groupingBy(
                            Venda::getTipoPagamento,
                            Collectors.summingDouble(Venda::getTotal)
                    ));
        } else {
            this.totalVendas = 0;
            this.quantidadeVendas = 0;
            this.vendasPorTipo = new HashMap<>();
        }
    }
}
