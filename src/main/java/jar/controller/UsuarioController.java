package jar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jar.model.Usuario;
import jar.service.UsuarioService;

@RestController
public class UsuarioController {

    private final UsuarioService service;

    public UsuarioController(UsuarioService service) {
        this.service = service;
    }

    @GetMapping("/ola")
    public String ola() {
        return "API de usuários funcionando!";
    }

    @PostMapping("/usuarios")
    public Usuario cadastrar(@RequestBody Usuario usuario) {
        return service.salvar(usuario);
    }
}
