package com.riwi.eventos.repositories;

import com.riwi.eventos.models.Eventos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventoRepository extends JpaRepository<Eventos, String> {
}
