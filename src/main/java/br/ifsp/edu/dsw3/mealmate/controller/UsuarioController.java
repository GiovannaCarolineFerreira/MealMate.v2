package br.ifsp.edu.dsw3.mealmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.edu.dsw3.mealmate.model.dao.UsuarioDAO;
import br.ifsp.edu.dsw3.mealmate.model.domain.Usuario;



@Controller
@RequestMapping("/usuarios")
public class UsuarioController {
    @Autowired
    UsuarioDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/usuario/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/usuario/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Usuario usuario) {
        dao.save(usuario);
        return "redirect:/usuario/cadastrar";
    }
}
