package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class Relatorio {
    private int id;
    private static final LocalDateTime dataGeracao = LocalDateTime.now();
    private LocalDateTime dataInicial;
    private LocalDateTime dataFinal;
    private Usuario gerador;
    private double totalVendas;
    private int quantidadeVendas;
    private Map<String, Double> vendasPorTipo;
    
    
    public double getTicketMedio() {
        return quantidadeVendas > 0 ? totalVendas / quantidadeVendas : 0;
    }
    
    public String gerarRelatorioFormatado() {
        StringBuilder sb = new StringBuilder();
        sb.append("BAR'S REGISTER - RELATÓRIO FINANCEIRO\n");
        sb.append(String.format("Período: %s - %s\n\n", dataInicial, dataFinal));
        
        sb.append(String.format("Total de Vendas: R$ %.2f\n", totalVendas));
        sb.append(String.format("Quantidade de Vendas: %d\n", quantidadeVendas));
        sb.append(String.format("Ticket Médio: R$ %.2f\n\n", getTicketMedio()));
        
        sb.append("VENDAS POR TIPO DE PAGAMENTO\n");
        vendasPorTipo.forEach((tipo, valor) -> 
            sb.append(String.format("%s: R$ %.2f\n", tipo, valor))
        );
        
        sb.append("----------------------------------------\n");
        sb.append(String.format("Gerado por: %s\n", gerador.getNome()));
        sb.append(String.format("Data: %s", dataGeracao));
        
        return sb.toString();
    }
}
