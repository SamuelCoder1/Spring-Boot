package com.riwi.eventos.service.interfaces;


import com.riwi.eventos.models.Eventos;
import com.riwi.eventos.service.CRUD.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IEventoService extends
        Save<Eventos>,
        ReadById<Eventos, String>,
        ReadAll<Eventos>,
        Delete<String>{

    Page<Eventos> readByPages(Pageable pageable);
}
