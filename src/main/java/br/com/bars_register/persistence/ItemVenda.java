package br.com.bars_register.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ItemVenda {
    @ManyToOne
    @MapsId("venda_id")
    @JoinColumn(name = "venda_id")
    private Venda venda;
    
    @ManyToOne
    @MapsId("produto_id")
    @JoinColumn(name = "produto_id")
    private Produto produto;

    @Column(nullable = false)
    private int quantidade;
}
