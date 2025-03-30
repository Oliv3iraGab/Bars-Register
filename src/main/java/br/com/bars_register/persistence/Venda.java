package br.com.bars_register.persistence;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Venda {
    private int id;
    private LocalDateTime dataVenda;
    private double total;
    private String TipoPagamento;
    private Produto produtos;
}
