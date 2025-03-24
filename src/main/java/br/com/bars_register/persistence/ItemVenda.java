package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemVenda {
    private int id_venda;
    private int id_produto;
    private int quantidade;
}
