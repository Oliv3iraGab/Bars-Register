package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

/**
 *
 * @author limag
 */
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    private int id;
    private String nome;
    private String email;
    private String tipo;

    public boolean autenticar() {
        return false;
    }
}
