package br.ifsp.edu.dsw3.mealmate.model.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ifsp.edu.dsw3.mealmate.model.domain.Reserva;

public interface ReservaDAO extends JpaRepository<Reserva, Long> {

}

