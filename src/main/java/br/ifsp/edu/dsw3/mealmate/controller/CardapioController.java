package br.ifsp.edu.dsw3.mealmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.edu.dsw3.mealmate.model.dao.CardapioDAO;
import br.ifsp.edu.dsw3.mealmate.model.domain.Cardapio;



@Controller
@RequestMapping("/cardapios")
public class CardapioController {
    @Autowired
    CardapioDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/cardapio/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/cardapio/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Cardapio cardapio) {
        dao.save(cardapio);
        return "redirect:/cardapio/cadastrar";
    }
}
