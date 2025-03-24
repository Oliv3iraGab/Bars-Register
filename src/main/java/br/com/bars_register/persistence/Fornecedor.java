package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Fornecedor {
    private int id;
    private String nome;
    private String contato;
    private String cnpj_cpf;
}
