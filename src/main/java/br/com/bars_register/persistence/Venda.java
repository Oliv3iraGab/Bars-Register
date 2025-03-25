package br.com.bars_register.persistence;

import java.sql.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Venda {
    private int id;
    private Date data;
    private double total;
    private String TipoPagamento;
    private Produto produtos;
}
