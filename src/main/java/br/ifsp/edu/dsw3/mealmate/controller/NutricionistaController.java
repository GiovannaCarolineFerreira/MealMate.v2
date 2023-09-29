package br.ifsp.edu.dsw3.mealmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.edu.dsw3.mealmate.model.dao.NutricionistaDAO;
import br.ifsp.edu.dsw3.mealmate.model.domain.Nutricionista;



@Controller
@RequestMapping("/nutricionistas")
public class NutricionistaController {
    @Autowired
    NutricionistaDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/nutricionista/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/nutricionista/lista";
    }

}