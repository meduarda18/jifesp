package br.edu.ifpb.aps.jifesp.service;

import java.util.List;

public interface CrudService<T, ID> {
    T save(T entity);
    T update(ID id, T entity);
    void delete(ID id);
    List<T> findAll();
}
