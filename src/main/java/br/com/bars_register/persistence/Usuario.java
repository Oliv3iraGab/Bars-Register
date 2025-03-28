package br.com.bars_register.persistence;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class Usuario {

    private int id;
    private String nome;
    private String tipoUsuario;
    private String email;
    private boolean status;
    private String login;
    private String senha;
}
