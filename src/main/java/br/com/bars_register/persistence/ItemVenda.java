package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemVenda {
    private int venda_id;
    private int produto_id;
    private int quantidade;
}
