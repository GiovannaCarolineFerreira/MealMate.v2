package br.ifsp.edu.dsw3.mealmate.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.edu.dsw3.mealmate.model.domain.Cardapio;

public interface CardapioDAO extends JpaRepository<Cardapio, Long> {

}
