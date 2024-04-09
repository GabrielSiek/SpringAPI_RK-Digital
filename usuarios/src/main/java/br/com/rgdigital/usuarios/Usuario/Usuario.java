package br.com.rgdigital.usuarios.Usuario;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Table(name = "usuarios")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String nome, email, telefone;

    public Usuario(UsuarioDTO usuarioDTO) {
        this.nome = usuarioDTO.nome();
        this.email = usuarioDTO.email();
        this.telefone = usuarioDTO.telefone();
    }
}
