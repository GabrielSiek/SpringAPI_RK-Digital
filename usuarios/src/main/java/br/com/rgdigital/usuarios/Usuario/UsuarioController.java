package br.com.rgdigital.usuarios.Usuario;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping
    public List<Usuario> getAll(){

        List<Usuario> usuarios = usuarioRepository.findAll();
        return usuarios;
    }

    @PostMapping
    public void saveUsuario(@RequestBody UsuarioDTO usuarioDTO){
        Usuario newUser = new Usuario(usuarioDTO);
        usuarioRepository.save(newUser);
    }

}
