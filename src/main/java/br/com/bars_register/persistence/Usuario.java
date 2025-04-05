package br.com.bars_register.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String nome;

    @Column(name = "tipo_usuario", nullable = false)
    private String tipoUsuario;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private boolean status;

    @Column(nullable = false)
    private String login;

    @Column(nullable = false)
    private String senha;
}
