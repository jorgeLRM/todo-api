package org.mycompany.todoapp.mapper;

public interface IMapper<I, O> {
    O map(I in);
}
