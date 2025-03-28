package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Produto {
    private int id;
    private String nome;
    private double preco;
    private int estoque;
    private String acoes;
}
