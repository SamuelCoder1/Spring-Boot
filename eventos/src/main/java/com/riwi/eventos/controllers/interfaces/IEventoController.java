package com.riwi.eventos.controllers.interfaces;


import com.riwi.eventos.controllers.generic.*;
import com.riwi.eventos.models.Eventos;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface IEventoController extends
        Create<Eventos>,
        Delete<String>,
        ReadAll<Eventos>,
        ReadById<Eventos, String>,
        Update<String, Eventos> {

    ResponseEntity<List<Eventos>> readByPages(int page, int size);
}
