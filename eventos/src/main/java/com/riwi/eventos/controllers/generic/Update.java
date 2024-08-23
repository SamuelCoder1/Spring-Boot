package com.riwi.eventos.controllers.generic;

import com.riwi.eventos.models.Eventos;
import org.springframework.http.ResponseEntity;

public interface Update<ID, Entity> {
    public ResponseEntity<Eventos> update(ID id, Entity entity);
}
