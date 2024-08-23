package com.riwi.eventos.service.CRUD;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
