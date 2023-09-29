package br.ifsp.edu.dsw3.mealmate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ifsp.edu.dsw3.mealmate.model.dao.ReservaDAO;
import br.ifsp.edu.dsw3.mealmate.model.domain.Reserva;

@Controller
@RequestMapping("/reserva")
public class ReservaController {
    @Autowired
    ReservaDAO dao;

    @GetMapping("/cadastrar")
    public String cadastrar() {
        return "/reserva/cadastro";
    }

    @GetMapping("/listar")
    public String listar() {
        return "/reserva/lista";
    }

    @PostMapping("/salvar")
    public String salvar(Reserva reserva) {
        dao.save(reserva);
        return "redirect:/reserva/cadastrar";
    }
}
