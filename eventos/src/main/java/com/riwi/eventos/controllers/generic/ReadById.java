package com.riwi.eventos.controllers.generic;

public interface ReadById<Entity, ID> {
    public Entity readById(ID id);
}
