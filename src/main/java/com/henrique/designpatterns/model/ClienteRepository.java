package com.henrique.designpatterns.model;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<Cliente, Long> {
}
