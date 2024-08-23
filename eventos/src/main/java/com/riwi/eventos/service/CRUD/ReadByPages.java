package com.riwi.eventos.service.CRUD;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ReadByPages<Entity>{
    Page<Entity> readAll(Pageable pageable);
}
