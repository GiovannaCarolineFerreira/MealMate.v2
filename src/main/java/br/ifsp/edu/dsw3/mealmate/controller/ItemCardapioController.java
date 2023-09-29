package br.ifsp.edu.dsw3.mealmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import br.ifsp.edu.dsw3.mealmate.model.dao.ItemCardapioDAO;
import br.ifsp.edu.dsw3.mealmate.model.domain.ItemCardapio;

@Controller
@RequestMapping("/itens")
public class ItemCardapioController {
    @Autowired
    ItemCardapioDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar(ItemCardapio itemCardapio) {
        return "/item/cadastro";
    }

    @GetMapping("/listar")
    public String listar(ModelMap map) {
        map.addAttribute("item", dao.findAll());
        return "/item/lista";
    }

    @PostMapping("/salvar")
    public String salvar(ItemCardapio itemCardapio) {
        dao.save(itemCardapio);
        return "redirect:/item/cadastrar";
    }
}
